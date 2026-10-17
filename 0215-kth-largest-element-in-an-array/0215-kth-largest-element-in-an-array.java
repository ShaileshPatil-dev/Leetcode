class Solution {
    public int findKthLargest(int[] nums, int k) {
        Qs(nums,0,nums.length-1);
        return nums[nums.length-k];
    }
    static void Qs(int[] nums , int start , int end){
          if (start>= end) {
               return ;
          }
          int low = start;
          int high = end;
          int mid = start+(end-start)/2;
          int pivot = nums[mid];

          while (low<=high) {
               while (nums[low] < pivot) {
                    low++;
               }
               while (nums[high] > pivot) {
                    high--;
               }
               if (low<=high) {
                    int temp = nums[low];
                    nums[low] = nums[high];
                    nums[high] = temp;
                    high--;
                    low++;
               }
          }
          Qs(nums, start,high);
          Qs(nums, low,end);
     }
}