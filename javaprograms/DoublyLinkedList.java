public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    void insertionBegain(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }
    }

    public void InsertLast(int data) {
        Node newNode = new Node(data);
        if (tail.next == null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;

        }
    }

    void InsertPosition(int position, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        Node ptr = head.next;
        for (int i = 1; i < position - 1; i++) {

            temp = ptr;
            ptr = ptr.next;

        }

        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = ptr;
        ptr.prev = newNode;

    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("linked list is empty");
        } else {

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertionBegain(10);

        list.insertionBegain(9);
        list.insertionBegain(8);
        list.InsertLast(12);
        list.insertionBegain(7);
        list.InsertPosition(5, 11);
        list.display();
    }
}