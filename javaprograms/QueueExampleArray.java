import java.util.Scanner;

public class QueueExampleArray {
    int front = -1;
    int rear = -1;
    int n = 10;
    int arr[] = new int[n];

    public void enqueFunction() {
        if (rear == (n - 1)) {
            System.out.println("array is OverFlow");
        } else {
            System.out.println("enter a enque data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if (front == -1 && rear == -1) {
                front += 1;
                rear += 1;
                // arr[front] = data;
                arr[rear] = data;
            } else {
                rear = rear + 1;
                arr[rear] = data;

            }

        }
    }

    public void dequeFunction() {
        if (front == -1 && rear == -1) {
            System.out.println("array is underflow");
        } else {
            front = front + 1;

        }

    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    class QueueSecond {

        public static void main(String[] args) {
            QueueExampleArray q = new QueueExampleArray();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int l, choice;
            do {
                System.out.println("enter 1 for enque");
                System.out.println("enter 2 for deque");
                System.out.println("eneter 3 for display");
                System.out.println("enter our choice");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        q.enqueFunction();
                        break;
                    }
                    case 2: {
                        q.dequeFunction();
                        break;
                    }
                    case 3: {
                        q.display();
                        break;
                    }
                }
                System.out.println("enter 0 if you want to go back program");
                System.out.println("enetr any key you  want to exit");
                l = sc.nextInt();
            } while (l == 0);
            System.out.println("exit successes fully");
        }
    }
}

// q.enqueFunction(10);
// q.enqueFunction(20);
// q.enqueFunction(30);
// q.enqueFunction(40);
// q.dequeFunction();
// q.display();
// }
