// package Day 05;
// 1. you are given a string as you must convert it into a integer following some strict rules :-
//   ignore leading spaces
//   check signs 
//   read digits until unknown digit is found .
//   if number goes out of the int range you have to use char range 
//   if number goes out of the range you have to clamp it 
//   if no digits just return 0.
//   sample : Hello123
//   output : 0
//   sample : 12@Hello34511
//   output : 12
//   sample : 12@1244
//   output : 12

import java.util.*;
public class Prac {
    public static int convert(String s){

        // Scanner sc = new Scanner(System.in);
        // s = sc.nextLine();

        if(s==null || s.length()==0){
            return 0;
        }
        int i = 0;
        int n = s.length();
        int sign = 1;
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i==n) return 0;
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        long result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            if(sign == 1 && result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign * result);

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        // }
    }
    public static void main(String[] args){
        System.out.println(convert("Hello123"));
        System.out.println(convert("12@Hello34511"));
        System.out.println(convert("12@1244"));
        System.out.println(convert("   -42"));
        
    }

}
