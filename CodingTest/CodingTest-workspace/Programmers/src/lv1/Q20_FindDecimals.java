package lv1;

import java.util.Scanner;

/*
** 소수찾기 **

문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.

입출력 예
n	result
10	4
5	3

입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
 */

public class Q20_FindDecimals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		// 시간 초과로 실패 코드
		/*
		 * // 소수 카운트 변수 선언 int answer = 0;
		 * 
		 * // 1은 소수도 합성수도 아니기 때문에 2부터 반복 시작 for(int i=2; i<=n; i++) { // 약수 카운트 변수 선언
		 * int cnt = 0;
		 * 
		 * // i%j==0인 경우 j는 i의 약수이다. 소수는 1과 자기 자신(i)만을 약수로 가지는 수로 약수의 개수는 2개이다. cnt가 2이면
		 * i는 소수이다. for(int j=1; j<=i; j++) { if(cnt>2) { break; } else if(i%j==0) {
		 * cnt++; } }
		 * 
		 * // i가 소수이면 소수 카운트를 증가시킨다. if(cnt == 2) { answer+=1; } } return answer;
		 */

		// 에라토스테네스의 체 사용 -> 효율성 실패 코드
		/*
		 * int answer = 0;
		 * 
		 * for(int i=2; i<=n; i++) { boolean flag = true; for(int j=2; j<i; j++) {
		 * if(i%j==0) { flag = false; break; } }
		 * 
		 * if(flag==true) answer++; }
		 * 
		 * return answer;
		 */

		// 에라토스테네스의 체 사용
		int answer = 0;
        
        int[] number = new int[n+1];
        
        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        
        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i=2; i<=n; i++) {
            if(number[i]==0) continue;
            
            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }
        
        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }
        
        return answer;
	}
}
