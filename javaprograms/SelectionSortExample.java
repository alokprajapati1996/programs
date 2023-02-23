public class SelectionSortExample {
    static void selectionSortMethod(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[small]) {

                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 18, 3, 1, 7, 4, 9, 5 };
        int n = arr.length;
        selectionSortMethod(arr, n);
    }
}
