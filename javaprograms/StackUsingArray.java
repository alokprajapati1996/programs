import java.util.Scanner;

public class StackUsingArray {
    int top = -1;
    int n = 10;
    // int arr[] = new arr[n];

    void push(Scanner sc) {
        if (top == n - 1) {
            System.out.println("condtion overflow");
        } else {
            // int i = sc.nextInt();
            top = top + 1;
            // arr[top] = i;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
