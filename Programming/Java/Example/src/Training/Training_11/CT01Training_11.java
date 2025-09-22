package Training.Training_11;

/*
 * Java 연습 문제 11
 * - 업/다운 게임 제작하기
 * - 1 ~ 99 범위의 수 중 1 개를 랜덤하게 추출한다
 * - 사용자로부터 정수를 입력 받아 정답 여부를 검사한다
 * - 입력 받은 정수가 정답 일 경우 프로그램을 종료한다
 * - 입력 받은 정수가 정답이 아닐 경우 정답을 맞출 수 있도록 가이드 메세지를 출력한다
 *
 * Ex)
 * 정답 : 85
 *
 * 정수 입력 : 70
 * 정답은 70 보다 큽니다.
 *
 * 정수 입력 : 90
 * 정답은 90 보다 작습니다.
 *
 * 정수 입력 : 85
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 11
 */
public class CT01Training_11 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
	
		int nAnswer = oRandom.nextInt(1, 100);
		System.out.printf("정답 : %d\n\n", nAnswer);
		
		while(true) {
			System.out.print("정수 입력 : ");
			int nVal = oScanner.nextInt();
			
			// 정답 일 경우
			if(nVal == nAnswer) {
				break;
			}
			
			String oMsg = (nVal < nAnswer) ? "큽니다." : "작습니다.";
			System.out.printf("정답은 %d 보다 %s\n\n", nVal, oMsg);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
