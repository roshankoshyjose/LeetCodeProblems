class Solution {
    public boolean isPalindrome(int x) {

        int i = 0;
        String numStr = String.valueOf(x);
        int j = numStr.length() - 1;

        if (x < 0) {
            return false;
        }

        while (i < j) {
            if (numStr.charAt(i) != numStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}