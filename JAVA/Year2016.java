package level1;

import java.util.Calendar;

public class Year2016 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		solution(5, 24);
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
	
	public static String solution(int a, int b) {
	      
		/*
		//실행시간 : 0.02
		String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		Calendar cal = Calendar.getInstance();
		cal.set(2016, a-1, b);
		int i = cal.get(cal.DAY_OF_WEEK);
		System.out.println(answer[i-1]+":"+i);
		return answer[i-1];
	    */ 
	       

		//실행시간 : 0.0
		//캘린더 안 쓰고
	    int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
	    //1월 1일이 금요일부터 시작되니까 fri부터 배열에 넣어준다
	    String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	    int answerInt = 0;
	    //해당 월이 지나야 그 전달의 일수를 더해줄 수 있어서 a-1
	    for(int i=0; i<a-1; i++) {
	    	answerInt += monthDays[i];
	    }
	    answerInt += b-1;
	    //System.out.println(answer[answerInt%7]);
	    return answer[answerInt%7];
	     
	}

}
/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/12901 2016년
 * 분류 : 조건 계산
 */