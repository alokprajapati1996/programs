public class DublicateString {
    public static void main(String[] args) {
        String str = "my name is Alok kumar";
        char arr[] = str.toCharArray();
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j] && arr[i] != ' ') {
                    System.out.println(count++);
                }
            }
        }
        System.out.println(count);
    }
}