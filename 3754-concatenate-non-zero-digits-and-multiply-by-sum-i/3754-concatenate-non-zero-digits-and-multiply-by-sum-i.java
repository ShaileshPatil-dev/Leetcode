class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            int rem = n % 10;
            if (rem > 0) {
                list.add(rem);
            }
            n /= 10;
        }

        long value = 0;
        int sum = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            int digit = list.get(i);
            value = value * 10 + digit;
            sum += digit;
        }

        return value * sum;
    }
}