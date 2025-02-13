class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int value = 0;
        int mod = 0;
        int flag = 1;

        for (int i = 0; i < points.length; i++){
            if (flag < i + 1){
                flag = i + 1;
            }
            for (int j = flag; j < points.length; j++){
                mod = Math.abs(points[i][0] - points[j][0]);
                if (mod > k){
                    break;
                }
                
                value = points[i][1] + points[j][1] + mod;
                if (max < value){
                    max = value;
                    flag = j;
                }
            }
        }
        return max;
    }
}