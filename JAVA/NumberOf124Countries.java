package level2;

public class NumberOf124Countries {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		solution(10);
		solution(500000000);
		long end = System.currentTimeMillis();
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 );
	}
	
	public static String solution(int n) {
		String answer = "";
		
		/*
		//��ó�� ������ �ڵ�
		int temp = 0;
		while(n!=0) {
			temp = n%3;
			n=n/3;
			if(temp==0) {
				n--;
				temp = 4;
			}
			answer=temp+answer;
		}
		return answer;
		*/

		//ȿ������ �ڵ�
		int[] loopNum = {1,2,4};
		while(n > 0)
	    {
	      answer = loopNum[(n - 1) % loopNum.length] + answer;
	      n = (n - 1) / loopNum.length;
	    }
		System.out.println(answer);
	    return answer;
	}

}

/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/12899 124������ ����
 * �з� : ���� ���
 */
