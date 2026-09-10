class Solution {
    public void rotate(int[] nums, int k) {
        if(k%nums.length==0){
            return;
        }
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    static void rev(int[] arr, int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}