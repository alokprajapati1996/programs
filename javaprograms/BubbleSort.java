import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter element of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before sorting element");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("after sorting element");
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}