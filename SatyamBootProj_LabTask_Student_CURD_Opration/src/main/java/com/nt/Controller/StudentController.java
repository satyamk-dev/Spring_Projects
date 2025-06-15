package com.nt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Student;
import com.nt.Service.StudentService;

@Controller("studContro")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	public List<Student> FatchDataController() throws Exception{
		return ss.FatchDataService();
	}
	
	public String InsertDataController(Student st) throws Exception {
		return ss.InsertDataService(st);
		
	}
	
	public String UpdateDataController(Student st) throws Exception{
		return ss.UpdateDataService(st);
	} 
	
	public String DeleteDataController(Student st)throws Exception{
		return ss.DeleteDataService(st);
	}

}
