package level3;

public class FourStringedHighPitchedSound {
	//4�ܰ���
	static int answer; //���� �ٸ� 3�� ���� ���ڿ��� �� ��������
	static int maxMultiple; //*3�� �ִ� ����� ���� �� �ִ���
	
	public static void main(String[] args) {
		solution(15);
		solution(24);
		solution(41);
		solution(2147483647);
	}
	
	public static int solution(int n) {
		//�ִ�������� *3�� ����� ���� �� �ִ���
		maxMultiple = (int) (Math.log(n) / Math.log(3));
		answer=0;
		//��ǥ������ �Ųٷ� ���� (�ð� ȿ����)
		//�׻� ���� +��ȣ 2���� ������ ������ n-2�� 2�� ����
		sing(n-2,0,2);
		System.out.println(answer);
	    return answer;
	}
	
	//3�ܰ����� ��� �� �� �ִ��� ����ϴ� ��� �Լ�
	static void sing(int num, int cntMultiple, int cntPlus) {
		
		if(num<1)return;
		if(num==1 & cntPlus == 2*cntMultiple) {
			answer++;
			return;
		}
		if(2*maxMultiple < cntPlus) return;
		if(num%3==0) {
			if(2*(cntMultiple+1)<=cntPlus) sing(num/3, cntMultiple+1, cntPlus);
			sing(num-3, cntMultiple, cntPlus+3);
		}else if(num%3==2) {
			sing(num-2, cntMultiple, cntPlus+2);
		}else if(num%3==1) {
			sing(num-1, cntMultiple, cntPlus+1);
		}
		return;
	}
}

/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/1831 4�� ����
 * 2017 īī���ڵ� ����
 * �з� : ���, �ð� ȿ���� (��ǥ������ �Ųٷ�), ����
 */
