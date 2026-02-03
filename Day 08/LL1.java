import java.util.*;
public class LL1 {
     class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addLast("is");
        System.out.println(list);
    }
}
