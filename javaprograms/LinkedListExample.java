
public class LinkedListExample {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printLL() {
        Node newNode = head;
        while (newNode != null) {
            System.out.print(newNode.data + " ");
            newNode = newNode.next;

        }
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.head = new Node(1);
        Node second = new Node(2);
        Node thired = new Node(3);
        list.head.next = second;
        second.next = thired;

        list.printLL();

    }

}
