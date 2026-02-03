// Delete a ll
/* /

public class DeleteLL {

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
    static Node deleteAtHead(Node head, int d, int pos){
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
    static Node addElementPos(){}
    public static void main(String[] args){
        LinkedList1 lst = new LinkedList1();


    }    
}
*/



// DElete at a position 
class DeleteLL{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteNode(Node head, int position) {
        Node temp = head;

        // Head is to be deleted
        if (position == 1) {
            head = temp.next;
            return head;
        }

        // Traverse to the node before 
        // the one to be deleted
        Node prev = null;
        for (int i = 1; i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // Delete the node at the position
        prev.next = temp.next;

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("nullptr");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int position = 3;
        head = deleteNode(head, position);

        printList(head);
    }
}


