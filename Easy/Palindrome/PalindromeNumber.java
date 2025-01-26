class Solution {
    public boolean isPalindrome(int x) {
        String numinstr = Integer.toString(x);
        String numcheck = "";
        for (int i = numinstr.length() - 1; i >= 0; i--){
            numcheck = numcheck + numinstr.charAt(i);
        }
        if (numcheck.equals(numinstr)){
            return true;
        } else{
            return false;
        }
    }
}