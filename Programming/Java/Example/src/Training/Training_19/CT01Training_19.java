package Training.Training_19;

/*
 * Java 연습 문제 19
 * - 야구 게임 제작하기
 * - 1 ~ 9 범위의 수 중 중복되지 않는 수를 랜덤하게 4 개 추출한다
 * - 사용자로부터 4 개의 수를 입력 받아 스트라이크 or 볼 여부를 판정한다
 * - 입력 받은 수가 정답에 포함되어있고 위치가 동일 할 경우 스트라이크
 * - 입력 받은 수가 정답에 포함되어있지만 위치가 다를 경우 볼
 * - 4 스트라이크가 되면 게임을 종료한다
 *
 * Ex)
 * 정답 : 4 6 1 9
 *
 * 정수 (4 개) 입력 : 4 6 9 1
 * 결과 : 2 Strike, 2 Ball
 *
 * 정수 (4 개) 입력 : 4 6 1 9
 * 결과 : 4 Strike, 0 Ball
 *
 * 프로그램을 종료합니다.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Training 19
 */
public class CT01Training_19 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nNumValues = 0;
		int[] oAnswer = new int[4];
		
		while(nNumValues < oAnswer.length) {
			int j = 0;
			int nVal = oRandom.nextInt(1, 10);
			
			for(j = 0; j < nNumValues; ++j) {
				// 값이 존재 할 경우
				if(nVal == oAnswer[j]) {
					break;
				}
			}
			
			// 값이 중복 될 경우
			if(j < nNumValues) {
				continue;
			}
			
			oAnswer[nNumValues++] = nVal;
		}
		
		System.out.print("정답 : ");
		
		for(int nVal : oAnswer) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println("\n");
		
		do {
			System.out.print("정수 (4 개) 입력 : ");
			String[] oTokens = oScanner.nextLine().split(" ");
			
			int nCount_Strike = 0;
			int nCount_Ball = 0;
			
			for(int i = 0; i < oTokens.length; ++i) {
				int nVal = Integer.parseInt(oTokens[i]);
				
				for(int j = 0; j < oAnswer.length; ++j) {
					// 값이 다를 경우
					if(nVal != oAnswer[j]) {
						continue;
					}
					
					nCount_Strike += (i == j) ? 1 : 0;
					nCount_Ball += (i != j) ? 1 : 0;
				}
			}
			
			// 정답을 맞췄을 경우
			if(nCount_Strike >= oAnswer.length) {
				break;
			}
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
