package lv1;

import java.util.Arrays;
import java.util.Scanner;

/*
** 최대공약수와 최소공배수 **

문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

입출력 예
n	m	return
3	12	[3, 12]
2	5	[1, 10]

입출력 예 설명
입출력 예 #1
위의 설명과 같습니다.

입출력 예 #2
자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
 */
// 최대공약수와 최소공배수를 구하는 알고리즘은 유클리드 호재법 활용!
public class Q08_GreatestCommonFactorAndLeastCommonMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(Arrays.toString(solution(n, m)));
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2]; // 길이가 2인 배열 생성
		/*
		 * java.lang.Math 클래스 Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
		 * Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용 가능
		 * Math 클래스는 java.lang 패키지에 포함되어 제공
		 */
		// max 메서드로 전달된 두 수를 비교하여 큰 값 반환 후 정수형 변수 big에 할당
		int big = Math.max(n, m);
		// min 메서드로 전달된 두 수를 비교하여 작은 값 반환 후 정수형 변수 small에 할당
		int small = Math.min(n, m);

		// gcd 메서드 반환값을 answer[0]에 할당
		answer[0] = gcd(big, small);
		// 최소공배수 = 큰 수 * 작은수 / 최대공약수
		answer[1] = big * small / answer[0];

		return answer;
	}

	// 최대공약수 구하는 메서드
	static int gcd(int a, int b) {
		// a를 b로 나눈 나머지가 0일경우 b가 최대공약수가 된다
		if (a % b == 0) {
			return b;
		}
		// a%b!=0인 경우 gcd메서드 재실행
		return gcd(b, a % b);
	}
}
