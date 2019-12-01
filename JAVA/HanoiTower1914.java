package backJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class HanoiTower1914 {
	static BigInteger count;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		//첫번째 장대에 있는 n개의 원판을 3번째 장대로 옮기기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//메모리초과로 인해 bufferedWriter사용
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//첫번째 장대에 쌓인 원판의 개수
		int N = Integer.parseInt(br.readLine());
		
		//(2^n)-1번이 최소횟수
		//long형보다 더 큰 자료형이 필요
		count = new BigInteger("2").pow(N).subtract(BigInteger.valueOf(1));
		bw.append(count+"\n");
		
		if(N<=20) {
			move(N,1,2,3);
		}
		bw.close();
	}
	
	//재귀로써 옮기기
	public static void move(int n, int first, int second, int third) throws IOException { 		
        if(n==1){
            bw.append(first+" "+third+"\n");
            return;
        }
        move(n-1, first, third, second);
        bw.append(first+" "+third+"\n");
        move(n-1, second, first, third);
    } 
	
}

/*
 * 출처 : 백준 https://www.acmicpc.net/problem/1914 하노이 탑
 * 분류 : 재귀
 */
