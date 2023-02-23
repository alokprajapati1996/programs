public class DublicateNumes {
    static boolean dublicteNums(int[] nums) {
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(dublicteNums(nums));
    }

}
