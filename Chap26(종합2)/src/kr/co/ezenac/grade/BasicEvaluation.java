package kr.co.ezenac.grade;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		if(score >= 90) {
			return 'A';
		}
		else if(score >=80) {
			return 'B';
		}
	}

}
