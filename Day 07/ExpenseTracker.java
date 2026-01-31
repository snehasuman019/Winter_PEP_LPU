// package Day 07;
// 3,4,6,4,6
//you are given with an array that keeps track of your monthly expenses you have to find the total expenses spend between l to r days


public class ExpenseTracker {
    public static void main(String[] args){
        int[] arr = {3,4,6,4,6};
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i =1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int l = 2, r=4;
        int total = prefix[r]-(1>0?prefix[l-1] : 0);
        System.out.println("Total expenses from day" + l + " to " + r + " = " + total);
    }
    
    
}
