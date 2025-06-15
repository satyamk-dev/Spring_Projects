package com.nt.Runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Controller.StudentController;
import com.nt.DAO.Student;

@Component
public class Optation implements CommandLineRunner {

	@Autowired
	private StudentController control;

	@Override
	public void run(String... args) throws Exception {
		
		
   boolean key = true;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("===========Welcome DATA BASE CRUD Opration=============");
	
		while(key) {
			System.out.println();
		System.out.println("You Chose any Option for CURD Optaion");
		System.out.println("""
				Press 1 for View Table
				Press 2 for Insert Table
				Press 3 for Update Table
				Press 4 for Delete  Table Row
				Press 5 for Exit 🤠
				""");
		System.out.println();
		System.out.print("Enter ====>\t");
		int num =sc.nextInt();
		switch(num) {
		case 1:{
		List<Student> lss = control.FatchDataController();
		for(Student list: lss) {
			System.out.println(list);
		}
		break;
		}
		case 2:{
			System.out.println("You chosen Insert Option");
			System.out.print("Enter Name\t:");
			String nm = sc.next().toUpperCase();
			System.out.print("Enter Gmail\t:");
			String gm = sc.next().toLowerCase();
			System.out.print("Enter BirthDate(YYYY-MM-DD)\t\t:");
			String bd =sc.next().toString();
			Student st = new Student();
			st.setName(nm);
			st.setMail(gm);
			st.setDob(bd);
			String res =control.InsertDataController(st);
			System.out.println(res);
			break;
		}
		case 3:{
			System.out.println("You chosen Update Option");
			System.out.println("Enter Id ");
			Integer dd=  sc.nextInt();
			System.out.print("Enter Name\t:");
			String nm = sc.next().toUpperCase();
			System.out.print("Enter Gmail\t");
			String gm =sc.next().toLowerCase();
			System.out.print("Enter BirthDate(YYYY-MM-DD)\t\t:");
			String bd =sc.next().toString();
			Student st =new Student();
			st.setId(dd);
			st.setName(nm);
			st.setMail(gm);
			st.setDob(bd);
			String res =control.UpdateDataController(st);
			System.out.println(res);
			break;
		}
		case 4:{
			System.out.println("You chosen Delete Option(One Row At a time)");
			System.out.print("Enter ID\t:");
			Integer dd= sc.nextInt();
			Student st = new Student();
			st.setId(dd);
			String res =control.DeleteDataController(st);
			System.out.println(res);
			break;
		}
		case 5:{
			System.out.println("Exiting.........Thank You! ");
			key=false;
			break;
		}
		default:
			System.out.println("❌ Invalid Option! Try again.");
			
	    	}
   	     }
	}
}


