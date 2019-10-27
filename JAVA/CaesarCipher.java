package level1;

public class CaesarCipher {
	public static void main(String[] args) {
		solution("AB",1);
		solution("z",1);
		solution("a B z",4);
		solution("Z", 25);
	}
	
	public static String solution(String s, int n) {
		//� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ��� �ٲٴ� ��ȣȭ ���

		//�� ���ٰ� ������ ���
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
	      	// 'Z', 25�� �����ؼ� �빮�ڿ� �ҹ��ڸ� �з��ؼ� �����ؾ���
	      	// ó�� Ǭ ���
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
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/12926 ������ȣ
 * �з� : ���� Ž��
 */
