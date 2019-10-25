package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
	
	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,3,2,4,2});
	}
	
	public static int[] solution(int[] answers) {
        int[] arr = new int[3];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i=0; i<answers.length; i++){
        	if(answers[i]==supo1[(i%5)]){
        		arr[0]+=1;
        	}
        	if(answers[i]==supo2[(i%8)]){
        		arr[1]+=1;
        	}
        	if(answers[i]==supo3[(i%10)]){
        		arr[2]+=1;
        	}
        }
        int[] tempArr = new int[3];
        for(int i=0; i<arr.length; i++) {
        	tempArr[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<tempArr.length; i++) {
        	if(tempArr[i] == arr[2])
        		arrayList.add(i+1);
        }
        int[] answerArr = new int[arrayList.size()];
        for (int i=0; i < answerArr.length; i++)
        {
        	answerArr[i] = arrayList.get(i).intValue();
        }
        Arrays.sort(answerArr);
        return answerArr;
    }
}

/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42840 모의고사
 * 분류 : 완전탐색 정렬 
*/