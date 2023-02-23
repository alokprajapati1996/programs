public class Rectangle {
    public static void main(String[] args) {
        int i, j, k, row = 5, col = 3;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= col; j++) {
                if ((i == 1 || i == row) || (j == 1 || j == col)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
