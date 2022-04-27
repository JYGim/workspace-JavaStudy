package kr.co.ezenac.school.view;

import java.util.ArrayList;

import kr.co.ezenac.school.School;
import kr.co.ezenac.school.Subject;

/*
 *	필수과목인지 일반과목인지에 따라 정책 클래스가 학점을 평가할 수 있도록 구현 	
 *	StringBuffer 클래스를 이용 모든 학점 리포트 내용을 만든 후 String 클래스로 반환 
 */
public class GradeReport {
	
	School school = School.getInstance();
	
	public static final String TITLE = "강의신청자 학점>> \t\t\n";
	public static final String HEADER = "이름 \t | 학점 | 중점과목 \t | 점수 \n";
	public static final String LINE = "-----------------------------------";
	public static final String LINE2 = "==================================";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjects = school.getSubjects();
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
//			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GradeReport.TITLE);
		buffer.append(GradeReport.HEADER);
		buffer.append(GradeReport.LINE2);	
	}
	
	public void makeBody(Subject subject) {
		subject.getStudents();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
