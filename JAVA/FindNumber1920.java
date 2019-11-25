package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber1920 {
	
	//N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��,
	//�� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
	static int[] arr;

	public static void main(String[] args) throws IOException {
		//�Է¹��� reader ���� �� �Ҵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�־��� ������ ���� N
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//�迭 �������� ����
		//�⺻������ Array.sort�� DualPivotQuicksort ����
		//�⺻���� ������ ���� �� ���� � ������ ���°� ȿ�������� ����ʿ�
		Arrays.sort(arr);
		
		//ã�� ������ ���� M
		int M = Integer.parseInt(br.readLine());
		int[] searchArr = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			searchArr[i] = Integer.parseInt(st.nextToken());
		}
		
		//���� ���
		for(int i=0; i<M; i++) {
			System.out.println(binarySearch(searchArr[i]));
		}
	}
	
	//�̺�Ž��
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
 * ��ó : ���� https://www.acmicpc.net/problem/1920 ��ã��
 * �з� : �̺�Ž��(����Ž��, binary search)
 */
