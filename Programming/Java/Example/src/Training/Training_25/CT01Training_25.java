package Training.Training_25;

/*
 * Java 연습 문제 25
 * - 2 진수 변환하기 (+ 재귀 호출 활용)
 * - 사용자로부터 10 진수 정수를 입력 받는다
 * - 입력 받은 정수를 2 진수로 변환해서 해당 결과를 출력한다
 *
 * Ex)
 * 정수 입력 : 10
 * 2 진수 변환 결과 : 1010
 */

import java.util.Scanner;

/**
 * Training 25
 */
public class CT01Training_25 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nVal = oScanner.nextInt();
		
		String oBinary = convert_ToBinary(nVal);
		System.out.printf("2 진수 변환 결과 : %s\n", oBinary);
	}
	
	/** 2 진수로 변환한다 */
	private static String convert_ToBinary(int a_nVal) {
		// 재귀 호출이 불가능 할 경우
		if(a_nVal <= 0) {
			return "";
		}
		
		String oBinary = convert_ToBinary(a_nVal / 2);
		return String.format("%s%d", oBinary, a_nVal % 2);
	}
}
