class InsertionSortProgram {
    public static void insertionSort(int arr[], int n) {
        int i, temp;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;

        }
    }

    void Display(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 2, 9, 5, 7, 1, 4, 6, 8 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        InsertionSortProgram insert = new InsertionSortProgram();
        insert.insertionSort(arr, n);
        insert.Display(arr);
    }
}