class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length; j++){
                if (image[i][j] == 0){
                    res[i][res.length - j - 1] = 1;
                } else {
                    res[i][res.length - j - 1] = 0;
                }
            }
        }
 
        return res;
        
    }
}