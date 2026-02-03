// LinkedLists 

/* /

public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node addElementatFront(Node head, int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args){
        LinkedList lst = new LinkedList();

    } 
}
*/





public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node addElementatEnd(Node head, int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args){
        // LinkedList lst = new LinkedList();
         Node head = null;
        head = addElementatEnd(head, 10);
        head = addElementatEnd(head, 20);
        head = addElementatEnd(head, 30);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    } 
}



// public class LinkedList {
//     static class Node {
//         int data;
//         Node next;

//         Node(int d){
//             this.data = d;
//             this.next = null;
//         }
//     }

//     static Node addElementatEnd(Node head, int d){
//         Node newNode = new Node(d);
//         if(head == null){
//             head = newNode;
//             return head;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode; // FIXED
//         return head;
//     }

//     public static void main(String[] args){
//         Node head = null;
//         head = addElementatEnd(head, 10);
//         head = addElementatEnd(head, 20);
//         head = addElementatEnd(head, 30);

//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
// }
