package level1;

import java.util.Calendar;

public class Year2016 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		solution(5, 24);
		long end = System.currentTimeMillis();
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 );
	}
	
	public static String solution(int a, int b) {
	      
		/*
		//����ð� : 0.02
		String[] answer = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		Calendar cal = Calendar.getInstance();
		cal.set(2016, a-1, b);
		int i = cal.get(cal.DAY_OF_WEEK);
		System.out.println(answer[i-1]+":"+i);
		return answer[i-1];
	    */ 
	       

		//����ð� : 0.0
		//Ķ���� �� ����
	    int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
	    //1�� 1���� �ݿ��Ϻ��� ���۵Ǵϱ� fri���� �迭�� �־��ش�
	    String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	    int answerInt = 0;
	    //�ش� ���� ������ �� ������ �ϼ��� ������ �� �־ a-1
	    for(int i=0; i<a-1; i++) {
	    	answerInt += monthDays[i];
	    }
	    answerInt += b-1;
	    //System.out.println(answer[answerInt%7]);
	    return answer[answerInt%7];
	     
	}

}
/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/12901 2016��
 * �з� : ���� ���
 */