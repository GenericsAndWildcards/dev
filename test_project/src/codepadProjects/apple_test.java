package codepadProjects;

public class apple_test {

}
/*
Given a list of 100 integers in random order. Each integer is from 1 to 9. Please walk through this list and print out all the pairs that sum up to 10. Each integer can only be paired once.

Input Example:
8, 1, 3, 6, 5, 8, 9, 5, 2, 3, 5, 2, 7, 6, 4, ...

Output Example:
(1, 9), (5, 5), (8, 2), (8, 2), (3, 7), (6, 4)
*/

//import java.util.*;
//
//public class Solution
//{
//    public static void main(String args[])
//    {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(8);
//        list.add(1);
//        list.add(3);
//        list.add(6);
//        list.add(5);
//        list.add(8);
//        list.add(9);
//        list.add(5);
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        list.add(2);
//        list.add(7);
//        list.add(6);
//        list.add(4);
//
//        //Solution.printPairs(list);
//        printPairs(list);      
//      
//    }
//
//    public static void printPairs(List<Integer> list)
//    {
//      int[] numCounts = new int[9];
//      
//      for(Integer num : list){
//        int pair = 10 - num;
//        if(numCounts[pair -1] > 0){
//          System.out.println("( " + num + "," + pair + " )");
//          numCounts[pair -1] = numCounts[pair -1] -1;
//        }
//        else{
//          numCounts[num - 1] = numCounts[num - 1] + 1;
//        }
//      }
//    }
//}
//
//
//
//
//
//You are writing a function which takes an input stream of integers. This function returns an
//integer which has the equal possibility been selected among all integers from this input stream.
//
//    public int randomFromInputStream(InputStream is)
//    {
//    }
//
//{1} => 1
//{1, 2} => 2 (assume) 2
//{2, 3} => 3 (assume)
//{pre_selected_number, n} => new_selected_num
