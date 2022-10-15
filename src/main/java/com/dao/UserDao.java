package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.StudentBean;
import com.bean.UserBean;

public class UserDao {
	@Autowired
	JdbcTemplate stmt;

	public void insertUser(UserBean user) {
		 stmt.update("insert into students (firstname,lastname,contact,email,password,ssc,hsc,bcgpa,university,branch,gender) values (?,?,?,?,?,?,?,?,?,?,?)",user.getFirstName(),user.getLastName(),user.getContact(),user.getEmail(),user.getPassword(),user.getSsc(),user.getHsc(),user.getBcgpa(),user.getUniversity()
				 ,user.getBranch(),user.getGender());
		
	}
	

	public void newStudent(UserBean user) {
		 stmt.update("insert into students (firstname,lastname,contact,email,password,ssc,hsc,bcgpa,university,branch,gender) values (?,?,?,?,?,?,?,?,?,?,?)",user.getFirstName(),user.getLastName(),user.getContact(),user.getEmail(),user.getPassword(),user.getSsc(),user.getHsc(),user.getBcgpa(),user.getUniversity()
				 ,user.getBranch(),user.getGender());
		
	}
	 public List<UserBean> getAllUsers(){
		 List<UserBean> users = stmt.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
		 return users;
	 }
	
}
