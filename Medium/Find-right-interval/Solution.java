class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int rows = intervals.length;
        int[] firstelements = new int[rows];
        int[] answer = new int[rows];

        for (int i = 0; i < rows; i++){
            firstelements[i] = intervals[i][0];
        }

        for (int i = 0; i < rows; i++){
            answer[i] = FindGreaterOrEqual(firstelements, intervals[i][1]);
        }

        return answer;
    }

    public  int FindGreaterOrEqual(int[] rows, int target){
        int start = 0;
        int end = rows.length -1;
        int answer = -1;

        while ( start <= end) {
            int mid = start + (end - start) / 2;

            if (target == rows[mid]) {
                return mid;
            }

            // for ascending order
            if (rows[start] < rows[end]) {

                if (target > rows[mid]) {
                    start = mid + 1;
                } else {
                    answer = mid;
                    end = mid - 1;
                }

            }
            // for descending order
            else{

                if (target > rows[mid]) {
                    end = mid - 1;

                } else {
                    answer = mid;
                    start = mid + 1;
                }


            }
        }
        return answer;

    }
}