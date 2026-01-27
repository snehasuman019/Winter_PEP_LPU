// wap to count total number of words ina string or a message input by user

//wap to find first and last non repeating character in a string

//wap to take input of 2 string s1 and s2 and check whether s2 is substring of s1 or not

//there are two encrypted strings that are valid only if characters follow the same pattern
//ex:- s1="egg", s2="add" -> valid pattern

//

/* /
//NonRepeating 
import java.util.*;
public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        char f = '1';
        char l = '1';
        for(char c : map.keySet()){
            if(map.get(c)==1 && f== '1'){
                f=c;
            }else if(map.get(c)==1){
                l=c;
            }
        }
        if(f!='1')System.out.println("First non-repeating character "+f);
        else System.out.println(" First non-Repeating character ");
        if(l!='1') System.out.println("Last non- repeating character "+l);
        else System.out.println("Last non-Repeating character) ");
    }
}
    */


//two hashset
import java.util.*;
public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            if(set1.contains(s.charAt(i))){
                set1.remove(s.charAt(i));
                set2.add(s.charAt(i));
            }
            else if(!set2.contains(s.charAt(i))){
                set1.add(s.charAt(i));
            }
        }
        for(int i=0;i<s.length() ; i++){
            if(set1.contains(s.charAt(i))){
                System.out.println("First non-repeating character: "+s.charAt(i));
                break;
            }
        }
        for(int i = s.length()-1;i>=0;i--){
                if(set1.contains(s.charAt(i))){
                    System.out.println("Last non-repeating character: "+s.charAt(i));
                    break;
                }
            }
        }
    }

