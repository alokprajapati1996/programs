public class BubbleSortingProgram {
    public static void bubbleSort(int arr[], int n) {
        int i, j, temp = 0;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] <= arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 5, 9, 1, 0, 4, 6, 7, 8, 10 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr, n);
        // System.out.println();

    }

}
