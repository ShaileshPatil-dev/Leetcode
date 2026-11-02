
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int copy = num;

        while (copy > 0) {
            int rem = copy % 10;

            if (num % rem == 0) {
                count++;
            }

            copy /= 10;
        }

        return count;
    }
}
