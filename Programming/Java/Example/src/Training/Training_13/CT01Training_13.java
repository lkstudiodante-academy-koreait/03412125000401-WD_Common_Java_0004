package Training.Training_13;

/*
 * Java 연습 문제 13
 * - 세로 다이어그램 출력하기
 * - 사용자로부터 3 개의 정수를 입력 받는다
 * - 입력 받은 각 수에 맞춰 세로 다이어그램 출력하기
 *
 * Ex)
 * 정수 (3 개) 입력 : 5 3 1
 * * * *
 * * *
 * * *
 * *
 * *
 */

import java.util.Scanner;

/**
 * Training 13
 */
public class CT01Training_13 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (3 개) 입력 : ");
		
		int nValA = oScanner.nextInt();
		int nValB = oScanner.nextInt();
		int nValC = oScanner.nextInt();
		
		int nVal_Max = Math.max(nValA, nValB);
		nVal_Max = Math.max(nVal_Max, nValC);
		
		for(int i = 0; i < nVal_Max; ++i) {
			char chLetterA = (i < nValA) ? '*' : ' ';
			char chLetterB = (i < nValB) ? '*' : ' ';
			char chLetterC = (i < nValC) ? '*' : ' ';
			
			System.out.printf("%c %c %c\n", chLetterA, chLetterB, chLetterC);
		}
	}
}
