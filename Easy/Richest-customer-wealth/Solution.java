class Solution {
    public int maximumWealth(int[][] accounts) {
        int richw = 0;
        for (int i = 0; i < accounts.length; i++){
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++){
                //wealth += (accounts[0][i] * accounts[1][j]);
                wealth += accounts[i][j];
                if (wealth > richw){
                    richw = wealth;
                }
            }
        }
        return richw;
    }
}