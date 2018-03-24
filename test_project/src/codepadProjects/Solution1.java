package codepadProjects;

import java.io.*;
import java.util.*;
import java.lang.Integer;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class Solution1 {
  
    public int getKthRepeatedElement(int[] a, int k){
    if(null == a || a.length == 0) return -1;

    Map<Integer, Integer> letterCount = new HashMap<Integer, Integer>();
    PriorityQueue <Map.Entry<Integer, Integer>> q = new PriorityQueue <Map.Entry<Integer, Integer>>(k,
    		new Comparator<Map.Entry<Integer, Integer>>(){  
		      @Override
		      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
		        if(null == o1 && null == o2) return 0;
		        if(null == o1) return -1;
		        if(null == o2) return 1;
		
		        return o1.getValue().compareTo(o2.getValue()); // multiply by -1 if you want reverse order
		      }
		    });

    for(int num: a){
      if(letterCount.containsKey(num)){
        //letterCount.get(num)++;
        letterCount.put(num, letterCount.get(num)+1);
      }
      else{
        letterCount.put(num,1);
      }
    }

    for(Map.Entry<Integer, Integer> e: letterCount.entrySet()){
      if(q.size() < k){
        q.add(e);
      }
      else if(e.getValue() > q.peek().getValue()){
        q.poll();
        q.add(e);
      }
    }

    
    return q.peek().getKey();

  }
    
    public static <T extends Number> double sum(List<T> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
    
  
  public static void main(String[] args) { 
	  
	sum(new LinkedList<Integer>());

    Solution1 s = new Solution1();
    int ans = s.getKthRepeatedElement(new int[]{1,1,1,1,4,5,5,5,3,3,5,3}, 3);
    System.out.println(ans);
  }
}
