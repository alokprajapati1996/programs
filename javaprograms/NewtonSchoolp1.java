
public class NewtonSchoolp1 {
    static int minimum(int x) {
        int y = 0;
        int res = y ^ x;
        return res;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = minimum(x);
        System.out.println(Math.abs(x - y));
    }

}
