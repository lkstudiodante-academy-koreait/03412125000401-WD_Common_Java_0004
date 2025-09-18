package Training.Training_09;

/*
 * Java 연습 문제 9
 * - 세부 학점 계산하기 (+ switch ~ case 활용)
 * - 점수를 3 개 입력 받아 입력 받은 점수 중 가장 낮은 점수에 해당하는 세부 학점 출력하기
 * - 세부 학점 계산 방법은 연습 문제 6 번 참고
 *
 * Ex)
 * 점수 (3 개) 입력 : 95 85 75
 * C0 학점입니다.
 */

import java.util.Scanner;

/**
 * Training 9
 */
public class CT01Training_09 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 (3 개) 입력 : ");
		
		int nScoreA = oScanner.nextInt();
		int nScoreB = oScanner.nextInt();
		int nScoreC = oScanner.nextInt();
		
		int nScore_Low = (nScoreA <= nScoreB) ? nScoreA : nScoreB;
		nScore_Low = (nScore_Low <= nScoreC) ? nScore_Low : nScoreC;
		
		String oGrade = "";
		String oGrade_Detail = "";
		
		switch(nScore_Low / 10) {
			case 9:
			case 10:
				oGrade = "A";
				break;
			
			case 8:
				oGrade = "B";
				break;
			
			case 7:
				oGrade = "C";
				break;
			
			case 6:
				oGrade = "D";
				break;
			
			default:
				oGrade = "F";
				break;
		}
		
		oGrade_Detail = switch(nScore_Low % 10) {
			case 0, 1, 2, 3 -> "-";
			case 4, 5, 6 -> "0";
			default -> "+";
		};
		
		switch(nScore_Low) {
			case 100:
				oGrade_Detail = "+";
				break;
		}
		
		switch(oGrade) {
			case "F":
				oGrade_Detail = "";
				break;
		}
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
}
