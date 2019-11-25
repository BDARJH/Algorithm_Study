package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber1920 {
	
	//N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때,
	//이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
	static int[] arr;

	public static void main(String[] args) throws IOException {
		//입력받을 reader 선언 및 할당
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주어진 정수의 개수 N
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열 오름차순 정렬
		//기본적으로 Array.sort는 DualPivotQuicksort 정렬
		//기본제공 정렬을 쓰는 것 보다 어떤 정렬을 쓰는게 효율적인지 고민필요
		Arrays.sort(arr);
		
		//찾을 정수의 개수 M
		int M = Integer.parseInt(br.readLine());
		int[] searchArr = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			searchArr[i] = Integer.parseInt(st.nextToken());
		}
		
		//정답 출력
		for(int i=0; i<M; i++) {
			System.out.println(binarySearch(searchArr[i]));
		}
	}
	
	//이분탐색
	public static int binarySearch(int target) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] < target){
				start = mid+1;
			}else if(arr[mid]>target) {
				end = mid-1;
			}else
				return 1;
		}
		return 0;
	}
	
}

/*
 * 출처 : 백준 https://www.acmicpc.net/problem/1920 수찾기
 * 분류 : 이분탐색(이진탐색, binary search)
 */
