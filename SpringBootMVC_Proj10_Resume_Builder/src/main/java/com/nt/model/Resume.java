package com.nt.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Resume {

	private String name;

	private String title;

	private Long mobile;

	private String mail;

	private String address;

	private String nationality ="INDIAN"; 

	private String objective;

	private String college;

	private String university;
	
	private String course;
	
	private String past_date;

	private String stream;

	private String division; 

	private String skills;

	private String project;

	private String project_title;
	
	private String hobbies;

	public LocalDate getDate() {
		return LocalDate.now();
	}
	
	
}
