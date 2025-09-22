package Training.Training_12;

/*
 * Java 연습 문제 12
 * - 바위/가위/보 게임 제작하기
 * - 사용자로부터 바위/가위/보 중 하나를 입력 받는다
 * - 컴퓨터는 바위/가위/보 중 하나를 램덤하게 선택한다
 * - 사용자의 입력과 컴퓨터의 선택을 비교해서 결과를 판정한다
 * - 결과가 승리이거나 무승부 일 경우 게임을 다시 재개한다
 * - 결과가 패배 일 경우 전적을 출력하고 프로그램을 종료한다
 *
 * Ex)
 * 정수 (1. 바위, 2. 가위, 3. 보) 입력 : 1
 * 결과 : 승리 (나 - 바위, 컴퓨터 - 가위)
 *
 * 정수 (1. 바위, 2. 가위, 3. 보) 입력 : 2
 * 결과 : 무승부 (나 - 가위, 컴퓨터 - 가위)
 *
 * 정수 (1. 바위, 2. 가위, 3. 보) 입력 : 1
 * 결과 : 패배 (나 - 바위, 컴퓨터 - 보)
 *
 * 전적 : 1 승 1 무 1 패
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 12
 */
public class CT01Training_12 {
	/** 초기화 */
	public static void start(String[] args) {
		final int SELECT_ROCK = 1;
		final int SELECT_SCISSORS = 2;
		final int SELECT_PAPER = 3;
		
		final int RESULT_WIN = 1;
		final int RESULT_DRAW = 2;
		final int RESULT_LOSE = 3;
		
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		while(true) {
			System.out.print("정수 (1. 바위, 2. 가위, 3. 보) 입력 : ");
			int nSelect_My = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(SELECT_ROCK, SELECT_PAPER + 1);
			
			int nResult = 0;
			
			// Case 1. 규칙 활용
			if(nSelect_My == nSelect_Computer) {
				nResult = RESULT_DRAW;
			} else {
				int nSelect_Next = (nSelect_My % SELECT_PAPER) + 1;
				nResult = (nSelect_Next == nSelect_Computer) ? RESULT_WIN : RESULT_LOSE;
			}
			
			// Case 2. 조건문 활용
//			// 무승부 일 경우
//			if(nSelect_My == nSelect_Computer) {
//				nResult = RESULT_DRAW;
//			} else {
//				// 사용자가 바위 일 경우
//				if(nSelect_My == SELECT_ROCK) {
//					nResult = (nSelect_Computer == SELECT_SCISSORS) ? RESULT_WIN : RESULT_LOSE;
//				}
//				// 사용자가 가위 일 경우
//				else if(nSelect_My == SELECT_SCISSORS) {
//					nResult = (nSelect_Computer == SELECT_PAPER) ? RESULT_WIN : RESULT_LOSE;
//				}
//				// 사용자가 보 일 경우
//				else {
//					nResult = (nSelect_Computer == SELECT_ROCK) ? RESULT_WIN : RESULT_LOSE;
//				}
//			}
			
			String oStr_Result = switch(nResult) {
				case RESULT_WIN -> "승리";
				case RESULT_DRAW -> "무승부";
				default -> "패배";
			};
			
			String oStr_MySelect = switch(nSelect_My) {
				case SELECT_ROCK -> "바위";
				case SELECT_SCISSORS -> "가위";
				default -> "보";
			};
			
			String oStr_ComputerSelect = switch(nSelect_Computer) {
				case SELECT_ROCK -> "바위";
				case SELECT_SCISSORS -> "가위";
				default -> "보";
			};
			
			String oMsgA = String.format("나 - %s", oStr_MySelect);
			String oMsgB = String.format("컴퓨터 - %s", oStr_ComputerSelect);
			
			System.out.printf("결과 : %s (%s, %s)\n\n", oStr_Result, oMsgA, oMsgB);
			
			nCount_Win += (nResult == RESULT_WIN) ? 1 : 0;
			nCount_Draw += (nResult == RESULT_DRAW) ? 1 : 0;
			
			// 패배 했을 경우
			if(nResult == RESULT_LOSE) {
				break;
			}
		}
		
		System.out.printf("전적 : %d 승 %d 무 1 패\n", nCount_Win, nCount_Draw);
		System.out.println("프로그램을 종료합니다.");
	}
}
