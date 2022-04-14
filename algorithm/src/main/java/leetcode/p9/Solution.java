package leetcode.p9;

public class Solution {
    public boolean isPalindrome(int x) {
        String inputString = String.valueOf(x);

        int point1 = 0;
        int point2 = inputString.length() - 1; // ex) 0탕 1수 2육 (길이는 3이다.)
        while (point1 < point2) {
            if (inputString.charAt(point1) != inputString.charAt(point2)) {
                return false;
            }
            point1++;
            point2--;
        }

        return true;
    }
}
