package test_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @author Asmita Chitale
 */

public class Solution {
	
	
	/**
	 * @param target: list of desired product sequences
	 * @param available: list of all possible sequences (total n)
	 * Time complexity: O(n)
	 * @return
	 */
	public int[] getSmallestSubsequence(List<String> target, List<String> available){
		
		Map<String, List<Integer>> occupied = new HashMap<String, List<Integer>>();
		int count = 0;
		
		int maxCount = Integer.MAX_VALUE;
		int maxStart = Integer.MAX_VALUE;
		int maxEnd = Integer.MAX_VALUE;
		int currCount = Integer.MAX_VALUE;
		int currStart = Integer.MAX_VALUE;
		int currEnd = Integer.MAX_VALUE;
		
		Set<String> targetSet = new HashSet<String>(target);
		
		for(String s: available){
			if(targetSet.contains(s)){
				if(occupied.containsKey(s)){
					occupied.get(s).add(count);
				}
				else{
					List<Integer> value = new LinkedList<Integer>();
					value.add(count);
					if(occupied.size() == 0){
						currStart = count;
					}
					occupied.put(s,value);
					if(occupied.size() == targetSet.size()){
						currEnd = count;
						currCount = currEnd - currStart;
						if(currCount < maxCount){
							maxCount = currCount;
							maxStart = currStart;
							maxEnd = currEnd;
						}
						List<Integer> currValues =  occupied.get(available.get(currStart));
						currValues.remove(0);
						if(0 == currValues.size()){
							occupied.remove(available.get(currStart));
						}
						
						for(int i = currStart+1; i <= maxEnd; i++){
							if(occupied.containsKey(available.get(i))){
								currStart = i;
								if(occupied.size() == targetSet.size()){
									currCount = currEnd - currStart;
									if(currCount < maxCount){
										maxCount = currCount;
										maxStart = currStart;
										maxEnd = currEnd;
									}
									List<Integer> currValues1 =  occupied.get(available.get(currStart));
									currValues1.remove(0);
									if(0 == currValues1.size()){
										occupied.remove(available.get(currStart));
									}
								}
								else{
									currEnd = Integer.MAX_VALUE;
									break;
								}
							}
						}
					}
				}
			}
			count ++;
		}
		return new int[]{maxStart,maxEnd};
	}
	
	public static void main(String[] args){
		
		List<String> target = Arrays.asList(new String[]{"abc", "123", "ab"});
		List<String> available = Arrays.asList(new String[]{"abc" , "ab", "bc", "abc", "abc1", "123", "ab1c", "abc", "ab"});
		
		Solution s = new Solution();
		int[] out = s.getSmallestSubsequence(target, available);
		boolean correct = (out[0] == 5 && out[1] == 8);		
		System.out.println("[ " + out[0] + ", " + out[1] + " ]" + " <-" + correct);
		
		List<String> target1 = Arrays.asList(new String[]{"abc", "ab"});
		int[] out1 = s.getSmallestSubsequence(target1, available);
		correct = (out1[0] == 0 && out1[1] == 1);		
		System.out.println("[ " + out1[0] + ", " + out1[1] + " ]" + " <-" + correct);
		
		List<String> target2 = Arrays.asList(new String[]{});
		int[] out2 = s.getSmallestSubsequence(target2, available);
		correct = (out2[0] == Integer.MAX_VALUE && out2[1] == Integer.MAX_VALUE);		
		System.out.println("[ " + out2[0] + ", " + out2[1] + " ]" + " <-" + correct);
		
	}

}
