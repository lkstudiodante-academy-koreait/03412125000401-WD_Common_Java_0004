package Training.Training_05;

/*
 * Java 연습 문제 5
 * - 특정 자리 비트의 활성 여부를 검사하는 프로그램 제작하기
 * - 위치를 입력 받은 후 해당 위치에 있는 비트의 활성 여부를 검사하는 연산 추가하기
 * - 나머지 요구 사항은 연습 문제 2 번 참고
 *
 * Ex)
 * 정수 입력 : 10
 * 2 진수 출력 : 1010
 *
 * 위치 입력 : 1
 * 결과 : True
 */

import java.util.Scanner;

/**
 * Training 5
 */
public class CT01Training_05 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int nVal = oScanner.nextInt();
		
		System.out.printf("2 진수 출력 : %s\n", Integer.toString(nVal, 2));
		
		System.out.print("\n위치 입력 : ");
		int nPos = oScanner.nextInt();
		
		int nResult = nVal & (1 << nPos);
		System.out.printf("결과 : %s\n", nResult != 0);
	}
}
