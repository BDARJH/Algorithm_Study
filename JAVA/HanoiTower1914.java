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
		//ù��° ��뿡 �ִ� n���� ������ 3��° ���� �ű��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�޸��ʰ��� ���� bufferedWriter���
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//ù��° ��뿡 ���� ������ ����
		int N = Integer.parseInt(br.readLine());
		
		//(2^n)-1���� �ּ�Ƚ��
		//long������ �� ū �ڷ����� �ʿ�
		count = new BigInteger("2").pow(N).subtract(BigInteger.valueOf(1));
		bw.append(count+"\n");
		
		if(N<=20) {
			move(N,1,2,3);
		}
		bw.close();
	}
	
	//��ͷν� �ű��
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
 * ��ó : ���� https://www.acmicpc.net/problem/1914 �ϳ��� ž
 * �з� : ���
 */
