package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.Student;
import com.nt.DAO.StudentDAO;

@Service("studService")
public class StudentService implements IService {
	
	@Autowired
	private StudentDAO sd;

	@Override
	public List<Student> FatchDataService() throws Exception {
		
		return sd.FatchData();
	}

	@Override
	public String InsertDataService(Student st) throws Exception {
		
		return sd.InsertData(st);
	}

	@Override
	public String UpdateDataService(Student st) throws Exception {
		
		return sd.UpdateData(st);
	}

	@Override
	public String DeleteDataService(Student st) throws Exception {
		
		return sd.DeleteData(st);
	}

}
