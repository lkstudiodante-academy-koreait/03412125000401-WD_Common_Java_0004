package Training.Training_24;

/**
 * Java 연습 문제 24
 * - 세로 다이어그램 출력하기 (+ 메서드 활용)
 * - 요구 사항은 연습 문제 13 번 참고
 * - 단, 사용자로부터 입력 받은 정수의 개수는 제한 X
 */

import java.util.Scanner;

/**
 * Training 24
 */
public class CT01Training_24 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 (N 개) 입력 : ");
		String[] oTokens = oScanner.nextLine().split(" ");
		
		printDiagram(oTokens);
	}
	
	/** 최대 값을 반환한다 */
	private static int getVal_Max(String[] a_oTokens) {
		int nVal_Max = Integer.parseInt(a_oTokens[0]);
		
		for(int i = 1; i < a_oTokens.length; ++i) {
			int nVal = Integer.parseInt(a_oTokens[i]);
			nVal_Max = (nVal > nVal_Max) ? nVal : nVal_Max;
		}
		
		return nVal_Max;
	}
	
	/** 다이어그램을 출력한다 */
	private static void printDiagram(String[] a_oTokens) {
		int nVal_Max = getVal_Max(a_oTokens);
		
		for(int i = 0; i < nVal_Max; ++i) {
			for(int j = 0; j < a_oTokens.length; ++j) {
				int nVal = Integer.parseInt(a_oTokens[j]);
				System.out.printf("%c ", (i < nVal) ? '*' : ' ');
			}
			
			System.out.println();
		}
	}
}
