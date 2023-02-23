public class SwapppingTwoString {
    public static void main(String[] args) {
        String str1 = "Alokbhkhkjhn", str2 = "Kumahbbjnbkhjbujbgr";
        int len1 = str1.length();
        int len2 = str2.length();
        String addstring = str1 + str2;
        int len3 = addstring.length();
        str1 = addstring.substring(len3 - len2);
        str2 = addstring.substring(0, len1);
        System.out.println(str1 + " " + str2);

    }

}
