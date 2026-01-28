// package Day 05;
// 2.there is a camera on a toll gate that keeps track of the vehicles passing every minute . Find the maximum vehicles passed in k consecutive minutes . 
//   input : You are given with an array and k 
//   output : Maximum number of vehicles passed in k consecutive minutes .
//   ex : [3,5,13,,8,12,5,18,2]          k=3

/* /
import java.util.*;
public class vehicles {
    public static void main(String[] args){
        int[] arr = {3,5,13,8,12,5,18,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length - k; i++){
            int sum =0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            
            }
            if(sum > max){
                max = sum;
            }

        }
        System.out.println("Maximum vehicles passed in "+ k + " consecutive minutes is : "+ max);

    }
}
    */

import java.util.*;
public class vehicles {
    public static void main(String[] args){
        int[] arr = {3,5,13,8,12,5,18,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length - k; i++){
            int sum =0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            
            }
            if(sum > max){
                max = sum;
            }

        }
        System.out.println("Maximum vehicles passed in "+ k + " consecutive minutes is : "+ max);

    }
}
