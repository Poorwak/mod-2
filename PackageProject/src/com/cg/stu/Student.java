package com.cg.stu;
import com.cg.bat.*;

public class Student 
{
	private int rollNo;
	private String stuName;
	private float marks;
	private Batch stuBatch;
	
	public Student() 
	{
		super();
		
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Batch getStuBatch() {
		return stuBatch;
	}
	public void setStuBatch(Batch stuBatch) {
		this.stuBatch = stuBatch;
	}
	public Student(int rollNo, String stuName, float marks, Batch stuBatch) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.marks = marks;
		this.stuBatch = stuBatch;
	}
	
	
	public String dispStuInfo() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName
				+ ", marks=" + marks + ", stuBatch=" + stuBatch.showBatchInfo()  + "]";
	}
}
