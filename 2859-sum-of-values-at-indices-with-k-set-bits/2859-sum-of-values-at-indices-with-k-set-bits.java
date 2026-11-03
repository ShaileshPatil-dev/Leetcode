// class Solution {
//     public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
//         int count = 0;
//         for(int i =0; i < nums.size() ; i++){
//             int num = i;
//             int setbit = 0;
//             while(num > 0){
//                 int lsb = num & 1;
//                 if(lsb == 1){
//                     setbit++;
//                 }
//                 num = num >>1;
//             }
//             if(setbit == k){
//                 count+= nums.get(i);
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int a=nums.size();
        int sum=0;
        for(int i=0;i<a;i++)
        {
            if(k==Integer.bitCount(i))
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}