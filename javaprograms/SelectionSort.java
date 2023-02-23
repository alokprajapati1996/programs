import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int temp, min, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter element of array");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before sorting element");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("after sorting element");
        for (i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
