class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> res_L = new ArrayList<>();
        int carry = 1; // Start with 1 to represent the "plus one" operation

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = sum / 10;
            res_L.add(sum % 10);
        }

        if (carry != 0) {
            res_L.add(carry);
        }

        // Reverse the result list into the final array
        int[] res = new int[res_L.size()];
        for (int i = 0; i < res_L.size(); i++) {
            res[i] = res_L.get(res_L.size() - 1 - i);
        }

        return res;
    }
}
