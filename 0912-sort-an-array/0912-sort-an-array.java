
class Solution {
    public int[] sortArray(int[] nums) {
        Msort(nums, 0, nums.length - 1);
        return nums;
    }

    static void Msort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        Msort(arr, start, mid);
        Msort(arr, mid + 1, end);

        sort(arr, start, mid, end);
    }

    private static void sort(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mix[k++] = arr[i++];
        }

        while (j <= end) {
            mix[k++] = arr[j++];
        }

        for (int x = 0; x < mix.length; x++) {
            arr[start + x] = mix[x];
        }
    }
}
