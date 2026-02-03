// package Day 08;

public class MergeSo {
    static class Node{
            int data;
            Node prev;
            Node next;
            Node(int d){
                this.data = d;
                this.next = null;
            }
        }
        static Node findMid(Node head){
            if(head == null || head.next!= null) return head;
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        static void mergeSo(Node head){
            if(head ==null || head.next == null)return;
            Node mid = findMid(head);
            Node right = mid.next;
            mid.next = null;
            mergeSo(head);
            mergeSo(right);
        }
    public static void main(String[] args) {
        
    }
}
