class Solution {
    public boolean validPalindrome(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;

        while (l < r) {
            if (ch[l] != ch[r]) {
                // try deleting either the left or right character
                return isPalindrome(ch, l + 1, r) || isPalindrome(ch, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isPalindrome(char[] ch, int l, int r) {
        while (l < r) {
            if (ch[l] != ch[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}