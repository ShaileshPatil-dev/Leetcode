/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);

        int ascending = binarySearchAsc(mountainArr, target, 0, peak);

        if (ascending != -1) {
            return ascending;
        }

        return binarySearchDesc(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    static int findPeak(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int binarySearchAsc(MountainArray arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearchDesc(MountainArray arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}