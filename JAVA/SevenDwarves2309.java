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
		//��ȩ�� �߿� ���� 100�� �Ǵ� 7�� ã�� 
		
		//�Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<9; i++) {
			sevenDwarves[i] = Integer.valueOf(br.readLine());
			sum += sevenDwarves[i];
		}
		
		//�� ���� ������ 2�� ������
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
		
		//���
		Arrays.sort(sevenDwarves);
		for(int i=0; i<7; i++)
			System.out.println(sevenDwarves[i]);
	}
}

/*
 * ��ó : ���� https://www.acmicpc.net/problem/2309 �ϰ� ������
 * �з� : ����Ž�� ����
 */