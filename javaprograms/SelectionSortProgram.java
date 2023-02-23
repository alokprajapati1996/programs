class SelectionSortProgram {
    public static void selectionSort(int arr[], int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {// 6,4,7,9,2 4<6 j is minimum

                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 5, 4, 8, 10, 7, 9, 2 };
        int n = arr.length;
        selectionSort(arr, n);
    }

}
