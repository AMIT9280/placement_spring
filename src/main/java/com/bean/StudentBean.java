package com.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class StudentBean {
	
	int studentId;
	@NotBlank(message = "First Name Required")
	String firstName;
	@NotBlank(message = "Last Name Required")
	String lastName;
	@NotBlank(message = "Email Required")
	String email;
	@NotBlank(message = "Contact Required")
	String contact;
	@NotBlank(message = "Password Required")
	String password;
	@NotNull(message = "SSC Required")
	Integer ssc;
	@NotNull(message = "HSC Required")
	Integer hsc;
	@NotNull(message = "Email Required")
    Integer bcgpa;
	@NotBlank(message = "University Required")
	String university;
	@NotBlank(message = "Branch Required")
	String branch;
	@NotBlank(message = "Gender Required")
	String gender;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSsc() {
		return ssc;
	}
	public void setSsc(Integer ssc) {
		this.ssc = ssc;
	}
	public Integer getHsc() {
		return hsc;
	}
	public void setHsc(Integer hsc) {
		this.hsc = hsc;
	}
	public Integer getBcgpa() {
		return bcgpa;
	}
	public void setBcgpa(Integer bcgpa) {
		this.bcgpa = bcgpa;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
