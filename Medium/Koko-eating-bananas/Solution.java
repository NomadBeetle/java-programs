import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length - 1];

        while (start < end){
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i = 0; i < piles.length; i++){
                count += (piles[i] + mid - 1)/mid;
            }

            if (count <= h){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
} {
    
}
