class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i<n+1;i++){
            int Bits = CountBit(i);
            ans[i]=Bits;
        }
        return ans;
    }
    static int CountBit(int i){
        int counter =0;
        while(i!=0){
            if((i&1) ==1){
                counter++;
            }
            i = i >> 1;
        }
        return counter;
    }
}