class Solution {
    public int maximumProduct(int[] nums) {
        int firstLar = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;
        int thirdLar = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums){
            if (num >= firstLar){
                thirdLar = secondLar;
                secondLar = firstLar;
                firstLar = num;
            } else if (num >= secondLar){
                thirdLar = secondLar;
                secondLar = num;
            } else if (num >= thirdLar){
                thirdLar = num;
            } 
        }

        for (int num : nums){
            if (num <= firstMin){
                secondMin = firstMin;
                firstMin = num;
            } else if (num <= secondMin){
                secondMin = num;
            }
        }

        return Math.max((firstLar * secondLar * thirdLar), (firstMin * secondMin * firstLar));

    }
}