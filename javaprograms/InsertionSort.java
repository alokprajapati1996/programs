
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            j = i;
            temp = arr[i];
            while (j > 0 && arr[j - 1] < temp) {

                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        for (j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

}
