package kr.co.ezenac.school;

import java.util.ArrayList;

public class Student {

	private int studentId;					//�й�
	private String studentName;				//�̸�
	private Subject majorSubject;			//����(��������)
	private ArrayList<Score> scores = new ArrayList<>();		//���� ����Ʈ
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;		
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}

	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
	
	
}
