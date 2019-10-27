package level1;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        //copyOfRange로 배열에서 한번에 필요한 부분만을 가져올 수 있다...!
        
        for(int i=0; i<commands.length; i++) {
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int where = commands[i][2];
        	int temp[] = new int[end-start+1];
        	int cnt=0;
        	
        	for(int j=start-1; j<end; j++) {
        		temp[cnt++] = array[j];
        	}
        	Arrays.sort(temp);
        	answer[i] = temp[where-1];
        }
        return answer;
    }

}

/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42748 K번째수
 * 분류 : 정렬
 */
