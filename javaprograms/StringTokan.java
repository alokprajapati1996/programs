import java.util.StringTokenizer;

public class StringTokan {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("My name is Alok");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken(","));
        }

    }

}
