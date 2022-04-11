package leetcode.p1920;

class SolutionRunner {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1,5,3,4};

        Solution s1 = new Solution();
        int[] result = s1.buildArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
