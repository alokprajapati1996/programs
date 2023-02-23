public class BinarySearchProgrames {
    static int binarySearch(int arr[], int beg, int end, int value) {
        if (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == value) {
                return mid + 1;
            } else if (arr[mid] > value) {
                return binarySearch(arr, beg, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, end, value);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 11, 19, 888 };
        int beg = 0;
        int end = arr.length;
        int value = 2;
        int result = binarySearch(arr, beg, end, value);
        if (result == -1) {
            System.out.println("elemeent is no find in list:" + value);
        } else {
            System.out.println("element find in list: " + result);
        }
    }

}
