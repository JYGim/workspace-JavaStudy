package kr.co.ezenac.school.view;

import java.util.ArrayList;

import kr.co.ezenac.school.School;
import kr.co.ezenac.school.Subject;

/*
 *	�ʼ��������� �Ϲݰ��������� ���� ��å Ŭ������ ������ ���� �� �ֵ��� ���� 	
 *	StringBuffer Ŭ������ �̿� ��� ���� ����Ʈ ������ ���� �� String Ŭ������ ��ȯ 
 */
public class GradeReport {
	
	School school = School.getInstance();
	
	public static final String TITLE = "���ǽ�û�� ����>> \t\t\n";
	public static final String HEADER = "�̸� \t | ���� | �������� \t | ���� \n";
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
