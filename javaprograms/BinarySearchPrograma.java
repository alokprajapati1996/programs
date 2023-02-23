import java.util.Scanner;

public class BinarySearchPrograma {
    static int binarySearch(int arr[], int left, int right, int value) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid + 1;

            } else if (arr[mid] > value) {
                return binarySearch(arr, left, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int right = n;
        int left = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter search element number");
        int value = sc.nextInt();
        int result = binarySearch(arr, left, right - 1, value);
        if (result == -1) {
            System.out.println("element is not persent in this list: " + value);
        } else {
            System.out.println("element persent in this list:" + result);
        }
    }

}
