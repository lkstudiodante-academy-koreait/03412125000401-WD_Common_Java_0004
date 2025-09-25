package Training.Training_16;

/*
 * Java 연습 문제 16
 * - 구구단 출력하기
 * - 2 ~ 9 단 까지 구구단 출력한다
 * - 단, 1 라인에 최대 3 단이 동시에 출력 되어야한다
 *
 * Ex)
 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8
 * ...이하 생략
 *
 * 5 * 1 = 5	6 * 1 = 6	7 * 1 = 7
 * 5 * 2 = 10	6 * 2 = 12	7 * 2 = 14
 * ...이하 생략
 *
 * 8 * 1 = 8	9 * 1 = 9
 * 8 * 2 = 16	9 * 2 = 18
 * ...이하 생략
 */

/**
 * Training 16
 */
public class CT01Training_16 {
	/** 초기화 */
	public static void start(String[] args) {
		int nStep = 3;
		
		for(int i = 2; i < 10; i += nStep) {
			for(int j = 1; j < 10; ++j) {
				for(int k = 0; k < nStep; ++k) {
					int nVal = i + k;
					
					// 구구단 출력이 불가능 할 경우
					if(nVal >= 10) {
						continue;
					}
					
					System.out.printf("%d * %d = %-2d\t", nVal, j, nVal * j);
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
