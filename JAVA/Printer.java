package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {

	public static void main(String[] args) {
		solution(new int[] {2,1,3,2},2);
		solution(new int[] {1,1,9,1,1,1},0);
		solution(new int[] {3,3,4,2},3);
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 1;
		
		//�������� ����
        PriorityQueue printList = new PriorityQueue<>(Collections.reverseOrder());
 
        //�켱 �Ȱ��� queue�� �־��ֱ�
        for(int print : priorities){
        	printList.add(print);
        }
 
        while(!printList.isEmpty()){
            for(int i=0; i<priorities.length; i++){
            	//���� ���� ��
                if(priorities[i] == (int)printList.peek()) {
                	//������ ���� ��
                    if(i == location){
                    	System.out.println(answer);
                        return answer;
                    }
                    //������ ���� ���� ��
                    printList.poll();
                    answer++;
                }
            }
        }
 
        return answer;
    }
}

/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/42587 ������
 * �з� : ����/ť
 */
