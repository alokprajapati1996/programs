public class ArmstronNumber {
    public static void main(String[] args) {
        int n = 407, sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is armstrong");
        } else {
            System.out.println(n + " is not Armstrong");
        }

    }

}
