public class RotionArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int Arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < n - 1; j++) {
                Arr1[i] = arr[i + 1];
            }

            Arr1[j] = first;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(Arr1[j] + " ");

        }
    }
}
