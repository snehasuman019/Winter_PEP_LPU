// 4. A finance app records daily profits and check if there exist a continuous periods whose sum equals target s.
//  input : arr = [1,4,20,3,10,5]
//  output : 20,3,10
//  s = 33 
/* /
import java.util.*;
public class Que4 {
    public static void main(String[] args){
        int[] arr = {1,4,20,3,10,5};
        int s = 33;
        
        findSubarrayWithSum(arr, s);
    }
    
    public static void findSubarrayWithSum(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int currentSum = 0;
        
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            
            // Shrink window from left if sum exceeds target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // Check if we found the target sum
            if (currentSum == target) {
                System.out.print("Output: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    if (i < end) System.out.print(",");
                }
                System.out.println();
                return;
            }
        }
        
        System.out.println("No subarray found with sum = " + target);
    }
}
*/


// import java.util.*;
// public class Que4 {
//     public static void main(String[] args){
//         int[] arr = {1,4,20,3,10,5};
//         int s = 33;
        

//     }
// }


import java.util.*;
public class Que4 {
    public static void main(String[] args){
        int[] arr = {1,4,20,3,10,5};
        int s = 23;
        
        sum(arr, s);
    }
    
    public static void sum(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int currentSum = 0;
        
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            
            // Shrink window from left if sum exceeds target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // Check if we found the target sum
            if (currentSum == target) {
                System.out.print("Output: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    if (i < end) System.out.print(",");
                }
                System.out.println();
                return;
            }
        }
        
        System.out.println("No subarray found with sum = " + target);
    }
}