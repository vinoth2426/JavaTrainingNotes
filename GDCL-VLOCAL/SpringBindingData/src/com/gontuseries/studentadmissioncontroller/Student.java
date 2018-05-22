package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;


public class Student {

	private String studentName;
	private String studentHobby;
	
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentHobby
	 */
	public String getStudentHobby() {
		return studentHobby;
	}
	/**
	 * @param studentHobby the studentHobby to set
	 */
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	/**
	 * @return the studentMobile
	 */
	public Long getStudentMobile() {
		return studentMobile;
	}
	/**
	 * @param studentMobile the studentMobile to set
	 */
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	/**
	 * @return the studentDOB
	 */
	public Date getStudentDOB() {
		return studentDOB;
	}
	/**
	 * @param studentDOB the studentDOB to set
	 */
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	/**
	 * @return the studentSkills
	 */
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	/**
	 * @param studentSkills the studentSkills to set
	 */
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
}
