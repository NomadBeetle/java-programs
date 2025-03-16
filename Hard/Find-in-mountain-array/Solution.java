/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    int MaxIndex(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    int BinarySearch(MountainArray mountainArr, int target, int start, int end, boolean asc){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target){
                return mid;
            } else {
                if (asc){
                    if (mountainArr.get(mid) > target){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (mountainArr.get(mid) < target){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }                    
                }
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int max_i = MaxIndex(mountainArr);

        int res = BinarySearch(mountainArr, target, 0, max_i, true);

        if (res != -1){
            return res;
        }

        return BinarySearch(mountainArr, target, max_i + 1, n - 1, false);
    }
}