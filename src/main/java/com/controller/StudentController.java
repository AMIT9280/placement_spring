package com.controller;

 
import java.lang.reflect.Field;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.StudentBean;
import com.bean.UserBean;
import com.dao.StudentDao;
import com.dao.UserDao;

 
 
@Controller
public class StudentController {
	 
	@Autowired
	StudentDao stdao;
	

	@GetMapping("/signup")
	public String openSignup() {
		System.out.println("Signup/...");
		return "Signup";
	}
	@GetMapping("/login")
	public String openLogin() {
		System.out.println("Login/...");
		return "Login";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(@Valid StudentBean student,BindingResult result,Model model ) {
		
		if(result.hasErrors()) {
		System.out.println(student.getFirstName());
		for (FieldError err : result.getFieldErrors()) {
			
			model.addAttribute(err.getField(), err.getDefaultMessage());
		}
		model.addAttribute("Student", student);
			return "Signup";
		}else {
			
			stdao.newStudent(student);
			model.addAttribute("students",student);
			return "redirect:/login";
		} 
	}
	@PostMapping("/authenticate")
	public String autauthenticate(@RequestParam("email") String email, @RequestParam("password") String password,Model model) {
		
		if(email.equals("admin@123.com") && password.equals("123456")) {
			return "Home";
		}else {
			model.addAttribute("error","Invalid Creadantial");
			return "Login";
			
		}
	}
	
	//placement
	@GetMapping("/newstudent")
	public String newStudent() {
		
		return "NewStudent";
	}
	@PostMapping("/savestudent")
	public String saveStudent(@Valid StudentBean student, BindingResult result, Model model ) {
		
		if (result.hasErrors()) {
			System.out.println(student.getFirstName());
			System.out.println(result.getAllErrors());

			for (FieldError err : result.getFieldErrors()) {
				
				model.addAttribute(err.getField(), err.getDefaultMessage());
			}
			model.addAttribute("students", student);

			return "Signup";
		} else {
			System.out.println(student.getFirstName());
			System.out.println(student.getEmail());
			System.out.println(student.getPassword());
			
			stdao.newStudent(student);

			model.addAttribute("students", stdao);

			return "redirect:/liststudent";
		}
	 
	}
	@GetMapping("/liststudent")
	public String listStudents(Model model) {
		 List<StudentBean> students = stdao.getAllStudents();	 
		 model.addAttribute("students", students);
		return "ListStudents";
	}
	
	@GetMapping("/home")
	public String homepage() {
		return "Home";
	}
	@GetMapping("/upDateStudent")
	public String upDateStudent(@RequestParam("studentId") int studentId ,Model model) {
		
		StudentBean student = stdao.getStudentByStudentId(studentId);
		 
		model.addAttribute("student", student);
		return "UpdateStudent";
	}	
	@PostMapping("/upDateStudent")
	public String updateUser(StudentBean student) {
		
		stdao.updateStudent(student);
		System.out.println(student.getFirstName());
		return "redirect:/liststudent";
	}
	@GetMapping("/deletstudent")
	public String DeleteStudent(@RequestParam("studentId") int studentId) {
		stdao.DeleteStudent(studentId);
		return "redirect:/liststudent";
	}
	
}
