class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;
//creating maske like 111111... 
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        // XOR flips all bits covered by the mask
        return num ^ mask;
    }
}