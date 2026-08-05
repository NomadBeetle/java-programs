class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> resList = new ArrayList<>();
        int[] current = intervals[0]; 
        resList.add(current);

        for (int[] interval : intervals){
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd){
                current[1] = Math.max(nextEnd, currentEnd);
            } else {
                current = interval;
                resList.add(current);
            }
        }

        return resList.toArray(new int[resList.size()][]);
    }
}