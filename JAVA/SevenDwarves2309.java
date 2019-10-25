package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarves2309 {

	public static void main(String[] args) throws IOException {
		int[] sevenDwarves = new int[9];
		int sum = 0;
		boolean check = false;
		//아홉명 중에 합이 100이 되는 7명 찾기 
		
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<9; i++) {
			sevenDwarves[i] = Integer.valueOf(br.readLine());
			sum += sevenDwarves[i];
		}
		
		//다 더한 값에서 2명 빼보기
		for (int i = 0; i<9; i++){
			for (int j = i+1; j<9; j++){
				if ((sum - sevenDwarves[i] - sevenDwarves[j]) == 100){
					sevenDwarves[i] = 999;
					sevenDwarves[j] = 999;

					check = true;
					break;
				}
			}
			if (check)
				break;
		}
		
		//출력
		Arrays.sort(sevenDwarves);
		for(int i=0; i<7; i++)
			System.out.println(sevenDwarves[i]);
	}
}

/*
 * 출처 : 백준 https://www.acmicpc.net/problem/2309 일곱 난쟁이
 * 분류 : 완전탐색 정렬
 */