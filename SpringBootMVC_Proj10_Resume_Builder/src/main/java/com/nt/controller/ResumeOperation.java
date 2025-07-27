package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.nt.SpringBootMvcProj10ResumeBuilderApplication;
import com.nt.model.Resume;

@Controller
public class ResumeOperation {

	@GetMapping
	public String HomePage() {
		System.out.println("ResumeOperation.HomePage()");
		return"Home";
	}
	
	@GetMapping("/resume")
	public String ResumeForm(Model model) {
		System.out.println("ResumeOperation.ResumeForm()"+model);
		model.addAttribute("rusm",new Resume());
		return"Resume";
	}
	
	@PostMapping("/report")
	public String ResumeReport(@ModelAttribute("rusm") Resume r , Map<String, Object> map) {
		System.out.println("ResumeOperation.ResumeReport()"+r);
		map.put("data", r);
		map.put("name", r.getName().toUpperCase());
		map.put("title",r.getTitle());
		map.put("mobile",r.getMobile());
		map.put("email",r.getMail().toLowerCase());
		map.put("location",r.getAddress());
		map.put("nationality",r.getNationality());
		map.put("objective",r.getObjective());
		map.put("college",r.getCollege());
		map.put("unversity",r.getUniversity());
		map.put("course",r.getCourse());
		map.put("pastDate", r.getPast_date());
		map.put("stream",r.getStream());
		map.put("grade",r.getDivision());
		map.put("skills",r.getSkills());
		map.put("project",r.getProject());
		map.put("ptitle",r.getProject_title());
		map.put("hobbies",r.getHobbies());
		map.put("date",r.getDate());
		
		return"Report";
	}
	
}
