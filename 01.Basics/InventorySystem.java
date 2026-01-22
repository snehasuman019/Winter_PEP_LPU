//package 01.Basics;

//you own a inventory system , you have n products 
// -for each product input current stock and minimum required stock 
// -if any product does not meets the required stock then print "Restock needed for product x"
// where x is the product number 
// print the total number of product that needs to be restocked"
// 
/* 
import java.util.Scanner;

public class InventorySystem{
    public static void main(String[] args){
        int n, cur_stock, req_stock, count =0;
        Scanner sc = new Scanner(System.in);             //
        System.out.println("Enter number of products: ");
        int a = sc.nextInt();
        for(int i =0;i<0;i++){
            System.out.println("Current stock of product " + (i+1) + ": ");
            cur_stock = sc.nextInt();
            System.out.println("Restock needed for product " + (i+1) + ": ");
            req_stock = sc.nextInt();
            if(cur_stock < req_stock){
                System.out.println("Restock needed for product " + (i+1));
                count++;

        }
        else{
            System.out.println("Requirement fullfiled");
                }


    }
    System.out.println("Total products to be restocked: " + count);
    sc.close();
}
}
*/


//take an input amount from the user , you have to divide this amount into higher denominations as possible of 2000, 500, and 100. 
// try to take the least number of notes possible
/* 

import java.util.Scanner;

public class InventorySystem{
    public static void main(String[] args){
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        amount = sc.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Amount cannot be dispensed using 2000, 500 and 100 notes only.");
            return;
        }
        int notes2000 = amount / 2000;
        amount = amount % 2000;
        int notes500 = amount /500;
        amount = amount % 500;
        int notes100 = amount /100;
        amount = amount % 100;
        System.out.println("Number of 2000 notes:"+notes2000);
        System.out.println("Number of 500 notes:"+notes500);
        System.out.println("Number of 100 notes:"+notes100);
        sc.close();

    }
}
*/

// write a progeam to print sum of numbers taken by user . NOTE : you have to take input till user enters 0 and then give the sum of all numbers
// 

import java.util.Scanner;

public class InventorySystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int num;
        System.out.println("Enter numbers (enter 0 to stop):");
        while(true){
            num = sc.nextInt();
            if(num ==0){
                break;  
            }
            sum = sum + num;
    }
    System.out.println("Sum of numbers = "+sum);
    sc.close();
}
}

     