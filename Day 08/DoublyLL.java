

/*public class DoublyLL {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
            this.prev =null;
        }
    }
    static Node addElementAtHead(Node head, int d){
        Node newNode = new Node(d);
        if(head ==null) return newNode;
        newNode.next = head;
        head.prev = newNode;
        return newNode;

    }
    static Node addElementAtTail(Node head, int d){
        Node newNode = new Node(d);
        if(head == null) return newNode;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    static Node addElementAtPos(Node head, int d, int pos){
        Node newNode = new Node(d);
        if(head==null) return newNode;
        if(pos == 1) return addElementAtHead(head, d);
        Node temp = head;
        while(temp!=null && pos-2>0){  //can be modified accordingly   (20 && 0>0)
            temp = temp.next;
            pos--;

        }
        if(temp==null) return head;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    static Node deleteElementAtHead(Node head){
        if(head ==null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;

    }
    static Node deleteElementAtTail(Node head){
        if(head == null || head.next = null) return head;

            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
    static Node deleteElementWithData(Node head, int d, int pos){
        if(head==null || head.data==key) return null;
        Node temp = head;
        while(temp!=null && temp.data != key){ 
            temp = temp.next;

        }
        if(temp!=null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

        }
            return head;
    }

    public  static void main(String[] args){
        
        Node head = null;

        head = addElementAtHead(head, 10);
        head = addElementAtTail(head, 20);
        head = addElementAtTail(head, 30);
        head = addElementAtPos(head, 25, 3);

        System.out.println("After insertions:");
        printList(head);

        head = deleteElementAtHead(head);
        head = deleteElementAtTail(head);
        head = deleteElementWithData(head, 25);

        System.out.println("After deletions:");
        printList(head);
    }
}
*/


public class DoublyLL {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    // Add at head
    static Node addElementAtHead(Node head, int d) {
        Node newNode = new Node(d);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        return newNode;
    }

    // Add at tail
    static Node addElementAtTail(Node head, int d) {
        Node newNode = new Node(d);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Add at position
    static Node addElementAtPos(Node head, int d, int pos) {
        if (pos == 1) return addElementAtHead(head, d);

        Node temp = head;
        while (temp != null && pos - 2 > 0) {
            temp = temp.next;
            pos--;
        }

        if (temp == null) return head;

        Node newNode = new Node(d);

        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Delete head
    static Node deleteElementAtHead(Node head) {
        if (head == null) return null;

        head = head.next;

        if (head != null)
            head.prev = null;

        return head;
    }

    // Delete tail
    static Node deleteElementAtTail(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) temp = temp.next;

        temp.next = null;

        return head;
    }

    // Delete by value
    static Node deleteElementWithData(Node head, int key) {
        if (head == null) return null;

        if (head.data == key)
            return deleteElementAtHead(head);

        Node temp = head;

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null) return head;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        return head;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;

        head = addElementAtHead(head, 10);
        head = addElementAtTail(head, 20);
        head = addElementAtTail(head, 30);
        head = addElementAtPos(head, 25, 3);

        System.out.println("After insertions:");
        printList(head);

        head = deleteElementAtHead(head);
        head = deleteElementAtTail(head);
        head = deleteElementWithData(head, 25);

        System.out.println("After deletions:");
        printList(head);
    }
}
