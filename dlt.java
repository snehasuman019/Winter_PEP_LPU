// Delete and travese 


public class dlt {
    static class Node{
        int data;
        Node next;

        Node(int d){ // constructor to initialize members
            this.data = d;
            this.next = null;
        }
    }
    static Node addElementFront(Node head, int d){
        Node newNode = new Node(d); // creating new node 
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    static Node addElementEnd(Node head, int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static Node addElementPos(Node head, int d, int pos){
        if(pos == 1){
            return addElementFront(head, d);
        }
        int idx = 1;
        Node temp = head;
        while(temp != null && idx != pos-1){
            temp = temp.next;
            idx++;
        }
        if(temp != null){
            Node newNode = new Node(d);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
    static Node deleteElementFront(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
    static Node deleteElementWithData(Node head, int d){
        if(head==null){
            return head;
        }
        Node temp = head;
        if(head.data == d){
            return deleteElementFront(head);
        }
        while(temp.next!= null && temp.next.data!=d ){
            temp = temp.next;
        }

        if(temp.next!=null){
                temp.next = temp.next.next;
        }
        return head;
    }
    static Node deleteElementAtPos(Node head, int pos){
        if(head == null){
            return head;
        }
        int p = 1; 
        Node temp = head;
        while(temp!=null && p!=pos){
            temp = temp.next;
            p++;
        }
        if(temp != null){
            temp.data = temp.next.data;
            temp.next = temp.next.next;
        }
        return head;
    }
    public static void traverse(Node head){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    static Node reversNode(Node head){
        if(head == null){
            return head;
        }
        Node prev = null, curr = head, next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        return prev;
    }
    static Node middleNode(Node head){
        if(head == null){
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        // 10 20 30 40 50 
        while(fast != null  &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static boolean palindrome(Node head){
        if (head == null || head.next == null) return true;
        Node middle = middleNode(head);
        middle = middle.next;

        Node rev = reversNode(middle.next);
        Node temp = head;
        while(rev != null){
            if(rev.data != temp.data){
                return false;
            }
            rev = rev.next;
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args){

        Node head = null;
        head = addElementEnd(head, 10);
        head = addElementEnd(head, 20);
        head = addElementEnd(head, 30);
        head = addElementEnd(head, 50);
        head = addElementEnd(head, 60);
        // head = addElementEnd(head, 20);
        traverse(head);
/*
        head = deleteElementFront(head);

        traverse(head);

        head = addElementPos(head, 12, 1);
        traverse(head);


        head = reversNode(head);
        traverse(head);

        Node middle = middleNode(head);
        System.out.println("Middle Node : "+ middle.data);*/

        boolean ans = palindrome(head);
        if(ans){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }    
}