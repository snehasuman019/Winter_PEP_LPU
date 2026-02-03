// package Day 06;
// 2. Given a input array in which we have a mix of positive and negative values . write an algo to sort its squared array. 
//    Input [-4,-1,0,3,10]      Output : [0,1,9,16,100]

import java.util.*;

public class Que2 {
    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        int n = arr.length;
        int sqr[] = new int[n];
        for(int i =0;i<n;i++){
            sqr[i] = arr[i] * arr[i];

        }
        
    }
}
