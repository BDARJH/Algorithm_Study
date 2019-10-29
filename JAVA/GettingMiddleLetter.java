package level1;

public class GettingMiddleLetter {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
		long end = System.currentTimeMillis();
		System.out.println("소요 시간 : " + (end-start)/1000.0);
	}
	
	public static String solution(String s) {
	    int sLength = s.length();
	    if(sLength%2==0)
	    	return s.substring(sLength/2-1, sLength/2+1);
	    return s.charAt(sLength/2)+"";
	}

}
/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/12903 가운데 글자 가져오기
 * 분류 : 문자열 응용
 */
