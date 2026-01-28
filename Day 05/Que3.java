// 3. A mall record customer entries every hour . you are given an array where each element represents customers entering in that hour . find the maximum customer in k consecutive hours.
//  input : arr = [2,1,5,1,3,2]      k=3              possible output = 9

public class Que3 {
    public static void main(String[] args){
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<=arr.length - k;i++){
            int sum = 0;
            for(int j = i;j<i+k;j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println("Maximum customers in "+ k + " consecutive hours is : "+ max);
    }
}
