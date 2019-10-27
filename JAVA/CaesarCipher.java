package level1;

public class CaesarCipher {
	public static void main(String[] args) {
		solution("AB",1);
		solution("z",1);
		solution("a B z",4);
		solution("Z", 25);
	}
	
	public static String solution(String s, int n) {
		//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳을 바꾸는 암호화 방식

		//더 좋다고 생각한 방식
		String answer = "";
	      for(int i=0; i<s.length(); i++) {
	    	  char ch = s.charAt(i);
              
              if(Character.isLowerCase(ch))
                  ch = (char)((ch+ n%26 - 'a') % 26 + 'a');
              else if(Character.isUpperCase(ch))
                  ch = (char)((ch + n%26 - 'A')% 26 + 'A');
              
              answer += ch;
	      }
	      System.out.println(answer);
	      return answer;
	      
	      /*
	      	// 'Z', 25를 생각해서 대문자와 소문자를 분류해서 생각해야함
	      	// 처음 푼 방식
			String answer = "";
		      char[] charArr = s.toCharArray();
		      for(int i=0; i<charArr.length; i++) {
		    	  if(charArr[i]!=' ') {
		    		  if(Character.isUpperCase(charArr[i])) {
		    			  charArr[i] = (char) (charArr[i]+n);    		    			  
		    			  if(charArr[i]>'Z')charArr[i] = (char) (charArr[i]-26);
		    		  }else {
		    			  charArr[i] = (char) (charArr[i]+n);    		    			  
		    			  if(charArr[i]>'z')charArr[i] = (char) (charArr[i]-26);
		    		  }
		    	  }
		    	  answer+=charArr[i];
		      }
		      System.out.println(answer);
		      return answer;
		   */
	  }
}

/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/12926 시저암호
 * 분류 : 문자 탐색
 */
