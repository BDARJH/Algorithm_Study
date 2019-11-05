package level2;

public class PhoneList {

	public static void main(String[] args) {
		solution(new String[] {"119", "97674223", "1195524421"});
		solution(new String[] {"123", "456", "789"});
		solution(new String[] {"12", "123", "1235","567","88"});
	}
	
	public static boolean solution(String[] phone_book) {
		//어떤 번호가 다른 번호의 접두어인 경우가 있으면 false
		//그렇지 않으면 true를 return
		boolean answer = true;
		
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=0; j<phone_book.length; j++) {
        		if(i==j || phone_book[i].equals(phone_book[j])|| phone_book[i].length()>=phone_book[j].length())
        			continue;
        		if(phone_book[j].startsWith(phone_book[i])) {
        			answer = false;
        			break;
        		}
        	}
        	if(answer==false)break;
        }
		return answer;
    }

}

/*
 * 출처 : 프로그래머스 https://programmers.co.kr/learn/courses/30/lessons/42577 전화번호 목록
 * 분류 : 해시
 */
