package com.nt.DAO;

import java.util.List;

public interface IStudent {
	
	public List<Student> FatchData()throws Exception;
	public String InsertData(Student st)throws Exception;
	public String UpdateData(Student st)throws Exception;
	public String  DeleteData(Student st)throws Exception;

}
