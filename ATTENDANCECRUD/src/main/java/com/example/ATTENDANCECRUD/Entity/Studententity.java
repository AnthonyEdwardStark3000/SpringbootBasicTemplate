package com.example.ATTENDANCECRUD.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Studententity {
	
	@Id
	@Column(name="studentId",nullable=false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	public int studentId;
	public String studentName;
	public String subjects;
	public String assignments;
	public String remark;
	public double marksobtained;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public String getAssignments() {
		return assignments;
	}
	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getMarksobtained() {
		return marksobtained;
	}
	public void setMarksobtained(double marksobtained) {
		this.marksobtained = marksobtained;
	}

}
