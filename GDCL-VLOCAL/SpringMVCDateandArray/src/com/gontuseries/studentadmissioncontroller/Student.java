package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;


public class Student {

	private String studentName;
	private String studentHobby;
	
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	
	private Address studentaddress;
	
	
	
	/**
	 * @return the studentaddress
	 */
	public Address getStudentaddress() {
		return studentaddress;
	}
	/**
	 * @param studentaddress the studentaddress to set
	 */
	public void setStudentaddress(Address studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	
}
