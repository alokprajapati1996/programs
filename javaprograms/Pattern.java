public class Pattern {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int a = count;
            for (int j = 0; j < 6; j++) {
                count++;
                System.out.print(a + " ");
                a = a + 4;
            }
            System.out.println();
        }
    }

}
