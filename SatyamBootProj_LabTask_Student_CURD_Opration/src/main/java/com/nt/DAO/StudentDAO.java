package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studRepo")
public class StudentDAO implements IStudent {

	@Autowired
	private DataSource ds;
	//SELECT ALL DATA FROM TABLE
	
	public static final String DB_SELECT_ALL_TABLE="""
			SELECT * FROM STUDENT
			""";
	
	public static final String DB_SELECT_NAME="""
			SELECT SNAME FROM STUDENT
			WHERE SID = ?
			""";
	
	//INSERT DATA TO TABLE AND ID IS AUTO INCREMENT
	public static final String DB_INSERT_DATA="""
			INSERT INTO STUDENT(SNAME,EMAIL,SDOB)
			VALUES(?,?,?)
			""";
	//UPDATE TABLE NAME,EMAIL,BIRTHDATE BY ID
	public static final String DB_UPDATE_STUDENT="""
			UPDATE STUDENT
			SET SNAME = ? , EMAIL = ? , SDOB = ?
			WHERE SID = ?
			""";
	//DELETE TABLE DATA BY ID
	public static final String DB_DELETE_TABLE_ROW="""
			DELETE FROM STUDENT 
			WHERE SID =?
			""";
//Select Query=====================================================================	
	@Override
	public List<Student> FatchData() throws Exception {
	    List<Student> ls = null;
	    try(
	    		Connection con = ds.getConnection();
	    		PreparedStatement ps = con.prepareStatement(DB_SELECT_ALL_TABLE);
	    		){
	    	try(
	    			ResultSet rs = ps.executeQuery();
	    			){
	    		ls =new ArrayList<>();
	    		while(rs.next()) {
	    			Student st= new Student();
	    			st.setId(rs.getInt("sid"));
	    			st.setName(rs.getString("sname"));
	    			st.setMail(rs.getString("email"));
	    			st.setDob(rs.getString("sdob"));
//push to all data on ArrayList	    			
	    			ls.add(st);
	    			
	    		}
	    	}catch(SQLException s) {
	    		throw s;
	    	}
	    }catch(SQLException se){
	    	throw se;
	    }
		return ls;
	}

//Insert Query=====================================================================
	@Override
	public String InsertData(Student st) throws Exception {
		
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps =con.prepareStatement(DB_INSERT_DATA);
				){
				ps.setString(1,st.getName());
				ps.setString(2, st.getMail());
				ps.setString(3, st.getDob());
				int count = ps.executeUpdate();
				//con.commit(); AutoCommit is True 
				if(count==1) {
					return"Student Table Data Inserted😀🚀\t\t"+st.getName()+"\n";
				       }else {
					           return"Inserted Failed🛠";
				           }
		}catch(SQLException se) {
			throw se;
		}
	}
// Update Data====================================================================
	@Override
	public String UpdateData(Student st) throws Exception {
		try(
				Connection con =ds.getConnection();
				PreparedStatement ps =con.prepareStatement(DB_UPDATE_STUDENT);
				){
	
			ps.setString(1, st.getName());
			ps.setString(2, st.getMail());
			ps.setString(3, st.getDob());
			ps.setInt(4, st.getId());
			int count = ps.executeUpdate();
			//con.commit(); AutoCommit is True 
			if(count==1) {
				return "STUDENT TABLE UPDATED\t"+st.getName()+"\n";
						}else {
							return"UPDATE FAILED";
						}
		}catch(SQLException se) {
			throw se;
		}
	}
//Delete Table====================================================================
	@Override
	public String DeleteData(Student st) throws Exception {
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps1 = con.prepareStatement(DB_SELECT_NAME);
				PreparedStatement ps = con.prepareStatement(DB_DELETE_TABLE_ROW);
				){
			ps1.setInt(1,st.getId());
			try(
					ResultSet rs = ps1.executeQuery();
					){
				if(rs.next()) {
					st.setName(rs.getString("sname"));
				}else {
					System.out.println("ID is Wrong");
				}
				
			}catch(SQLException s) {
				throw s;
			}
			ps.setInt(1,st.getId());
			int count = ps.executeUpdate();
			//con.commit(); AutoCommit is True 
			if(count==1) { 
				return "1 ROW DELETED\t\t"+"ID\t:"+st.getId()+"\t"+"\sName\t:"+st.getName()+"\n";
			}else {
				return " FAILED DELETING \t\t"+"ID\t:"+st.getId()+"\t"+"\sName\t:"+st.getName()+"\n";
			}
		}catch(SQLException se) {
			throw se; 
		}
	}
}
