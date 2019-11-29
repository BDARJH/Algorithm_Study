package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2_10816 {

	//숫자 카드는 정수 하나가 적혀져 있는 카드이다.
	//상근이는 숫자 카드 N개를 가지고 있다.
	//정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
	
	static int[] personalArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//상근이가 가지고 있는 카드의 수 N
		int N = Integer.parseInt(br.readLine());
		personalArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		//상근이가 가지고 있는 카드 입력
		for(int i=0; i<N; i++) {
			personalArr[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순 정렬
		//quickSort(0,N-1);
		Arrays.sort(personalArr);
		
		//제공되는 숫자카드의 수 M
		int M = Integer.parseInt(br.readLine());
		int[] numCardArr = new int[M];
		st = new StringTokenizer(br.readLine());
		//제공되는 숫자 카드 입력
		for(int i=0; i<M; i++) {
			numCardArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			System.out.print(upperIdx(numCardArr[i],N)-lowerIdx(numCardArr[i],N)+" ");
		}
		
	}
	
	//이진탐색
	public static int lowerIdx(int target, int len){
	  int st = 0;
	  int en = len;
	  while(st < en){
	    int mid = (st+en)/2;
	    if(personalArr[mid] >= target) en = mid;
	    else st = mid+1;
	  }
	  return st; // st = en으로 가능한 후보가 1개로 확정될 경우 while문을 탈출함
	}

	//이진탐색
	public static int upperIdx(int target, int len){
	  int st = 0;
	  int en = len;
	  while(st < en){
	    int mid = (st+en)/2;
	    if(personalArr[mid] > target) en = mid;
	    else st = mid+1;
	  }
	  return st; // st = en으로 가능한 후보가 1개로 확정될 경우 while문을 탈출함
	}
	
}

/*
 * 출처 : 백준 https://www.acmicpc.net/problem/10816 숫자카드 2
 * 분류 : 정렬 및 이진탐색 (binary search)
 */
