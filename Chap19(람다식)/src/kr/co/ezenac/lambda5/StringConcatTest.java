package kr.co.ezenac.lambda5;

public class StringConcatTest {

	public static void main(String[] args) {
		StringConcat impl = new StringConcatImpl();
		impl.makeString("Hello ", "Ezen!");
		
		//람다식
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Hello ", "Ezen2!");
		
		//익명내부클래스에서 내부적으로 람다식이 사용됨.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat2.makeString("Hello ", "Ezen3!");
		
	}

}
