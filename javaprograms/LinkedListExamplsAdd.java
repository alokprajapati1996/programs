public class LinkedListExamplsAdd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void AddMiddle(Node preNode, int data) {
        if (preNode == null) {
            System.out.println("the given privious nodecannot be null");

        }
        Node newNode = new Node(data);
        newNode.next = preNode.next;
        preNode.next = newNode;

    }

    public void AppendLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

    }

    public void PrintData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public void addPosition(int data, int posin) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < posin - 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedListExamplsAdd list = new LinkedListExamplsAdd();
        list.AddFirst(7);
        list.AddFirst(9);
        list.AddFirst(11);

        list.AppendLast(10);
        list.AppendLast(30);
        list.AddMiddle(list.head.next, 12);
        list.AddMiddle(list.head.next, 8);
        list.addPosition(20, 3);
        list.PrintData();

    }
}