package Training.Training_23;

/**
 * Java 연습 문제 23
 * - 바위/가위/보 게임 제작하기 (+ 메서드 활용)
 * - 요구 사항은 연습 문제 12 번 참고
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 23
 */
public class CT01Training_23 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		while(true) {
			System.out.print("정수 (1. 바위, 2. 가위, 3. 보) 입력 : ");
			int nSelect_My = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(SELECT_ROCK, SELECT_PAPER + 1);
			
			int nResult = getResult(nSelect_My, nSelect_Computer);
			String oStr_Result = getStr_Result(nResult);
			
			String oStr_MySelect = getStr_Select(nSelect_My);
			String oStr_ComputerSelect = getStr_Select(nSelect_Computer);
			
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
	
	/**
	 * 선택
	 */
	private static final int SELECT_ROCK = 1;
	private static final int SELECT_SCISSORS = 2;
	private static final int SELECT_PAPER = 3;
	
	/**
	 * 결과
	 */
	private static final int RESULT_WIN = 1;
	private static final int RESULT_DRAW = 2;
	private static final int RESULT_LOSE = 3;
	
	/**
	 * 선택 문자열을 반환한다
	 */
	private static String getStr_Select(int a_nSelect)
	{
		return switch(a_nSelect) {
			case SELECT_ROCK -> "바위";
			case SELECT_SCISSORS -> "가위";
			default -> "보";
		};
	}
	
	/**
	 * 결과 문자열을 반환한다
	 */
	private static String getStr_Result(int a_nResult) {
		return switch(a_nResult) {
			case RESULT_WIN -> "승리";
			case RESULT_DRAW -> "무승부";
			default -> "패배";
		};
	}
	
	/**
	 * 결과를 반환한다
	 */
	private static int getResult(int a_nSelect_My, int a_nSelect_Computer) {
		// 무승부 일 경우
		if(a_nSelect_My == a_nSelect_Computer) {
			return RESULT_DRAW;
		}
		
		int nSelect_Next = (a_nSelect_My % SELECT_PAPER) + 1;
		
		return (nSelect_Next == a_nSelect_Computer) ?
				RESULT_WIN : RESULT_LOSE;
	}
}
