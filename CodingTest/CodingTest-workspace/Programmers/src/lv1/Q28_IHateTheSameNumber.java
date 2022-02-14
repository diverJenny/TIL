package lv1;

import java.util.ArrayList;
import java.util.Arrays;

/*
** ���� ���ڴ� �Ⱦ� **

���� ����
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����

����� ��
arr				answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]		[4,3]

����� �� ����
����� �� #1,2
������ ���ÿ� �����ϴ�.
 */

public class Q28_IHateTheSameNumber {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
//		System.out.println(Arrays.toString(solution(arr)));
		System.out.println(Arrays.toString(solution(arr2)));
	}
	
	public static int[] solution(int []arr) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
