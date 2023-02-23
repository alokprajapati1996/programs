class RecursionCheck {
    static void printTable(int n) {
        if (n == 0) {
            return;
        }
        printTable(n - 1);
        System.out.println("print " + n);
        printTable(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printTable(n);
    }

}