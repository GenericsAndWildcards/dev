package test_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class temptest {
	
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
		
		List<String> out = fizzBuzz(30);
//		for(String o : out){
//			System.out.println(o);
//		}
		
		int[] array = {1, 2 , 3 , 1, 5, 5, 2};
		System.out.println(singleNumber(array));
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(6);
		root.left.left.right = new TreeNode(5);
		root.right =  new TreeNode(4);
		root.right.left =  new TreeNode(7);

		System.out.println(maxDepth(root));
		
		printTreeLevels(root);
		System.out.println();
		printZigzagTreeLevels(root);
		
		System.out.println(getSum(3,5));
		
		System.out.println(getMissingNumber(new int[]{1,3,4,5,6,7}, 7));
		
		printRepeating(new int[]{1,3,4,4,1,6,2}, 7);
		iterInorder(root);
		iterPreorder(root);
		
		TreeNode root1 = new TreeNode(8);
		root1.left = new TreeNode(5);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(7);
		root1.right = new TreeNode(9);
		
		System.out.println(isBST(root1));
		
		System.out.println(findLCAOfBST(root1, 4,5).val);
		System.out.println(findLCAOfBinaryTree(root, root.left.left.right, root.left.right).val);
		System.out.println(findKthSmallest(root1,4));
		
		ListNode<Integer> listRoot = new ListNode<Integer>(1);
		listRoot.next = new ListNode<Integer>(2);
		listRoot.next.next = new ListNode<Integer>(3);
		listRoot.next.next.next = new ListNode<Integer>(4);
		listRoot.next.next.next.next = new ListNode<Integer>(5);
		
		printList(listRoot);
		ListNode newRoot = recursiveReverseList(listRoot);
		printList(newRoot);
		//newRoot = reverseList(newRoot); 
		printList(newRoot);
		//deleteNode(listRoot.next);
		printList(newRoot);
		//deleteNode(newRoot.next);
		
		System.out.println("Before rearrangement");
		printList(newRoot);
		System.out.println("After rearrangement");
		printList(rearrangeLinkedListTwo(newRoot, 4));
		
		int[][] a = {   { 20, 18, 22, 20, 16 },
                		{ 18, 20, 18, 21, 20 },
                		{ 16, 18, 16, 20, 24 },
                		{ 25, 24, 22, 24, 25 },
                		{ 10, 12, 19, 15, 4 }
            };
		
		int[][] b = {   { 20, 18, 22, 20 },
        		{ 18, 20, 18, 21 },
        		{ 16, 18, 16, 20 }
    };
		
		//Matrix print problems
		spiralPrint(3,4,b);
		printMatixDiagonally(a);
		printMatixDiagonallyZigZag(a);
		
	    char input[][] = {{'G','I','Z'},
	                         {'U','E','T'},
	                         {'Q','S','T'}};
	    String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO", "GEEK", "QUEST", "TEST"};
	    findWords(input,dictionary);
	    
	    int[][] grid = {   { 1, 0, 1, 0, 0 },
        					{ 1, 1, 1, 1, 0 },
        					{ 0, 0, 0, 0, 1 },
        					{ 1, 1, 1, 0, 1 },
        					{ 1, 1, 1, 1, 1 }
	    };
	    System.out.println("Max area island = " + maxAreaIsland(grid));

		
		System.out.println();
		int[] intersect = findIntersection(new int[]{1,3,5,6,9},new int[]{3,9,10,15});
		for(int n: intersect){
			System.out.print(n + " ");
		}
		
		System.out.println();
		int[] A = new int[]{1,3,5,4};
		try {
			rotateArray(A, 3);
			for(int n: A){
				System.out.print(n + " ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		printPrimeFactors(35);
		System.out.println();
		printPrimes(35);
		System.out.println();
		System.out.println(squareRootWithoutMathLib(35) + " using Math library: " + Math.sqrt(35));
		
				
		// Permutation combination problems
		A = new int[]{1,1,3,4};
		printParanthesis(3);
		printCombinationSum(A, 6);
		printSubsets(A);
		System.out.println();
		printSizedSubsets(A, 3);
		System.out.println();
		permuteArray(A);
		System.out.println();
		permuteArrayDup(A);
		System.out.println();
		
		System.out.println("*****************************");
		System.out.println("*****************************");
		palindromePartioning("amamabcdcbam");
		System.out.println("*****************************");
		System.out.println("*****************************");
		
		hopPossibilities(new int[]{1,2,3}, 7);
		System.out.println("Total possible combinations with DP: " + hopPossibilitiesDP(new int[]{1,2,3}, 7));
		
		
		int result = sherlockAndAnagrams("abba");
        System.out.println(result);
        
        System.out.println(maxBinaryDistance(18));
        
        int[] test = new int[]{1,22,3,7,4,2,90,4,2};
        wigleSort(test);
        printArray(test);
        
//		Scanner in = new Scanner(System.in);
//        int q = in.nextInt();
//        for(int a0 = 0; a0 < q; a0++){
//            String sss = in.next();
//            int result = sherlockAndAnagrams(sss);
//            System.out.println(result);
//        }
        
        ListANode listARoot = new ListANode(1);
        listARoot.next = new ListANode(2);
        listARoot.next.next = new ListANode(3);
        listARoot.next.next.next = new ListANode(4);
        listARoot.next.next.next.next = new ListANode(5);
        listARoot.next.next.next.next.next = new ListANode(6);
        listARoot.arb = listARoot.next.next.next;
        listARoot.next.arb = listARoot.next.next.next.next.next;
        
        System.out.println();
        printListANode(listARoot);
        
        ListANode  newHead = copyList(listARoot);
        System.out.println();
        printListANode(newHead);
        
        
        List<Employee> elist = new LinkedList<Employee>();
        elist.add(new Employee("u1", 2000, 2006));
        elist.add(new Employee("u2", 2000, 2008));
        elist.add(new Employee("u3", 2004, 2007));
        elist.add(new Employee("u4", 2006, 2008));
        
        System.out.println(yearWithMaxEmployees(elist));
        
	}
	
	public static void printList(ListNode root){
		while(null != root){
			System.out.print(root.data + "->");
			root = root.next;
		}
		System.out.println();
	}
	
	public static void printArray(int[] A){
		for(int n: A){
			System.out.print(n + " ");
		}
	}
	
	
	/*
	 * reverse a String
	 */
	
	public static String reverseString(String s) {
        StringBuilder reverse = new StringBuilder(s);
        for(int i=0; i <= ((s.length() - 1)/2); i++){
            char temp = reverse.charAt(i);
            reverse.setCharAt(i, reverse.charAt(s.length() - 1 - i));
            reverse.setCharAt(s.length() - 1 - i,temp);
        }
        return reverse.toString();
    }
	
	/*
	 * Write a program that outputs the string representation of numbers from 1 to n.
	But for multiples of three it should output âFizzâ instead of the number and for the multiples of five output âBuzzâ. For numbers which are multiples of both three and five output âFizzBuzzâ.
	 */
	
	public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();
        for(int i=1; i<= n; i++){
            String printable = ((i%3 == 0) ? ((i%5 == 0)? "FizzBuzz" : "Fizz") : ((i%5 == 0)? "Buzz" : String.valueOf(i)));
            output.add(printable);
        } 
       return output;
    }
	
	/*
	 * Given an array of integers, every element appears twice except for one. Find that single one.

		Note:
		Your algorithm should have a linear runtime complexity. 
		Could you implement it without using extra memory?
		
		Using XOR method in solution. 
		a XOR 0=a
		a XOR a=0
		a XOR b XOR a = (a XOR a) XOR b = 0 XOR b = b
	 */
	
	public static int singleNumber(int[] nums) {
        if(null == nums || nums.length == 0)
            return -1;
        int result = nums[0];
        for(int i=1; i < nums.length; i++){
            result = result ^ nums[i];
        }
       return result; 
    }
	
	/*
	 * Given a binary tree, find its maximum depth.
		The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 */
	
	public static int maxDepth(TreeNode root) {
        if(null == root){
            return 0;
        }
        int ld, rd;
        if((ld = maxDepth(root.left)) > (rd = maxDepth(root.right))){
            return ld + 1;
        }
        else{
            return rd + 1;
        }        
    }
	
	/*
	 * Level traversal in binary tree
	 */
	
	public static void printTreeLevels(TreeNode root){
		if(null == root){
			return;
		}
		Queue<TreeNode> nodesToPrint = new LinkedList<TreeNode>();
		nodesToPrint.add(root);
		while(nodesToPrint.size() > 0){
			List<TreeNode> currLevel =  new LinkedList<TreeNode>();
			
			//needed since we are removing elements from queue
			int originalSize = nodesToPrint.size();
			for(int i=0; i<originalSize; i++){
				currLevel.add(nodesToPrint.remove());
			}
			for(int i=0; i < currLevel.size(); i++){
				System.out.print(currLevel.get(i).val);
				if(null != currLevel.get(i).left){
					nodesToPrint.add(currLevel.get(i).left);
				}
				if(null != currLevel.get(i).right){
					nodesToPrint.add(currLevel.get(i).right);
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Zig-zag traversal of binary tree
	 */
	
	
	public static void printZigzagTreeLevels(TreeNode root){
		
		if(null == root){
			return;
		}
		Stack<TreeNode> nodesToPrint = new Stack<TreeNode>();
		nodesToPrint.push(root);
		int level = 1;
		while(nodesToPrint.size() > 0){
			List<TreeNode> currLevel =  new LinkedList<TreeNode>();
			
			//needed since we are removing elements from queue
			int originalSize = nodesToPrint.size();
			for(int i=0; i<originalSize; i++){
				currLevel.add(nodesToPrint.pop());
			}
			for(int i=0; i < currLevel.size(); i++){
				System.out.print(currLevel.get(i).val);
				if(level%2 == 0){
					if(null != currLevel.get(i).left){
						nodesToPrint.push(currLevel.get(i).left);
					}
					if(null != currLevel.get(i).right){
						nodesToPrint.push(currLevel.get(i).right);
					}
				}
				else{
					if(null != currLevel.get(i).right){
						nodesToPrint.push(currLevel.get(i).right);
					}
					if(null != currLevel.get(i).left){
						nodesToPrint.push(currLevel.get(i).left);
					}
				}
			}
			level++;
			System.out.println();
		}
		
	}
	
	/*
	 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
	 */
	
	public static int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		return a;
	}
	
	/**
	    * Java method to find missing number in array of size n containing
	    * numbers from 1 to n only.
	    * can be used to find missing elements on integer array of 
	    * numbers from 1 to 100 or 1 - 1000
	    */

	private static int getMissingNumber(int[] numbers, int totalCount) { 
		int expectedSum = totalCount * ((totalCount + 1) / 2); 
		int actualSum = 0; 
		for (int i : numbers) { 
			actualSum += i; 
		} 
		return expectedSum - actualSum; 
	}
	
	private static void printMissingNumber(int[] numbers, int count) 
	{ 
		int missingCount = count - numbers.length; 
		BitSet bitSet = new BitSet(count); 
		for (int number : numbers) 
		{ 
			bitSet.set(number - 1); 
		} 
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count); 
		int lastMissingIndex = 0; 
		for (int i = 0; i < missingCount; i++) 
		{ 
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); 
			System.out.println(++lastMissingIndex); 
		} 
	}

	
	/*
	 * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

		For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
	 */
	
	private static void printRepeating(int arr[], int size)
	{
	  int i;
	  System.out.println("The repeating elements are:");
	  for (i = 0; i < size; i++)
	  {
	    if (arr[Math.abs(arr[i])] >= 0)
	      arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	    else
	    	System.out.println(Math.abs(arr[i]) + " ");
	  }
	}
	
	/*
	 * Except for numbers which are power of 2, n and n-1 only differ by 1 bit
	 * eg: 7(0111) & 6(0110) & 5(0101)
	 * For a number which is power of 2, there is only 1 bit set
	 * eg: 4(0100) & 8(1000) & 2(0010)
	 */
	private static int countSetBits(int n)
	{
	    int count = 0;
	    while (n != 0)
	    {
	      n &= (n-1) ;
	      count++;
	    }
	    return count;
	}
	
	/*
	 * Inorder Tree Traversal without Recursion
	 * Space & time compexity O(N)
	 */
	
	private static void iterInorder(TreeNode root){
		
		System.out.println("IterInorder output:");
		if(root == null)
			return;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode node = root;
		
		while(null != node){
			s.push(node);
			node = node.left;
		}
		
		while(!s.empty()){
			node = s.pop();
			System.out.println(node.val);
			
			if(null != node.right){
				node = node.right;
				while(null != node){
					s.push(node);
					node = node.left;
				}
			}
		}
		
		
	}
	
	private static void iterPreorder(TreeNode root){
		
		System.out.println("IterPreorder output:");
		if(null == root)
			return;
		
		TreeNode node = root;
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		while(null != node){
			System.out.println(node.val);
			s.push(node);
			node = node.left;
		}
		
		while(!s.empty()){
			node = s.pop();
			if(null != node.right){
				node = node.right;
				while(null != node){
					System.out.println(node.val);
					s.push(node);
					node = node.left;
				}
			}
		}
		
	}
	
	// An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(TreeNode root) {
         
        // Base Case
        if (root == null) {
            return;
        }
 
        // Create an empty stack and push root to it
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        nodeStack.push(root);
 
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {
             
            // Pop the top item from stack and print it
        	TreeNode mynode = nodeStack.peek();
            System.out.print(mynode.val + " ");
            nodeStack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }
	
    /*
     * Iterative function to do postorder traversal 
     */
	private static void iterPostorder(TreeNode root){
		
		if(null == root)
			return;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.add(root);
		TreeNode prev = null;
		TreeNode curr = null;
		while(!s.isEmpty()){
			curr = s.peek();
			if(null == prev || curr == prev.left || curr == prev.right){
				if(null != curr.left){
					s.add(curr.left);
				}else if(null != curr.right){
					s.add(curr.right);
				}else{
					System.out.print(curr.val);
					s.pop();
				}
			}
			else if(prev == curr.left){
				if(null != curr.right){
					s.add(curr.right);
				}else{
					System.out.print(curr.val);
					s.pop();
				}
			}
			else if(prev == curr.right){ // no need  to check if prev == curr.right
				System.out.print(curr.val);
				s.pop();
			}
			prev = curr;
		}
		
	}
	
	/*
     * Find out if tree is a BST using range.
     */
	
	private static boolean isBST(TreeNode root){
		return recursiveBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean recursiveBST(TreeNode root, int min, int max){
		if(null == root)
			return true;
		if(min <= root.val && root.val < max){
			return (recursiveBST(root.left, min, root.val) &&
					recursiveBST(root.right, root.val, max));
			
		}else
			return false;
		
		
	}
	
	
	/*
     * Find Lowest Common Ancestor of a BST.
     * it will also work for duplicates
     */
	
	private static TreeNode findLCAOfBST(TreeNode root, int left, int right){
		if(null == root)
			return null;
		if(root.val > left && root.val > right){
			return findLCAOfBST(root.left, left, right);
		}
		else if(root.val < left && root.val < right){
			return findLCAOfBST(root.right, left, right);
		}
		return root;
	}
	
	/*
     * Find Lowest Common Ancestor of a binary tree.
     */
	private static TreeNode findLCAOfBinaryTree(TreeNode root, TreeNode left, TreeNode right){
		if(null == root){
			return root;
		}
		if(root == left){
			return left;
		}
		if(root == right){
			return right;
		}
		TreeNode leftVal = findLCAOfBinaryTree(root.left, left, right);
		TreeNode rightVal = findLCAOfBinaryTree(root.right, left, right);
		if(null != leftVal && null != rightVal){
			return root;
		}
		else{
			return (null != leftVal? leftVal : rightVal);
		}
		
	}
	
//////////////////////	
	
	/*
     * Kth smallest element in BST.
     */
	
	private static int findKthSmallest(TreeNode root, int k){
		if(null == root){
			return -1;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		while(null != current){
			stack.push(current);
			current = current.left;
		}
		int count = 0;
		while(!stack.isEmpty()){
			current = stack.pop();
			count++;
			if(count == k){
				return current.val;
			}
			if(null != current.right){
				current = current.right;
				while(null != current){
					stack.push(current);
					current = current.left;
				}
			}
		}
		
		return -1;
	}
	
	
	/*
	 * Two string are anagrams
	 */
	
	static boolean isAnagram(String a, String b) {

		// test for invalid input   
		if( a == null || b == null || a.equals("") || b.equals("") )
		    throw new IllegalArgumentException();

		// initial quick test for non-anagrams
		if ( a.length() != b.length() )
		    return false;

		//this is important
		a = a.toLowerCase();
		b = b.toLowerCase();

		// populate a map with letters and frequencies of String b
		Map<Character, Integer> map = new HashMap<>();

		for (int k = 0; k < b.length(); k++){
		     char letter = b.charAt(k);    

		    if( ! map.containsKey(letter)){
		        map.put( letter, 1 );
		    } else {
		        Integer frequency = map.get( letter );
		        map.put( letter, ++frequency );
		    }
		}

		// test each letter in String a against data in the map
		// return if letter is absent in the map or its  frequency is 0
		// otherwise decrease the frequency by 1

		for (int k = 0; k < a.length(); k++){
		    char letter = a.charAt(k);

		    if( ! map.containsKey( letter ) )
		        return false;

		    Integer frequency = map.get( letter );

		     if( frequency == 0 )
		        return false;
		    else    
		        map.put( letter, --frequency);
		}
		// if the code got that far it is an anagram
		return true;
		}
	
	/*
	 * Two string are isomorphic
	 */
	
	public boolean isIsomorphic(String s, String t) {
	    if(s==null||t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
	 
	 
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	 
	        if(map.containsKey(c1)){
	            if(map.get(c1)!=c2)// if not consistant with previous ones
	                return false;
	        }else{
	            if(map.containsValue(c2)) //if c2 is already being mapped
	                return false;
	            map.put(c1, c2);
	        }
	    }
	 
	    return true;
	}
	
	/*
	 * kth largest element in unsorted array (use heap of size k. nlog(k) complexity)
	 * https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array-set-3-worst-case-linear-time/
	 */
	
	/*
	 * remove duplicates in an array
	 */
	
	/*
	 * find intersection of two sorted arrays in Java
	 */
	
	private static int[] findIntersection(int[] left, int[] right){
		if(null == left || null == right){
			return null;
		}
		int[] intersection = new int[left.length < right.length? left.length : right.length];
		int i = 0, j = 0, k = 0;
		while(i < left.length && j < right.length){
			if(left[i] == right[j]){
				intersection[k] = left[i];
				i++; j++; k++;
			}
			else if(left[i] < right[j]){
				i++;
			}
			else{
				j++;
			}
		}
		return intersection;
	}
	
	/*
	 * Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
	 * http://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
	 */
	
	private static int findSmallest(int[] array){
		if(null == array)
			return 1;
		int res = 1;
		int n = array.length;
		for(int i=0; i< n &&  array[i] <= res; i++){
			res= res + array[i];
		}
		return res;
	}
	
	/*
	 * reverse a linked list
	 */
	
	private static ListNode<Integer> reverseList(ListNode<Integer> head){
		
		
		ListNode<Integer> curr = head;
		ListNode<Integer> prev = null;
		ListNode<Integer> next = null;
		
		while(null != curr){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	/*
	 * reverse a linked list recursively
	 */
	
	private static ListNode<Integer> recursiveReverseList(ListNode<Integer> head){
		return 	recursiveReversal(head, null);
	}
	
	private static ListNode<Integer> recursiveReversal(ListNode<Integer> current , ListNode<Integer> previous){
		if(current.next == null){
			current.next = previous;
			return current;
		}
		ListNode<Integer> head = recursiveReversal(current.next, current);
		current.next = previous;
		return head;
	}
	
	
	/*
	 * Delete the given node of linkedlist in constant time
	 */
	
	private static void deleteNode(ListNode<Integer> input){
		
		if(null == input || null == input.next){
			return;
		}		
		input.data = (Integer) input.next.data;
		input.next = input.next.next;
				
	}
	
	/*
	 * Reverse a Linked List in groups of given size 
	 * http://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
	 */
	
	/*
	 * Longest Continuous Increasing Subsequence
	 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
	 */
	
	/*
	 * Largest Sum Contiguous Subarray
	 * Kadane's algorithm
	 */
	
	/*
	 * max-area-of-island
	 * https://leetcode.com/problems/max-area-of-island/solution/
	 */
	
	private static int maxAreaIsland(int[][] grid){
		
		if(null == grid || grid.length == 0)
			return 0;
		
		boolean[][] visit = new boolean[grid.length][grid[0].length];
		int maxArea = 0;
		
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[0].length; j++){
				if(grid[i][j] == 1 && !visit[i][j]){
					maxArea = Math.max(visit(i,j,grid,visit), maxArea);
				}
			}
		}
		return maxArea;		
	}
	
	private static int visit(int r, int c, int[][] grid, boolean[][] visit){
		if(r < 0 || r >= grid.length || 
				c < 0 || c >= grid[0].length ||
				grid[r][c] == 0 || visit[r][c]){
			return 0;
		}
		else{
			visit[r][c] = true;
			return (1 + 
					visit(r+1,c,grid,visit) +
					visit(r-1,c,grid,visit) +
					visit(r,c+1,grid,visit) +
					visit(r,c-1,grid,visit));
		}
		
		
	}
	
	public static void findWords(char[][] input, String dictionary[]){
	    if(null == input || input.length == 0) return;
	    
	    boolean[][] occupied = new boolean[input.length][];
	    for(int i = 0; i< occupied.length; i++){
	      occupied[i] = new boolean[input[i].length];
	    }
	    
	    StringBuilder currString = new StringBuilder();
	    for(int i = 0; i< input.length; i++){
	      for(int j = 0; j < input[i].length; j++){
	        if(!occupied[i][j]){          
	          wordVisit(input, occupied, currString, i, j,dictionary);
	        }
	      }
	    }
	    
	  }
	  
	  private static void wordVisit(char[][] input, boolean[][] occupied, StringBuilder currString, int i, int j, String dictionary[]){
	    if(i < 0 || i >= input.length || j < 0 || j >= input[i].length
	       || occupied[i][j]) return;
	    
	    currString.append(input[i][j]);
	    occupied[i][j] = true;
	    
	    if(null != currString && currString.length() > 0){
	      if(Arrays.asList(dictionary).contains(currString.toString())){
	        System.out.println(currString);
	      }
	    }
	    
	    wordVisit(input, occupied, currString, i-1, j-1,dictionary);
	    wordVisit(input, occupied, currString, i-1, j,dictionary);
	    wordVisit(input, occupied, currString, i-1, j+1,dictionary);
	    wordVisit(input, occupied, currString, i, j+1,dictionary);
	    wordVisit(input, occupied, currString, i+1, j+1,dictionary);
	    wordVisit(input, occupied, currString, i+1, j,dictionary);
	    wordVisit(input, occupied, currString, i+1, j-1,dictionary);
	    wordVisit(input, occupied, currString, i, j-1,dictionary);
	    
	    currString.deleteCharAt(currString.length()-1);
	    occupied[i][j] = false;
	    
	  }
	
	/*
	 * Given a linked list Rearrange it so that all items less than or equal to n are in left side
	 */
	  
	  public static ListNode<Integer> rearrangeLinkedList(ListNode<Integer> head, int num){
		  
		  if(null == head) return null;
		  
		  ListNode<Integer> curr = head;
		  ListNode<Integer> greaterStart = head;
		  
		  while(null != curr){
			  if(curr.data <= num){
				  int temp = greaterStart.data;
				  greaterStart.data = curr.data;
				  curr.data = temp;
				  greaterStart = greaterStart.next;
			  }
			  curr = curr.next;
		  }
		  
		  return head;
	  }
	  
	  public static ListNode<Integer> rearrangeLinkedListTwo(ListNode<Integer> head, int num){
		  if(null == head) return null;
		  ListNode<Integer> curr = head;
		  ListNode<Integer> leftHead = null;
		  ListNode<Integer> rightHead = null;
		  ListNode<Integer> leftTail = null;
		  ListNode<Integer> rightTail = null;
		  
		  while(null != curr){
			  if(curr.data <= num){
				  if(null == leftHead){
					  leftHead = leftTail = curr;
				  }
				  else{
					  leftTail.next = curr;
					  leftTail = leftTail.next;
				  }
			  }else{
				  if(null == rightHead){
					  rightHead = rightTail = curr;
				  }
				  else{
					  rightTail.next = curr;
					  rightTail = rightTail.next;
				  }
			  }
			  curr = curr.next;
		  }
		  if(null != rightTail) rightTail.next = null;
		  
		  if(null != leftTail){
			  leftTail.next = rightHead;
			  return leftHead;
		  }
		  else return rightHead;
	  }
	
	/*
	 * Wiggle Sort II
	 * https://leetcode.com/problems/wiggle-sort-ii/description/
	 */
	  
	  public static void wigleSort(int[] a){
		  if(null == a || a.length == 0) return;
		  
		  for(int i = 0; i < a.length; i +=2){
			  if(i > 0 && a[i-1] > a[i]){
				  swap(a, i-1, i);
			  }
			  if(i < (a.length-1) && a[i] < a[i+1]){
				  swap(a, i+1, i);
			  }
		  }
	  }
	
	/*
	 * Find All Numbers Disappeared in an Array
	 */
	
	/*
	 * LinkedList with one current and one random pointer. Create a copy of such linked list
	 */
	  
	  static class ListANode{
		  int data;
		  ListANode next;
		  ListANode arb;
			
		  ListANode(int data){
			this.data = data;
		}
	  }
	  
	  public static ListANode copyList(ListANode head){
		  
		  if(null == head) return null;
		  
		  ListANode curr = head;
		  
		  while(null != curr){
			  ListANode temp = new ListANode(curr.data);
			  temp.next = curr.next;
			  curr.next = temp;
			  curr = curr.next.next;
		  }
		  
		  curr = head;
		  while(null != curr){
			  ListANode arb = curr.arb;
			  if(null != arb){
				  curr.next.arb = arb.next;
			  }
			  curr = curr.next.next;
		  }
		  
		  curr = head;
		  ListANode newHead = curr.next;
		  while(null != curr){
			  ListANode dup = curr.next;
			  curr.next = dup.next;
			  if(null != dup.next){
				  dup.next = dup.next.next;
			  }
			  curr = curr.next;
		  }
		  
		  return newHead;
		  
	  }
	  
	  public static void printListANode(ListANode head){
		  ListANode curr = head;
		  while(null != curr){
			  System.out.print(curr.data + "->");
			  if(curr.arb != null){
				  System.out.print("arb("+ curr.arb.data + ")->");
			  }
			  curr = curr.next;
		  }
	  }
	
	/*
	 * print Matrix in spiral order
	 * 
	 * { 20, 18, 22, 20, 16 },
       { 18, 20, 18, 21, 20 },
       { 16, 18, 16, 20, 24 },
       { 25, 24, 22, 24, 25 },
       { 10, 12, 19, 15, 4 }
	 */
	
	static void spiralPrint(int x, int y, int a[][]){
		int m = x;	//m is number of rows
		int n = y;	//n is number of columns
		int r = 0;	// begin of row
		int c = 0;	//begin of column
		boolean oddMatrix = false;		
		if(null == a) return;
		if(x == 1){
			//print a[0][0 to y-1]
			return;
		}
		if(y == 1){
			//print a[0 to x-1][0]
			return;
		}		
		int count = 0; 		
		while(r < m && c < n){
			
			//print current top row
			for(int i = c; i<n ; i++){
				System.out.print("count " + count + ": " + a[r][i] + " ");
				count++;
			}
			r++;
			
			//print current rightmost column
			for(int i = r; i< m; i++){
				System.out.print("count " + count + ": " + a[i][n-1] + " ");
				count++;
			}
			n--;
			
			//print current last row
			 if(r < m){
				 for(int i = n-1; i >= c; i--){
					 System.out.print("count " + count + ": " + a[m-1][i] + " ");
					 count++;
				 }
				 m--;
			 }
			 
			 //print current leftmost column
			 if(c < n){
				 for(int i = m-1; i >= r; i--){
					 System.out.print("count " + count + ": " + a[i][c] + " ");
					 count++;
				 }
				 c++;
			 }
		}
		System.out.println();
	}
	
	/*
	 * Return array subsets : : https://leetcode.com/problems/subsets/ <- read this link very imp 
	 * 
	 * complexity O(n*(2^n)) : https://stackoverflow.com/questions/20711347/time-complexity-of-this-code-to-list-all-subsets-of-a-set
	 * for duplicates, add following line as 1st line of for loop
	 * if(i > index && nums[i] == nums[i-1]) continue;
	 * 
	 * http://www.mytechinterviews.com/combinations-of-a-string (subsets equivalent to combinations)
	 * 
	 * Follow up: Given a string find combinations of specific size
	 * 
	 */
	
	/*
	 * every permutation combination problem
	 * 
	 * 1) Can be solved using recursion
	 * 2) it has a terminating condition
	 * 3) And how to advance for loop.
	 * 4) what to check before calling recursion
	 * 4) with what params to call next recursive vall
	 * 5) how to erase state after each recursive call returns
	 */
	
	private static List<List<Integer>> subsets(int[] a){
		if(null == a || a.length == 0) return null;
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<Integer> tempList = new ArrayList<Integer>();
		backtrack(output, tempList, a, 0);
		return output;
	}
	
	private static void backtrack(List<List<Integer>> output, List<Integer> tempList, int[] a, int index){

		//imp to create the a new arraylist
		output.add(new ArrayList<Integer>(tempList));
		for(int i = index; i< a.length; i++){
			tempList.add(a[i]);
			backtrack(output, tempList, a, i+1);
			tempList.remove(tempList.size()-1);
		}
	}
	
	
	//same problem using array
	
	/*
	 * complexity is 2^n. when n = 3, array has 3 numbers. each number can be in set or might not be in set. so 2 possibilities for each number
	 * 0 0 0
	 * 0 0 1
	 * 0 1 0
	 * 0 1 1
	 * 1 0 0
	 * 1 0 1
	 * 1 1 0
	 * 1 1 1 = 2^3 = 8 possibilities. Complexity 2^n
	 */
	public static void printSubsets(int[] a){
        int[] temp = new int[a.length];
        Arrays.sort(a);
        printRSubsets(a, temp, 0, 0);
    }
    
    private static void printRSubsets(int[] a, int[] temp, int tempIndex, int currAIndex){
        for(int i = 0 ; i < tempIndex; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        for(int i = currAIndex; i < a.length; i++){
        	if(i > currAIndex && a[i] == a[i-1]) continue; // this will avoid duplicates
            temp[tempIndex] = a[i];
            printRSubsets(a, temp, tempIndex + 1, i+1);
            temp[tempIndex] = 0;
        }      
    }
    
    /*
     * Print subsets of specific size
     */
    public static void printSizedSubsets(int[] a, int size){
        int[] temp = new int[a.length];
        Arrays.sort(a);
        printRSizedSubsets(a, temp, 0, 0, size);
    }
    
    private static void printRSizedSubsets(int[] a, int[] temp, int tempIndex, int currAIndex, int size){
        if(tempIndex == size){
            for(int i = 0 ; i < tempIndex; i++){
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = currAIndex; i < a.length; i++){
        	if(i > currAIndex && a[i] == a[i-1]) continue;
            temp[tempIndex] = a[i];
            printRSizedSubsets(a, temp, tempIndex + 1, i+1, size);
            temp[tempIndex] = 0;
        }      
    }
	
	
	/*
	 * Return array permutations https://leetcode.com/problems/permutations/
	 * 
	 * https://leetcode.com/problems/subsets/ <- read this link very imp
	 * 
	 * read method where you swap value and swap back: https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
	 * 
	 * another variation would be : find next permutation
	 * 
	 */
	
    //complexity n^n
    
	public List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   List<Integer> tempList = new ArrayList<Integer>();
		   Set<Integer> tempSet = new HashSet<Integer>();
		   backtrack(list, tempList, tempSet, nums);
		   return list;
		}

		private void backtrack(List<List<Integer>> list, List<Integer> tempList, Set<Integer> tempSet, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempSet.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         tempSet.add(nums[i]);
		         backtrack(list, tempList, tempSet, nums);
		         tempList.remove(tempList.size() - 1);
		         tempSet.remove(nums[i]);
		      }
		   }
		}
		
		// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
		//complexity n!
		
		public static void permuteArray(int[] a){
			if(null == a || 0 == a.length) return;
		    permuteRecursive(a, new int[a.length], 0, 0);        
		}
		        
		public static void permuteRecursive(int[] a, int[] temp, int tempPos, int currPos){
		      if(tempPos == a.length){
		          for(int i: temp){
		              System.out.print(i);
		          }
		          System.out.println();
		      }
		      else{
		          for(int i = currPos; i < a.length; i++){
		              temp[tempPos] = a[i];
		              swap(a, i, currPos);
		              permuteRecursive(a, temp, tempPos + 1, currPos + 1);
		              swap(a, i, currPos);
		              temp[tempPos] = 0;
		          }
		      }
		}

		private static void swap(int[] a,int i,int j){
		    int temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
		}
		
		//When array has duplicates
		////complexity n!*n
		
		public static void permuteArrayDup(int[] a){
		    Arrays.sort(a);
		    permuteRecursiveDup(a, new int[a.length], 0, 0);        
		}
		        
		public static void permuteRecursiveDup(int[] a, int[] temp, int tempPos, int currPos){
		      if(tempPos == a.length){
		          for(int i: temp){
		              System.out.print(i);
		          }
		          System.out.println();
		      }
		      else{
		          for(int i = currPos; i < a.length; i++){
		              if(i > currPos && a[i] == a[i-1]) continue;          
		              temp[tempPos] = a[i];
		              shift(a, currPos, i, true);
		              permuteRecursiveDup(a, temp, tempPos + 1, currPos + 1);
		              shift(a, currPos, i, false);
		              temp[tempPos] = 0;
		          }
		      }
		}

		private static void shift(int[] a, int start, int end, boolean shiftRight){
		    if(shiftRight){
		        int temp = a[end];
		        for(int i = end -1; i>= start; i--){
		            a[i+1] = a[i];
		        }
		        a[start] = temp;
		    }else{
		        int temp = a[start];
		        for(int i = start+1; i<=end; i++){
		            a[i-1] = a[i];
		        }
		        a[end] = temp;
		    }
		}
		
	/*
	 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
		The same repeated number may be chosen from C unlimited number of times.
	 */
		
		public static void printCombinationSum(int[] input, int sum){
	        printRecursiveCombinations(input, new LinkedList<Integer>(), sum, 0);
	    }
	    
	    private static void printRecursiveCombinations(int[] input, List<Integer> temp, int sum, int currPointer){
	    
	        if(sum == 0){
	            for(Integer i: temp){
	                System.out.print(i);
	            }
	            System.out.println();
	            return;
	        }
	        else if(sum < 0){
	            return;
	        }
	        else{
	           for(int i = currPointer; i < input.length; i++){
	               sum -= input[i];
	               temp.add(input[i]);
	               printRecursiveCombinations(input, temp, sum, i);
	               temp.remove(temp.size()-1);
	               sum += input[i];
	           }
	        }
	    }
	    
	    // When you cannot use the same element with skip duplicates
	    // can it be solved using dynamic programming?
	    
	    /*
	     * input = 1 3 7 6
	     * 		1	2	3	4
	     * 1	1	4	11	17
	     * 2		3	10	16
	     * 3			7	13
	     * 4				6
	     * 
	     * a[i][j] = a[i][j-1] + a[i+1][j] - a[i+1][j-1]
	     * 
	     * With this approach, you are missing 1+7 = 8 or 1+6 = 7. So this approach is not correct
	     * Above approach can only be used if we want to paritition it without disturbing the sequence 
	     * (eg: partition a palindrome)
	     * so use combination approach. complexity 2^n same as subsets problem
	     */
	    
	    public static void printCombinationSumNoRepeat(int[] input, int sum){
	    	Arrays.sort(input);
	        printRecursiveCombinationsNoRepeat(input, new LinkedList<Integer>(), sum, 0);
	    }
	    
	    private static void printRecursiveCombinationsNoRepeat(int[] input, List<Integer> temp, int sum, int currPointer){
	    
	        if(sum == 0){
	            for(Integer i: temp){
	                System.out.print(i);
	            }
	            System.out.println();
	            return;
	        }
	        else if(sum < 0){
	            return;
	        }
	        else{
	           for(int i = currPointer; i < input.length; i++){
	        	   if(i > currPointer && input[i] == input[i-1]) continue; // skip duplicates
	               sum -= input[i];
	               temp.add(input[i]);
	               printRecursiveCombinationsNoRepeat(input, temp, sum, i+1);
	               temp.remove(temp.size()-1);
	               sum += input[i];
	           }
	        }
	    }
	    
		
	/*
	 * given n, print all possible bracket combinations possible
	 * n = 3 -> ()()() / (())() / ()(()) / ((())) / (()())
	 * n = 4 -> (((())))/ ((()())) / ((())()) / ((()))() / (()(())) / (()()()) / (()())() / (())(()) / ...
	 * n = 2 -> (()) / ()()
	 * 
	 * for complexity analysis: https://leetcode.com/articles/generate-parentheses/ 
	 */
		
		public static void printParanthesis(int n){
			printRecursiveParanthesis(n,n,new StringBuilder());
	    }
		
		private static void printRecursiveParanthesis(int openPara, int closedPara, StringBuilder curr){
	        if(openPara == 0 && closedPara == 0){
	           System.out.println(curr.toString());
	        } 
	        else{
	            if(openPara > 0){
	                curr.append("(");
	                openPara--;
	                printRecursiveParanthesis(openPara, closedPara, curr);
	                openPara++;
	                curr.deleteCharAt(curr.length()-1);
	            }
	            if(closedPara > 0 && closedPara > openPara){
	                curr.append(")");
	                closedPara--;
	                printRecursiveParanthesis(openPara, closedPara, curr);
	                closedPara++;
	                curr.deleteCharAt(curr.length()-1);
	            }
	        }
	    }
		
		/*
		 *Given a string s, partition s such that every substring of the partition is a palindrome.
		Return all possible palindrome partitioning of s.
		For example, given s = "aab",
		Return
		[
		  ["aa","b"],
		  ["a","a","b"]
		]
		 coplexity n^2
		 
		 https://www.geeksforgeeks.org/dynamic-programming-set-17-palindrome-partitioning/
		
		*/
		
		public static List<String> palindromePartioning(String s){
	        
	        String[][] subsets = new String[s.length()][];
	        boolean[][] isPalindrome = new boolean[s.length()][];
	        List<String> palindromes = new LinkedList<String>();
	        for(int i = 0 ; i < s.length(); i++){
	            subsets[i] = new String[s.length()];
	            isPalindrome[i] = new boolean[s.length()];
	        }       
	        for(int k = 0; k < s.length(); k++){
	            int i = 0;
	            int j = k;
	            while(i < s.length() && j < s.length()){
	                if(i == j){
	                   subsets[i][j] = Character.toString(s.charAt(i));
	                   isPalindrome[i][j] = true;
	                   palindromes.add(subsets[i][j]);
	                   System.out.println(subsets[i][j]); 
	                }
	                else{
	                    subsets[i][j] = new String(subsets[i][j-1] + s.charAt(j));
	                    if(s.charAt(i) == s.charAt(j) && ( null == subsets[i+1][j-1] || isPalindrome[i+1][j-1])){
	                        isPalindrome[i][j] = true;
	                        palindromes.add(subsets[i][j]);
	                        System.out.println(subsets[i][j]);
	                    }
	                }
	                i++;
	                j++;
	            }
	        }
	        printPalindromePartitions(isPalindrome, 0, new LinkedList<String>(), s);
	        System.out.println(minPartitions(isPalindrome,s));
	        
	        return palindromes;
	    }
		
		public static int minPartitions(boolean[][] isPalindrome, String s){
			int count = 0;
			for(int i = 0; i < s.length();){
				for(int j = s.length() - 1; j >=i; j--){
					if(isPalindrome[i][j]){
						count++;
						i = j+1;
						break;
					}
				}
			}
			return (count-1);
		}
		
		public static void printPalindromePartitions(boolean[][] isPalindrome, int i, List<String> partitions, String s){
			
			if(i >= s.length()){
				for(String temp: partitions){
					System.out.print(temp + "|");
				}
				System.out.println();
			}
			else{
				for(int j = i; j < s.length(); j++){
					if(isPalindrome[i][j]){
						partitions.add(s.substring(i, j+1));
						printPalindromePartitions(isPalindrome, j+1, partitions, s);
						partitions.remove(partitions.size()-1);
					}
				}
			}
			
		}
	
	/*
	 * Metrix is sorted row and column wise:
	 * 
	 * 1 2 3
	 * 3 5 6
	 * 7 8 9
	 * 
	 * Check if given number is present in metrix
	 * 
	 */
	
	/*
	 * Metrix is sorted row and column wise:
	 * 
	 * 1 5 10
	 * 3 9 11
	 * 5 10 15
	 * 
	 * Check if given number is present in metrix 
	 */
	
	
	/*
	 * Integer to string
	 * String to integer without using libraries
	 */
	
	/*
	 * rotate a matrix
	 */
	
	/*
	 * recursive linkedlist reversal
	 */
	
	
	/*
	 * print linked list in reverse order.
	 */
	
	/*
	 * pagination
	 */
	
	/*
	 * activity log of user
	 */
	
	/*
	 * design facebook messenger
	 */
	
	/*
	 * Check if there is a cycle in the graph
	 * https://www.geeksforgeeks.org/detect-cycle-undirected-graph/ 
	 */
	
	/*
	 * Return distance between two nodes of a binary tree. 
	 */
	
	/*
	 * rotate an array 'k' times in O(n)
	 */
	
	private static void rotateArray(int[] A, int k) throws Exception{
		
		if(null == A || A.length == 0) return;
		if(k > A.length) throw new Exception("Invalid k");
		int curIndex = 0;
		int curNum = A[0];
		for(int i = 0; i < A.length; i++){
			int nextIndex = getIndex(k, curIndex, A.length);
			int temp = A[nextIndex];
			A[nextIndex] = curNum;
			curNum = temp;
			curIndex = nextIndex;
		}
	}
	
	private static int getIndex(int k, int input, int size){
		int index = input - 						k;
		return (index < 0 ? (index + size): index);
	}
	
	/*
	 * Given an array find length of smallest subsequense with sum >= k
	 */
	
	/*
	 *  For the key values 1...numKeys, how many structurally unique
 		binary search trees are possible that store those keys?
	 */
	
	public static int countTrees(int numKeys) {
		 if (numKeys <=1) {
			 return(1);
		 }
		 else {
			 // there will be one value at the root, with whatever remains
			 // on the left and right each forming their own subtrees.
			 // Iterate through all the values that could be the root...
			 int sum = 0;
			 int left, right, root;
			 for (root=1; root<=numKeys; root++) {
				 left = countTrees(root-1);
				 right = countTrees(numKeys - root);
				 // number of possible trees with this root == left*right
				 sum += left*right;
			 }
			 return(sum);
		 }
	}
	
	/*
	 * Using dynamic programming
	 */
	
	public int numTrees(int n) {
	    int [] G = new int[n+1];
	    G[0] = G[1] = 1;
	    
	    for(int i=2; i<=n; ++i) {
	    	for(int j=1; j<=i; ++j) {
	    		G[i] += G[j-1] * G[i-j];
	    	}
	    }

	    return G[n];
	}
	
	/*
	 * Edit distance using dynamic programming
	 */
	
	/*
	 * longest common subsequence using dynamic programming
	 */
	
	/*
	 * prime factors of a number
	 * There can be at most 1 prime factor of n greater than sqrt(n)
	 */
	
	public static void printPrimeFactors(int n){
		
		while(n%2 == 0){
			System.out.print(2 + " ");
			n = n/2;
		}
		//at end of 1st while loop n is odd. Next loop can be moved i+2, skipping all even numbers
		
		for(int i = 3; i <= Math.sqrt(n); i=i+2 ){
			while(n%i == 0){
				System.out.print(i + " ");
				n = n/i;
			}
		}
		
		/*  If all prime factors are less than Math.sqrt(n), n would become 1 at the end of 2nd for loop.
		 *  Only if there is a prime factor > Math.sqrt(n) (there can bre at most 1), condition below would take care of it
		 */
		if(n > 2){
			System.out.print(n);
		}
		
	}
	
	/*
	 * prime numbers between 1 to n
	 * 
	 * (sqrt(n) * sqrt(n)) = n. if one prime number is > than sqrt(n)), multiples of this number which result in a product
	 * less that n have to be less than sqrt(n). These products will  already be cut off when we iterate from 
	 * 2 to i <= Math.sqrt(n)
	 */
	
	public static void printPrimes(int n){ 
		boolean[] prime = new boolean[n + 1];
		for(int i = 0; i<=n; i++) {
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(prime[i]){
				for(int j = i*2; j <= n; j=j+i){
					prime[j] = false;
				}
			}
		}
		
		for(int i = 0; i<=n; i++) {
			if(prime[i])
				System.out.print(i + " ");
		}
		
	}
	
	/*
	 * find square root of a number without using math library
	 */
	
	public static double squareRootWithoutMathLib( double square ){
		double begin = 0;
		double end = square;
		double mid = 0;
		double error = 0.00001;
		while(begin <= end){
			mid = (begin + end) /2;
			double curSquare = (mid * mid);
			if(Math.abs(curSquare - square) <= error){
				return mid;
			}
			else if(curSquare < square){
				begin = mid;
			}else{
				end = mid;
			}
		}
		return mid;
	}
	
	
	/*
	 * swap number without using temp variable
	 */
	
	public static void swapWithoutTemp(int a, int b){
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	/*
	 * GCD of two numbers (can also be done recursively)
	 */
	
	public static int findGCD(int a, int b){
		while(b != 0){
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	public static int countOnes(int num){
		int count = 0;
		
		while(num != 0){
			count++;
			num = num & (num-1);
		}
		return count;
	}
	
	public static int reverseNumBitwise(int num){
		int result = 0;
		for(int i = Integer.SIZE; i > 0; i--){
			result = result << 1;
			if((num & 1) == 1){
				result = result | 1;
			}
			num = num >> 1;
		}
		return result;
	}
	
	/*
	 * Roman number to integer, integer to roman
	 */
	
	
	/*
	 * Given a number n that represents n lockers and n students. 
	 * All lockers start closed. First student goes and opens all the lockers. 
	 * Second goes and toggles 2nd, 4th, 6th.. lockers. Third student toggles 3rd, 6th, 9th.. lockers. 
	 * Print the lockers that remain open after all students pass.
	 * 
	 * https://www.careercup.com/question?id=6263110739427328
	 * 
	 */
	
	/*
	 * https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
	 */
	
	/*
	 * Reservoir Sampling and shuffle a given array
	 */
	
	/*
	 * you have given a matrix. find number of paths that can lead from a given source block to given destination block. 
	 * You can only travel to right or below.
	 */
	
	/*
	 * https://www.careercup.com/question?id=5637861714952192
	 */
	
	/*
	 * Print Matrix diagonally
	 */
	
	public static void printMatixDiagonally(int[][] input){
		if(null == input || input.length == 0){
			return;
		}
		int rowLength = input.length;
		int columnLength = input[0].length;
		for(int r = rowLength -1; r >=0; r--){
			int columnStart = 0;
			int rowStart = r;
			while(columnStart<columnLength && rowStart<rowLength){
				System.out.print(input[rowStart][columnStart] + " ");
				rowStart = rowStart + 1;
				columnStart = columnStart + 1;
			}
			System.out.println();
		}
		for(int c = 1; c<columnLength ; c++){
			int columnStart = c;
			int rowStart = 0;
			while(columnStart < columnLength && rowStart < rowLength){
				System.out.print(input[rowStart][columnStart] + " ");
				rowStart++;
				columnStart++;
			}
			System.out.println();
		}
	}
	
	/*
	 * Print Matrix diagonally in zig zag manner
	 */

	public static void printMatixDiagonallyZigZag(int[][] input){
		if(null == input || input.length == 0){
			return;
		}
		int rowLength = input.length;
		int columnLength = input[0].length;
		boolean topDown = true;
		for(int r = rowLength -1; r >=0; r--){
			if(topDown){
				int columnStart = 0;
				int rowStart = r;
				while(columnStart<columnLength && rowStart<rowLength){
					System.out.print(input[rowStart][columnStart] + " ");
					rowStart = rowStart + 1;
					columnStart = columnStart + 1;
				}
				topDown = !topDown;
			}else{
				int rowStart = rowLength-1;
				int columnStart = rowStart - r;
				while(columnStart >= 0 && rowStart >= 0){
					System.out.print(input[rowStart][columnStart] + " ");
					rowStart--;
					columnStart--;
				}
				topDown = !topDown;
			}
			System.out.println();
		}
		for(int c = 1; c<columnLength ; c++){
			if(topDown){
				int columnStart = c;
				int rowStart = 0;
				while(columnStart < columnLength && rowStart < rowLength){
					System.out.print(input[rowStart][columnStart] + " ");
					rowStart++;
					columnStart++;
				}
				topDown = !topDown;
			}
			else{
				int columnStart = columnLength-1;
				int rowStart = columnStart - c;
				while(columnStart >= 0 && rowStart >= 0){
					System.out.print(input[rowStart][columnStart] + " ");
					rowStart--;
					columnStart--;
				}
				topDown = !topDown;
			}
			System.out.println();
		}
	}
	
	//If you can hop 1, 2, or 3 steps at a time, calculate the total number of possible combinations for `n` steps.
	// Count(n) = count(n-1) + count(n-2) + count(n-3)
	
	
	public static List<List<Integer>> hopPossibilities(int[] hops, int distance){
		List<List<Integer>> out = new LinkedList<List<Integer>>();
		List<Integer> currList = new LinkedList<Integer>();
		Arrays.sort(hops);
		iterativeHopsOrderMatters(out, currList, hops, distance, 0);
		
		for(List<Integer> out1: out){
			for(Integer i: out1){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("Total possible combinations: " + out.size());
		
		return out;
	}
	
	public static int hopPossibilitiesDP(int[] hops, int distance){
		if(distance == 0) return 0;
		int a = 1, b=2, c= 4;
		if(distance == 1) return a;
		if(distance == 2) return b;
		if(distance == 3) return c;
		int d;
		for(int i = 4; i<=distance; i++){
			d = a+b+c;
			a=b;
			b=c;
			c=d;
		}
		return c;
	}
	
	//order doesn't matter
	private static void iterativeHops(List<List<Integer>> out, List<Integer> currList, int[] hops, int distance, int curPos){
		if(distance == 0){
			out.add(new LinkedList<Integer>(currList));
			return;
		}
		else if(distance < 0){
			return;
		}
		else{
			for(int i = curPos ; i < hops.length; i++){
				currList.add(hops[i]);
				iterativeHops(out, currList, hops, distance - hops[i], i);
				currList.remove(currList.size()-1);
			}
		}
	}
	
	//order matters
		private static void iterativeHopsOrderMatters(List<List<Integer>> out, List<Integer> currList, int[] hops, int distance, int curPos){
			if(distance == 0){
				out.add(new LinkedList<Integer>(currList));
				return;
			}
			else if(distance < 0){
				return;
			}
			else{
				for(int i = 0 ; i < hops.length; i++){
					currList.add(hops[i]);
					iterativeHopsOrderMatters(out, currList, hops, distance - hops[i], i);
					currList.remove(currList.size()-1);
				}
			}
		}
		
	/*
	 * Given a string , find the number of "unordered anagrammatic pairs" of substrings. In other words, find the number of unordered pairs of substrings of  that are anagrams of each other.
	
	Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
	
	https://github.com/charles-wangkai/hackerrank/blob/master/sherlock-and-anagrams/Solution.java
	 */
		
		static int sherlockAndAnagrams(String s){
	        // Complete this function
	        List<String> subStringList = new LinkedList<String>();
	        StringBuilder curr = new StringBuilder();
	        //O(n^2) complexity
	        for(int i = 0; i < s.length(); i++){
	            recursSherlockAndAnagrams(subStringList, s, curr, i);
	        }
	        
	        //sorting would take nlon(n)
	        Map<String, Integer> anagramMap = constructAnagramSets(subStringList);
	        int totalPairs = 0;
	        if(null != anagramMap){
	            for(Integer count: anagramMap.values()){
	                totalPairs = totalPairs + ((count*(count-1))/2);
	            }
	        }
	        return totalPairs;
	    }   
	    
	    private static void recursSherlockAndAnagrams(List<String>subStringList, String s, StringBuilder curr, int pos){       
	        if(null != curr && 0 != curr.length()){
	            subStringList.add(curr.toString());
	        }
	        if(pos >= s.length()) return;
	        curr.append(s.charAt(pos));
	        recursSherlockAndAnagrams(subStringList, s, curr, pos+1);
	        curr.deleteCharAt(curr.length() - 1);
	        
	    }
	    
	    private static Map<String, Integer> constructAnagramSets(List<String> subStringList){
	        if(null == subStringList || subStringList.isEmpty()){
	            return null;
	        }
	        Map<String, Integer> anagramMap = new HashMap<String, Integer>();
	        for(String s : subStringList){
	            if(null != s && 0 != s.length()){
	                char[] a = s.toCharArray();
	                Arrays.sort(a);
	                String key = new String(a);
	                // System.out.println(s + " key: "+ key);
	                if(anagramMap.containsKey(key)){
	                    anagramMap.put(key,(anagramMap.get(key)+1));
	                }else{
	                    anagramMap.put(key,1);
	                }               
	            }
	        }
	        return anagramMap;
	    }
	    
	    /*
	     * given a number give maximum distance between to 1s  in number's binary form
	     */
	    
	    /*
	     * https://www.careercup.com/question?id=5759894012559360
	     */
	    
	    public static int maxBinaryDistance(int num){
	        int max_distance = 0;
	        int currDistance = 0;
	        
	        while(num > 0){
	            if((num & 1) == 1){
	                if(max_distance < currDistance){
	                    max_distance = currDistance;
	                }
	                currDistance = 1;
	            }else{
	                if(currDistance > 0){
	                    currDistance++;
	                }
	            }
	            num = num >> 1;
	        }
	        return (max_distance-1);
	    }
	    
	    /*
         * 	User1 2000 2006
			User2 2000 2008
			User3 2004 2007
			User4 2006 2008
			
			Find year with max employees
         */
	    
	    public static class Employee{
	    	String name;
	    	int start;
	    	int end;
	    	
	    	public Employee(String name, int start, int end){
	    		this.name = name;
	    		this.start = start;
	    		this.end = end;
	    	}
	    }
	    
	    public static int yearWithMaxEmployees(List<Employee> input){
	    	
	    	if(null == input || input.isEmpty())  return -1;
	    	Map<Integer, Integer> countMap = new TreeMap<Integer, Integer>();	    	
	    	int maxYear = -1;
	    	for(Employee e : input){
	    		if(countMap.containsKey(e.start)){
	    			countMap.put(e.start, countMap.get(e.start)+1);
	    		}
	    		else{
	    			countMap.put(e.start, 1);
	    		}
	    		if(countMap.containsKey(e.end)){
	    			countMap.put(e.end, countMap.get(e.end)-1);
	    		}
	    		else{
	    			countMap.put(e.end, -1);
	    		}
	    	}	    	
	    	int maxNum = 0;
	    	Map.Entry<Integer, Integer> previous = null;
	    	for(Map.Entry<Integer, Integer> e: countMap.entrySet()){
	    		if(null != previous){
	    			e.setValue(e.getValue() + previous.getValue());
	    			if(maxNum < e.getValue()){
	    				maxNum = e.getValue();
	    				maxYear = e.getKey();
	    			}
	    		}
	    		previous = e;
	    	}	    	
	    	return maxYear;	    	
	    }

	
}
