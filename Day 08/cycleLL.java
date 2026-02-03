public class cycleLL {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // create cycle manually (for testing)
    void createCycle() {
        if (head == null || head.next == null) return;

        Node temp = head;
        Node join = head.next; // connect last node to 2nd node

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = join; // cycle created
    }

    // detect cycle
    boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps

            if (slow == fast) {
                return true; // cycle found
            }
        }

        return false; // no cycle
    }
}

public class Main {
    public static void main(String[] args) {
        cycleLL list = new cycleLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.createCycle(); // comment this line to test no cycle

        if (list.hasCycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle");
        }
    }
}

}