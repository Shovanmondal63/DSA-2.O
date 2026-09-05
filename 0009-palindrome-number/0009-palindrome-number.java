class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long copy = x;
        long mod = 0;
        long temp = 0;
        while (copy != 0)
        {
            mod = copy % 10;
            temp = ((temp * 10) + mod);
            copy = copy / 10;
        }
        return temp == x;
    }
}