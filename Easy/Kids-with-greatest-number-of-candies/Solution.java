class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i : candies){
            if (i > maxcandies){
                maxcandies = i;
            }
        }

        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= maxcandies){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;   
    }
}