import java.util.Arrays;

public class DublicateValue {
    public static int removeDoublicateValue(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        int temp[] = new int[n];
        int i, j = 0;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 36, 12, 58, 96, 36, 47, 47, 97, 97, 434 };
        Arrays.sort(arr);
        int n = arr.length;
        n = removeDoublicateValue(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// public static int removeDuplicateElements(int arr[], int n) {
// if (n == 0 || n == 1) {
// return n;
// }
// int[] temp = new int[n];
// int j = 0;
// for (int i = 0; i < n - 1; i++) {
// if (arr[i] != arr[i + 1]) {
// temp[j++] = arr[i];
// }
// }
// temp[j++] = arr[n - 1];
// // Changing original array
// for (int i = 0; i < j; i++) {
// arr[i] = temp[i];
// }
// return j;
// }

// public static void main(String[] args) {
// int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
// int length = arr.length;
// length = removeDuplicateElements(arr, length);
// // printing array elements
// for (int i = 0; i < length; i++)
// System.out.print(arr[i] + " ");
// }
// }
