class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res_l = new ArrayList<>();
        boolean[] seen = new boolean[1001];

        for (int num1 : nums1){
            seen[num1] = true;
        } 

        for (int num2 : nums2){
            if (seen[num2] == true){
                res_l.add(num2);
                seen[num2] = false;
            }
        }
        int[] res = new int[res_l.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = res_l.get(i);
        }

        return res;
    }
}