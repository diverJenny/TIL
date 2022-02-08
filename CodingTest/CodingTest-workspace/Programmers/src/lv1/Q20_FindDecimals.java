package lv1;

import java.util.Scanner;

/*
���� ����
1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.

����� ��
n	result
10	4
5	3

����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ

����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
 */

public class Q20_FindDecimals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		// �Ҽ� ī��Ʈ ���� ����
		int answer = 0; 
		
		// 1�� �Ҽ��� �ռ����� �ƴϱ� ������ 2���� �ݺ� ����
		for(int i=2; i<=n; i++) {
			// ��� ī��Ʈ ���� ����
			int cnt = 0;
			
			// i%j==0�� ��� j�� i�� ����̴�. �Ҽ��� 1�� �ڱ� �ڽ�(i)���� ����� ������ ���� ����� ������ 2���̴�. cnt�� 2�̸� i�� �Ҽ��̴�.
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			
			// i�� �Ҽ��̸� �Ҽ� ī��Ʈ�� ������Ų��.
			if(cnt == 2) {
				answer+=1;
			}
		}
		return answer;
	}
}
