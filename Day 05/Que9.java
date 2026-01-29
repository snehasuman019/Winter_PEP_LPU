//  Given a sorted array, check if two numbers sum to X 
//   Input : arr = [1,2,4,6,10]        x = 8
//   Output : true if 2 , other false  

import java.util.*;
public class Que9 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,10};
        int x = 8;
        int i = 0;
        int j = arr.length -1;
        while (i<j){
            int sum = arr[i] + arr[j];
            if (sum == x){
                System.out.println("True");
                return;
            } else if (sum < x){
                i++;
            } else {
                j--;
            }

            
        }
        System.out.println("False");
        

        
    }
}
