package Training.Training_07;

/*
 * Java 연습 문제 7
 * - 세부 학점 계산하기
 * - 점수를 3 개 입력 받아 입력 받은 점수 중 가장 높은 점수에 해당하는 세부 학점 출력하기
 * - 세부 학점 계산 방법은 연습 문제 6 번 참고
 *
 * Ex)
 * 점수 (3 개) 입력 : 95 85 75
 * A0 학점입니다.
 */

import java.util.Scanner;

/**
 * Training 7
 */
public class CT01Training_07 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("점수 (3 개) 입력 : ");
		
		int nScoreA = oScanner.nextInt();
		int nScoreB = oScanner.nextInt();
		int nScoreC = oScanner.nextInt();
		
		int nScore_High = (nScoreA >= nScoreB) ? nScoreA : nScoreB;
		nScore_High = (nScore_High >= nScoreC) ? nScore_High : nScoreC;
		
		String oGrade = "";
		String oGrade_Detail = "";
		
		// F 학점 일 경우
		if(nScore_High < 60) {
			oGrade = "F";
		} else {
			// A 학점 일 경우
			if(nScore_High >= 90) {
				oGrade = "A";
			}
			// B 학점 일 경우
			else if(nScore_High >= 80) {
				oGrade = "B";
			}
			// C 학점 일 경우
			else if(nScore_High >= 70) {
				oGrade = "C";
			}
			// D 학점일 경우
			else {
				oGrade = "D";
			}
			
			// + 학점 일 경우
			if(nScore_High >= 100 || nScore_High % 10 >= 7) {
				oGrade_Detail = "+";
			} else {
				oGrade_Detail = (nScore_High % 10 <= 3) ? "-" : "0";
			}
		}
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
}
