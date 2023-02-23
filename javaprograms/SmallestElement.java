import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter test case");
        int testcase = sc.nextInt();
        while (testcase > 0) {
            System.out.println("enter size of array");

            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter ellements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }

            int i, min = arr[0];
            for (i = 0; i < n; i++) {

                if (arr[i] < min)
                    min = arr[i];

            }
            System.out.println("minimum value of array: " + min);

            testcase--;
        }
    }

}
