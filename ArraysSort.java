import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int arr[] = { 5, 15, 46, 3, 8, 8, 9 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
