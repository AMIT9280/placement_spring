package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.StudentBean;
import com.bean.UserBean;
 

public class StudentDao {
	@Autowired
	JdbcTemplate stmt;
	public void newStudent(StudentBean student) {
		 stmt.update("insert into students (firstname,lastname,contact,email,password,ssc,hsc,bcgpa,university,branch,gender) values (?,?,?,?,?,?,?,?,?,?,?)",student.getFirstName(),student.getLastName(),student.getContact(),student.getEmail(),student.getPassword(),student.getSsc(),student.getHsc(),student.getBcgpa(),student.getUniversity()
				 ,student.getBranch(),student.getGender());
		
	}
	 public List<StudentBean> getAllStudents(){
		 List<StudentBean> students = stmt.query("select * from students", new BeanPropertyRowMapper<StudentBean>(StudentBean.class));
		 return students;
	 }
 public StudentBean getStudentByStudentId(int studentId) {
		 
	 StudentBean studentBean = stmt.queryForObject("select * from students where studentid = ?",new BeanPropertyRowMapper<StudentBean>(StudentBean.class),new Object[] {studentId});
		 return studentBean;
	 }
	 public void updateStudent(StudentBean student) {
		
		 stmt.update("update students set firstname=?,lastname=?,contact=?,ssc=?,hsc=?,bcgpa=?,university=?,branch=?,gender=? where  email=?" , student.getFirstName(),student.getLastName(),student.getContact(), student.getSsc(),student.getHsc(),student.getBcgpa(),student.getUniversity()
				 ,student.getBranch(),student.getGender(),student.getEmail() );
		 System.out.print(student.getLastName());
	 }
	 public void DeleteStudent(int studentId){
		   stmt.update("delete from students where studentid = ?", studentId);
		 
	 }
}
