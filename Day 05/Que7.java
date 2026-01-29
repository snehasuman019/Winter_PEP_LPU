// 7. Network latency logs are given find the longest subarray with atmost two distinct values. 
//   Input : arr = [1,2,1,2,3]          
//   Output : 4


import java.util.*;

public class Que7 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 4;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0 )+1);
            while(mp.size()>2){
                int value = mp.get(arr[left]);
                value--;
                if(value==0){
                    mp.remove(arr[left]);
                } else {
                    mp.put(arr[left], value);
                }
                left++;                
            }
            maxLen = Math.max(maxLen, i - left + 1);
            System.out.println("Current max length of subarray with at most two distinct values: " + maxLen);
        }
    }
}
