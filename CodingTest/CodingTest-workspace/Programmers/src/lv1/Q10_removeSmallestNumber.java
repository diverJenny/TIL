package lv1;

/*
** ���� ���� �� �����ϱ� **

���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.

����� ��
arr			return
[4,3,2,1]	[4,3,2]
[10]		[-1]
 */

public class Q10_removeSmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(solution(arr));
	}
	public static int[] solution(int[] arr) {
		if (arr.length <= 1) {
			int[] answer = { -1 };
			return answer;
		}

		int[] answer = new int[arr.length - 1];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue;
			}
			answer[index++] = arr[i];
		}

		return answer;
	}
}
