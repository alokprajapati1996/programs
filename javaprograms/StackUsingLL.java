
import java.util.Scanner;

import javax.xml.transform.sax.TemplatesHandler;

public class StackUsingLL {
    Node top = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(Scanner sc) {
        System.out.println("enter a data");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    void pop() {
        if (top == null) {
            System.out.println("contdion is underflow");

        } else {
            top = top.next;

        }
    }

    void peek() {
        System.out.println("peek: " + top.data);
    }

    void sizeOfLL() {
        Node temp = top;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        count++;
        System.out.println("size of ll: " + count);
    }

    void isEmpty() {
        if (top == null) {
            System.out.println("ll is empty");
        } else {
            System.out.println("ll is not empty");
        }
    }

    void display() {

        Node temp = top;
        while (temp.next != null) {
            System.out.print(temp.data + ">");
            temp = temp.next;
        }
    }

    class StackExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int d;
            StackUsingLL stk = new StackUsingLL();
            int l;
            do {
                System.out.println("press 1 for push");
                System.out.println("press 2 for pop");
                System.out.println("press 3 for size");
                System.out.println("press 4 for peek");
                System.out.println("press 5 for check empty");
                System.out.println("press 6 for display");

                System.out.println("enter your choice");
                d = sc.nextInt();
                switch (d) {
                    case 1: {
                        stk.push(sc);
                        break;
                    }
                    case 2: {
                        stk.pop();
                        break;

                    }
                    case 3: {
                        stk.sizeOfLL();
                        break;
                    }
                    case 4: {
                        stk.peek();
                        break;
                    }
                    case 5: {
                        stk.isEmpty();
                        break;
                    }
                    case 6: {
                        stk.display();
                        break;

                    }
                }
                System.out.println(" enter 0 to go back to main menu");
                System.out.println("enter any key to exit");
                l = sc.nextInt();
            } while (l == 0);
            System.out.println("exist sucessfully");
        }
    }
}
// }
// stk.push(1);
// stk.push(2);
// stk.push(3);
// stk.push(4);
// stk.sizeOfLL();
// stk.peek();
// stk.pop();
// stk.isEmpty();
// stk.display();

// }
// }
