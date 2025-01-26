class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;
        while (k > 0 || i >= 0){
            int digit = (i >= 0 ? num[i] : 0);
            int sum = digit + (k % 10) + carry;
            res.add(0, sum % 10);
            carry = sum / 10;
            k /= 10;
            i--;
        }

        if (carry > 0){
            res.add(0,carry);
        }
    return res;
    }
}