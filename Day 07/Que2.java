// package Day 07;
// find the number of subarrays that sum equals a 
   // arr = {6,-2,-4,10,-1,5}                 k=7;

import java.util.*;
public class Que2 {
    
    public static int countSubarrays(int[] arr, int k){
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : arr){
            currentSum += num;
            if(map.containsKey(currentSum - k)){
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {6,-2,-4,10,-1,5};
        int k =7;
        System.out.println("Total subarrays: " +countSubarrays(arr,k));
    }
}









