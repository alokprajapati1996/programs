import java.util.Scanner;

class ThireLargestNumber {
    public static int findThiredLarrgest(int arr[], int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findThiredLarrgest(arr, n));

    }

}
