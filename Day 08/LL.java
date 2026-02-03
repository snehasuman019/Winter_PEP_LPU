import java.util.*;
public class LL {

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // add -> first and last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
       Node currNode = head;
       while(currNode.next != null){
        currNode = currNode.next;
       }
       currNode.next = newNode;
    }

    // print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
       }
        System.out.println("Null");    
    }
    // Delete first.
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;  //head.next = null -> laastNode = null
        while(lastNode.next != null){  ///null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    }
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
    
}
