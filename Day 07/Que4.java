// package Day 07;
// 4. WAP to count subarrays whose sum is divisible by k. find the count of subarrays
//    arr = {7,4,2,6,1,10} 

import java.util.*;
public class Que4 {
    public static int countSubarrays(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int x : arr){
            prefixSum += x;
            int rem = prefixSum % k;
            if(rem<0) rem += k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return count;

    }
    public static void main(String[] args){
        // int[] arr = {7,4,2,6,1,10};
        // int k =3;
        int[] arr = {4,9,-1,1,7,15};
        int k = 2;
        
        System.out.println(countSubarrays(arr, k));
    }
}
