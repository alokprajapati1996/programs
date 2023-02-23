import java.util.Arrays;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.plaf.synth.SynthStyle;

public class ArraySort {
    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3, 1, 2, 4, 3, 1, 2, 3, 4 };
        System.out.println("element of array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sortarray1(arr);
        Arrays.sort(arr);
        sortarray(arr);
        // sortarray1(arr);
    }

    public static void sortarray(int arr[]) {
        int temp[] = new int[arr.length];
        int j = 0;
        System.out.println("remove dublicate array");
        for (int i = 0; i < temp.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j++] = arr[arr.length - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void sortarray1(int arr[]) {
        int temp = 1;
        int len = arr.length;
        System.out.println("sorting array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // System.out.println("remove dublicatte element");
        int temp1[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp1[j] = arr[i];
                j++;
            }
            temp1[j] = arr[arr.length - 1];

        }
        System.out.println("remove dublicate array");
        for (int i = 0; i <= j; i++) {
            System.out.print(temp1[i] + " ");

        }
        System.out.println();

    }

}
