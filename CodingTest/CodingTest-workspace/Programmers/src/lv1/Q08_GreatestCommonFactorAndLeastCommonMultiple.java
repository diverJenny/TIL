package lv1;

import java.util.Arrays;
import java.util.Scanner;

/*
** �ִ������� �ּҰ���� **

���� ����
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.

����� ��
n	m	return
3	12	[3, 12]
2	5	[1, 10]

����� �� ����
����� �� #1
���� ����� �����ϴ�.

����� �� #2
�ڿ��� 2�� 5�� �ִ������� 1, �ּҰ������ 10�̹Ƿ� [1, 10]�� �����ؾ� �մϴ�.
 */
// �ִ������� �ּҰ������ ���ϴ� �˰����� ��Ŭ���� ȣ��� Ȱ��!
public class Q08_GreatestCommonFactorAndLeastCommonMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(Arrays.toString(solution(n, m)));
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2]; // ���̰� 2�� �迭 ����
		/*
		 * java.lang.Math Ŭ���� Math Ŭ������ ���п��� ���� ����ϴ� ������ �Լ����� �̸� ������ ���� Ŭ����
		 * Math Ŭ������ ��� �޼ҵ�� Ŭ���� �޼ҵ�(static method)�̹Ƿ�, ��ü�� �������� �ʰ� �ٷ� ��� ����
		 * Math Ŭ������ java.lang ��Ű���� ���ԵǾ� ����
		 */
		// max �޼���� ���޵� �� ���� ���Ͽ� ū �� ��ȯ �� ������ ���� big�� �Ҵ�
		int big = Math.max(n, m);
		// min �޼���� ���޵� �� ���� ���Ͽ� ���� �� ��ȯ �� ������ ���� small�� �Ҵ�
		int small = Math.min(n, m);

		// gcd �޼��� ��ȯ���� answer[0]�� �Ҵ�
		answer[0] = gcd(big, small);
		// �ּҰ���� = ū �� * ������ / �ִ�����
		answer[1] = big * small / answer[0];

		return answer;
	}

	// �ִ����� ���ϴ� �޼���
	static int gcd(int a, int b) {
		// a�� b�� ���� �������� 0�ϰ�� b�� �ִ������� �ȴ�
		if (a % b == 0) {
			return b;
		}
		// a%b!=0�� ��� gcd�޼��� �����
		return gcd(b, a % b);
	}
}
