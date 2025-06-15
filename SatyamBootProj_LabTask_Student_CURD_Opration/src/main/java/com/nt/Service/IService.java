package com.nt.Service;

import java.util.List;

import com.nt.DAO.Student;

public interface IService {
		
		public List<Student> FatchDataService()throws Exception;
		public String InsertDataService(Student st)throws Exception;
		public String UpdateDataService(Student st)throws Exception;
		public String  DeleteDataService(Student st)throws Exception;

}
