public class MergeSortExample {
    void mergeSort(int arr[], int beg, int end) {

        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    void merge(int arr[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;

        int n2 = end - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++)
            left[i] = arr[beg + i];

        for (j = 0; j < n2; j++)
            right[j] = arr[mid + j + 1];

        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 34, 23, 13, 43, 2, 78, 54, 32, 16 };
        int end = arr.length;
        int beg = 0;
        MergeSortExample ms = new MergeSortExample();
        ms.mergeSort(arr, beg, end - 1);
        ms.display(arr);

    }

}
