package kr.co.ezenac.stream2;

import java.util.stream.IntStream;

public class TerminalOperTest {

	public static void main(String[] args) {
		
		// 합계
		int sum = IntStream.of(1, 3, 5, 7, 9)
							.sum();
		System.out.println("sum: " + sum);
		
		// 개수
		long count = IntStream.of(1, 3, 5, 7, 9)
								.count();
		System.out.println("count: " + count);
		
		// 평균
		// 최종연산 결과를 변수로 받지 않고, 결과가 존재한다면 출력하라
		IntStream.of(1, 3, 5, 7, 9)
								.average()
								.ifPresent(avg -> System.out.print("avg = " + avg));
		
		System.out.println();
		//최소
		IntStream.of(1, 3, 5, 7, 9)
					.min()
					.ifPresent(min -> System.out.print("min: " + min));

		System.out.println();
		//최대
		IntStream.of(1, 3, 5, 7, 9)
		.max()
		.ifPresent(max -> System.out.print("max: " + max));
		
		
	}

}
