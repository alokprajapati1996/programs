class QuickShort {
    int partition(int a[], int start, int end) {

        int pivot = a[end];
        int i = (start - 1);// i=-1
        int j;
        // arr[]={10,4,2,7,8,9} n=6 n=n-1=5
        for (j = start; j <= end - 1; j++) {// j=0
            if (a[j] <= pivot) {// pivot=9 10<9 ,4<
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return (i + 1);
    }

    void quickSort(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);

        }
    }

    void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 4, 2, 7, 8, 9 };
        int end = a.length;
        QuickShort qs = new QuickShort();
        qs.quickSort(a, 0, end - 1);
        qs.print(a);

    }

}