package level1;

import java.util.ArrayList;

public class DontLikeSameNumber {

	//�迭�� ���� �ߺ����� �� �ϳ����� ������� ���
	public static void main(String[] args) {
		DontLikeSameNumber dlsn = new DontLikeSameNumber();
		int[] arr = dlsn.solution(new int[] {1,1,3,3,0,1,1});
		dlsn.print(arr);
		arr = dlsn.solution(new int[] {4,4,4,3,3});
		dlsn.print(arr);
	}
	
	public int[] solution(int[] arr) {
		int temp = -1;
		
		ArrayList arrList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(temp!=arr[i]) {
				temp = arr[i];
				arrList.add(arr[i]);
			}
		}
		int[] answer = new int[arrList.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int) arrList.get(i);
		}
		return answer;
	}
	
	public void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}

/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/12906?language=java ���� ���ڴ� �Ⱦ�
 * �з� : �迭 �ߺ� ����
 */
