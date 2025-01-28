class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];

        //initialize pointers
        int start = 0;
        int end = n - 1;
        int i = n; //initializing what to add
        while (start < end){
            res[start] = -i;
            res[end] = i;
            
            //move the pointers inwards
            start++;
            end--;
            i--;
        }

        //check whether the size of the array is odd
        if (n % 2 != 0){
            if(start == end){
                res[start] = 0;
            }
        }
        return res;
    }
}