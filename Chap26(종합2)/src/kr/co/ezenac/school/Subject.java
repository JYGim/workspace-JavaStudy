package kr.co.ezenac.school;

import java.util.ArrayList;

import kr.co.ezenac.utils.Constant;

public class Subject {
	
	private int subjectId;					//과목 고유번호
	private String subjectName;				//과목 이름
	private int gradeType;					//학점 부여 방식
	private ArrayList<Student> studentList = new ArrayList<>();			//수강신청한 학생 목록
	
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Constant.AB_TYPE;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public ArrayList<Student> getStudents() {
		return studentList;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public void setStudents(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}

	
	
	
	

}
