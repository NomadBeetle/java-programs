class Solution {
    public int maximumPopulation(int[][] logs) {
        int leastyear = 2051; // Smallest year with max population
        int maxpopulation = 0; // Maximum population recorded

        for (int i = 0; i < logs.length; i++) {
            int pop_count = 0; // Current population count
            int cur_year = logs[i][0]; // Current year being checked

            for (int j = 0; j < logs.length; j++) {
                // Check if cur_year is within the lifespan of a person
                if (cur_year >= logs[j][0] && cur_year < logs[j][1]) {
                    pop_count++;
                }
            }

            // Update the maxpopulation and leastyear
            if (pop_count > maxpopulation || (pop_count == maxpopulation && cur_year < leastyear)) {
                maxpopulation = pop_count;
                leastyear = cur_year;
            }
        }

        return leastyear; // Return the earliest year with max population

    }
}