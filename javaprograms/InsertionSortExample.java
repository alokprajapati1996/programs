import java.util.Scanner;

class InsertionSortExample {
    public static void InsertionSortMethod(int arr[]) {
        int i, temp;

        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (temp < arr[j] && j >= 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;

        }
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Array.sort(arr)
        InsertionSortMethod(arr);
    }

}
