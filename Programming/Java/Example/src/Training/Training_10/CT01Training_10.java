package Training.Training_10;

/*
 * Java 연습 문제 10
 * - 합계/평균 계산하기
 * - 정수를 입력 받은 후 해당 정수가 0 보다 클 경우 해당 정수를 누적한다
 * - 0 보다 큰 정수를 입력 받았을 경우 다시 정수를 입력 받는다
 * - 1 보다 작거나 같은 수를 입력 받았을 경우 입력을 종료하고 합계와 평균을 출력한다
 *
 * Ex)
 * 1 번째 정수 입력 : 1
 * 2 번째 정수 입력 : 2
 * 3 번째 정수 입력 : 3
 * 4 번째 정수 입력 : 0
 *
 * 합계 : 6
 * 평균 : 2.0
 */

import java.util.Scanner;

/**
 * Training 10
 */
public class CT01Training_10 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int nVal_Sum = 0;
		int nNumValues = 0;
		
		while(true) {
			System.out.printf("%d 번째 정수 입력 : ", nNumValues + 1);
			int nVal = oScanner.nextInt();
			
			// 반복을 종료했을 경우
			if(nVal <= 0) {
				break;
			}
			
			nVal_Sum += nVal;
			nNumValues += 1;
		}
		
		System.out.printf("\n합계 : %d\n", nVal_Sum);
		System.out.printf("평균 : %f\n", nVal_Sum / (float)nNumValues);
	}
}
