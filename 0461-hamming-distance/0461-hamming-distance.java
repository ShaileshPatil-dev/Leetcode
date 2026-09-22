class Solution {
    public int hammingDistance(int x, int y) {
        int XOR_Ans = x ^ y ;
        int count = 0;
        while(XOR_Ans > 0){
            if((XOR_Ans & 1) == 1){
                count++;
            }
            XOR_Ans = XOR_Ans >> 1;
        }
        return count;
    }
}