package level3;

public class FourStringedHighPitchedSound {
	//4단고음
	static int answer; //서로 다른 3단 고음 문자열이 몇 가지인지
	static int maxMultiple; //*3이 최대 몇개까지 나올 수 있는지
	
	public static void main(String[] args) {
		solution(15);
		solution(24);
		solution(41);
		solution(2147483647);
	}
	
	public static int solution(int n) {
		//최대고음에서 *3이 몇개까지 나올 수 있는지
		maxMultiple = (int) (Math.log(n) / Math.log(3));
		answer=0;
		//목표값부터 거꾸로 연산 (시간 효율성)
		//항상 끝은 +기호 2개로 끝나기 때문에 n-2와 2를 대입
		sing(n-2,0,2);
		System.out.println(answer);
	    return answer;
	}
	
	//3단고음을 몇번 할 수 있는지 계산하는 재귀 함수
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
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/1831 4단 고음
 * 2017 카카오코드 예선
 * 분류 : 재귀, 시간 효율성 (목표값부터 거꾸로), 조합
 */
