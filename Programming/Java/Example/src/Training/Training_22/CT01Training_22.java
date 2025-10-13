package Training.Training_22;

/*
 * Java 연습 문제 22
 * - 세부 학점 계산하기 (+ 메서드 활용)
 * - 요구 사항은 연습 문제 6 번 참고
 */

import java.util.Scanner;

/**
 * Training 22
 */
public class CT01Training_22 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		String oGrade = getGrade(nScore);
		String oGrade_Detail = getGrade_Detail(nScore);
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
	
	/** 학점을 반환한다 */
	private static String getGrade(int a_nScore) {
//		// F 학점 일 경우
//		if(a_nScore < 60) {
//			return "F";
//		}
//
//		// A 학점 일 경우
//		if(a_nScore >= 90) {
//			return "A";
//		}
//		// B 학점 일 경우
//		else if(a_nScore >= 80) {
//			return "B";
//		}
//		// C 학점 일 경우
//		else if(a_nScore >= 70) {
//			return "C";
//		}
//
//		return "D";
		
		
		
		
		
		String oGrade = "";
		
		// F 학점 일 경우
		if(a_nScore < 60) {
			oGrade = "F";
		} else {
			// A 학점 일 경우
			if(a_nScore >= 90) {
				oGrade = "A";
			}
			// B 학점 일 경우
			else if(a_nScore >= 80) {
				oGrade = "B";
			}
			// C 학점 일 경우
			else if(a_nScore >= 70) {
				oGrade = "C";
			}
			// D 학점일 경우
			else {
				oGrade = "D";
			}
		}
		
		return oGrade;
	}
	
	/** 세부 학점을 반환한다 */
	private static String getGrade_Detail(int a_nScore) {
		String oGrade_Detail = "";
		
		// F 학점이 아닐 경우
		if(a_nScore >= 60) {
			// + 학점 일 경우
			if(a_nScore >= 100 || a_nScore % 10 >= 7) {
				oGrade_Detail = "+";
			} else {
				oGrade_Detail = (a_nScore % 10 <= 3) ? "-" : "0";
			}
		}
		
		return oGrade_Detail;
	}
}
