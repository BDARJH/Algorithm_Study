package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2_10816 {

	//���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�.
	//����̴� ���� ī�� N���� ������ �ִ�.
	//���� M���� �־����� ��, �� ���� �����ִ� ���� ī�带 ����̰� �� �� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	static int[] personalArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//����̰� ������ �ִ� ī���� �� N
		int N = Integer.parseInt(br.readLine());
		personalArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		//����̰� ������ �ִ� ī�� �Է�
		for(int i=0; i<N; i++) {
			personalArr[i] = Integer.parseInt(st.nextToken());
		}
		
		//�������� ����
		//quickSort(0,N-1);
		Arrays.sort(personalArr);
		
		//�����Ǵ� ����ī���� �� M
		int M = Integer.parseInt(br.readLine());
		int[] numCardArr = new int[M];
		st = new StringTokenizer(br.readLine());
		//�����Ǵ� ���� ī�� �Է�
		for(int i=0; i<M; i++) {
			numCardArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			System.out.print(upperIdx(numCardArr[i],N)-lowerIdx(numCardArr[i],N)+" ");
		}
		
	}
	
	//����Ž��
	public static int lowerIdx(int target, int len){
	  int st = 0;
	  int en = len;
	  while(st < en){
	    int mid = (st+en)/2;
	    if(personalArr[mid] >= target) en = mid;
	    else st = mid+1;
	  }
	  return st; // st = en���� ������ �ĺ��� 1���� Ȯ���� ��� while���� Ż����
	}

	//����Ž��
	public static int upperIdx(int target, int len){
	  int st = 0;
	  int en = len;
	  while(st < en){
	    int mid = (st+en)/2;
	    if(personalArr[mid] > target) en = mid;
	    else st = mid+1;
	  }
	  return st; // st = en���� ������ �ĺ��� 1���� Ȯ���� ��� while���� Ż����
	}
	
}

/*
 * ��ó : ���� https://www.acmicpc.net/problem/10816 ����ī�� 2
 * �з� : ���� �� ����Ž�� (binary search)
 */
