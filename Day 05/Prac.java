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


public class Prac {
    public static void main(String[] args){
        String s = "   -42";
        int i = 0;
        int n = s.length();
        // ignore leading spaces
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        // check for sign
        int sign = 1;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        // read digits
        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            // check for overflow
            if(sign == 1 && result > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
                break;
            }else if(sign == -1 && -result < Integer.MIN_VALUE){
                result = - (long)Integer.MIN_VALUE;
                break;
            }
            i++;
        }
        result = result * sign;
        System.out.println((int)result);
    }
}
