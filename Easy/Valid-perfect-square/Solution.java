class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num / 2;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid < num / mid){
                start = mid + 1;
            } else {
                end = mid;
            }
        } 

        return start * start == num;
        
    }
}