package level2;

public class NumberOf124Countries {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		solution(10);
		solution(500000000);
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
	
	public static String solution(int n) {
		String answer = "";
		
		/*
		//맨처음 생각한 코드
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

		//효율적인 코드
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
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/12899 124나라의 숫자
 * 분류 : 진법 계산
 */
