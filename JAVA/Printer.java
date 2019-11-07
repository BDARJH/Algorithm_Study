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
		
		//내림차순 정렬
        PriorityQueue printList = new PriorityQueue<>(Collections.reverseOrder());
 
        //우선 똑같이 queue에 넣어주기
        for(int print : priorities){
        	printList.add(print);
        }
 
        while(!printList.isEmpty()){
            for(int i=0; i<priorities.length; i++){
            	//값이 같을 때
                if(priorities[i] == (int)printList.peek()) {
                	//순서가 같을 때
                    if(i == location){
                    	System.out.println(answer);
                        return answer;
                    }
                    //순서가 같지 않을 때
                    printList.poll();
                    answer++;
                }
            }
        }
 
        return answer;
    }
}

/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42587 프린터
 * 분류 : 스택/큐
 */
