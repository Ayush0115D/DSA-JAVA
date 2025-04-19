class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int rev = 0;
        int num = n;
        while (n  != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if (num == rev) {
            return true;
        }
        return false;
    }
}