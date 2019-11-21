package com.example.demo.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.StudentBean;
import com.example.demo.repository.StudentRepo;

import antlr.collections.List;
@Controller
public class StudentController {
@Autowired
private StudentRepo repo;

@GetMapping("/admin")
public String showMainPage() {
System.out.println("hai");
return "insert";
}
@PostMapping("insertpage")
public String login(StudentBean studentbean) {
	System.out.println("inserted");
return "insert";
}

@PostMapping("admin/insert")
public String insertStudent(StudentBean studentbean) {
	repo.save(studentbean);
	System.out.println(studentbean.getName());
	System.out.println(studentbean.getAddress());
return "Home";
}
@GetMapping("admin/all")
public String getStudents(Model model) {
	List<StudentBean> studentList=new ArrayList<StudentBean>();
	studentList=repo.findAll();
	model.addAttribute("studentList",studentList);
	return "allstudents";
}


} 


