public class InsertionSorting {

    static void insertionSort(int arr[], int n) {

        for (int i = 1; i <= n - 1; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (temp <= arr[j] && j > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 89, 6, 55 };
        int n = arr.length;
        insertionSort(arr, n);
    }
}
