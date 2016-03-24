package com.chipmonk.admissioncontroller;

import java.util.ArrayList;
import java.util.Date;



public class student {
private String studentname;
private String studenthobby;
private long studentMobile;
private Date studentDOB;
private ArrayList<String> studentSkills ;
private Address studentAddress;
public Address getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(Address studentAddress) {
	this.studentAddress = studentAddress;
}
public long getStudentMobile() {
	return studentMobile;
}
public void setStudentMobile(long studentMobile) {
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
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudenthobby() {
	return studenthobby;
}
public void setStudenthobby(String studenthobby) {
	this.studenthobby = studenthobby;
}
}
