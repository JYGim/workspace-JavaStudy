package kr.co.ezenac.arraylist3;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int scorePoint) {
		Subject subject = new Subject();
		subject.setName(subjectName);
		subject.setScorePoint(scorePoint);
		System.out.println("-- " + subject + "--"+ subject.getName());
		subjectList.add(subject);
	}

	public void showInfo() {
		
		for(Subject subject: subjectList) {
			System.out.println(subject);
			System.out.println(studentName + "의 " + subject.getName() 
								+ " 점수는 " + subject.getScorePoint() + "입니다.");
		}
		
		
	}
	
	
	

}










