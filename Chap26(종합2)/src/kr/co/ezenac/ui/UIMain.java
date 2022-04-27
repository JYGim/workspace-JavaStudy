package kr.co.ezenac.ui;

import kr.co.ezenac.school.Subject;
import kr.co.ezenac.utils.Constant;

/*
 * 	*학점 부여 프로그램 정의
 * 	 1. EzenSchool 학교가 있다. 
 * 		이 학교에는 5명의 학생이 있다. 
 * 		과목은 국어와 수학이 있고, 이 두 과목은 모두 수강한다.
 * 		전공은 컴퓨터공학과, 국어국문과 두 가지가 있다. 
 * 		컴퓨터공학과 학생은 수학이 필수과목이고, 국어국문과 학생은 국어가 필수 과목이다. 
 * 		각 학생별로 한 개의 전공을 선택한다. 
 * 		이번 학기 각 학생의 성적이 발표되었다. 
 * 		
 * 		이름		학번		전공		필수과목		국어점수		수학점수
 * 
 * 
 * 		학점 부여 방식은 여러 가지가 있다. 
 * 		A, B, C, D, F를 부여하는 방식, 
 * 		A+, B- 처럼 +/-를 사용하는 방식, 
 * 		Pass/Fail만 부여하는 방식이 있다.  
 * 		=> 인터페이스 설계
 * 		
 * 
 * 
 * 		학점 부여에 사용하는 정책은 두 가지다.
 * 		일반과목이라면 A, B, C, D, F를 부여하는 방식으로, 
 *   	필수과목이라면 S, A, B, C, D, F를 부여하는 방식으로 한다
 *   	점수에 따른 학점 부여기준은 다음과 같다. 
 *   
 *   	필수과목 학점 기준
 *   	S, 		A, 		B, 		C, 		D, 		F
 *		------------------------------------------
 *		95~100   90~100	80~89  70~79   60~69   60점 미만 
 *
 *   	필수과목 학점 기준
 *   	A, 		B, 		C, 		D, 		F
 *		------------------------------------------
 *		90~100   80~89	70~79   55~69   55점 미만
 *
 * 		학점 결과 구현
 * 		학점 정책이 추가, 변경되는 경우와 과목이 추가되는 경우를 고려하여 클래스를 설계하고
 * 		학점 정책에 대해서는 인터페이스로 선언하여 각 정책이 해당 인터페이스를 구현하도록 하라.
 * 
 * 		국어 과목 결과
 * 
 * 		국어 강의신청자 학점 >>
 * 
 * 		이름		|		학점		|		중점과목		|		점수
 * 		=================================================================
 * 		스티브잡스	      20000426			  국어				 95
 * 		-----------------------------------------------------------------
 * 		스티브잡스	      20000426			  국어				 95
 * 		-----------------------------------------------------------------
 * 		스티브잡스	      20000426			  국어				 95
 * 		-----------------------------------------------------------------
 * 		스티브잡스	      20000426			  국어				 95
 * 		-----------------------------------------------------------------
 * 		스티브잡스	      20000426			  국어				 95
 * 		-----------------------------------------------------------------
 * 		
 * 
 * 		수학 결과
 * 
 * 		
 * 
 * 
 *	
*/ 	

public class UIMain {

	public static void main(String[] args) {
		
		
		
		
	}
	
}
