package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BestAlbum {

	public static void main(String[] args) {
		solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500});
		solution(new String[] {"classic", "pop", "opera", "classic", "pop"}, new int[] {1000, 600, 2500, 1000, 600});
		solution(new String[] {"classic", "pop", "opera", "classic", "pop","new","new"}, new int[] {1000, 600, 2500, 1000, 600,10000,10000});
	}
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        HashMap<String,ArrayList<Integer>> list = new HashMap();
        Map<String,Integer> sizeList = new HashMap();
        //���� ����� �帣�� ���� ����
        for(int i=0; i<genres.length; i++) {
        	if(!list.containsKey(genres[i])) {
        		ArrayList<Integer> arrlist = new ArrayList<Integer>();
        		arrlist.add(plays[i]);
        		list.put(genres[i], arrlist);
        		sizeList.put(genres[i], plays[i]);
        	}else {
        		ArrayList<Integer> arrlist = list.get(genres[i]);
        		arrlist.add(plays[i]);
        		list.put(genres[i], arrlist);
        		sizeList.put(genres[i], sizeList.get(genres[i])+plays[i]);
        	}
        }
        ValueComparator bvc =  new ValueComparator(sizeList);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);
        sorted_map.putAll(sizeList);
        int cnt = 0;
        for(String key : sorted_map.keySet()) {
        	ArrayList<Integer> arrlist = list.get(key);
        	
        	//�帣 ������ ���� ����� �뷡�� ���� ����
        	Collections.sort(arrlist);
        	Collections.reverse(arrlist);
        	
        	TreeMap<Integer,Integer> tempMap = new TreeMap<Integer,Integer>();
        	
        	//Ƚ���� ���ٸ� ������ȣ�� ���� �뷡�� ���� ����(������ȣ ��������)
        	for(int i=0; i<plays.length; i++) {
        		if(arrlist.get(0)==plays[i]) {
        			if(tempMap.containsKey(0))tempMap.put(1, i);
        			else tempMap.put(0, i);
        		}else if(arrlist.size()>1 && arrlist.get(1)==plays[i]) {
        			tempMap.put(1, i);
        		}
        	}
        	answerList.add(tempMap.get(0));
        	if(tempMap.get(1)!=null)
        	answerList.add(tempMap.get(1));
        }
        
        //�� ������ Ȯ��
		System.out.println(answerList);
		
		answer = new int[answerList.size()];
        for (int i=0; i < answer.length; i++)
        {
        	answer[i] = answerList.get(i).intValue();
        }
        
        return answer;
    }
	
}

//map value�� �������� �����ϱ�
class ValueComparator implements Comparator<String> {
	 
    Map<String, Integer> base;
     
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
 
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) { //�ݴ�� �ϸ� �������� <=
            return -1;
        } else {
            return 1;
        }
    }
}
/*
 * ��ó : ���α׷��ӽ� https://programmers.co.kr/learn/courses/30/lessons/42579 ����Ʈ�ٹ�
 * �з� : �ؽ�
 */
