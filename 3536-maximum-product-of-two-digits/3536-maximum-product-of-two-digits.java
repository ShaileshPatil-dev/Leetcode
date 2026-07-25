class Solution {
    public int maxProduct(int n) {
        int[] digits = new int[10]; 
        int size = 0;

        while (n > 0) {
            digits[size++] = n % 10;
            n /= 10;
        }

      int maxProduct = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
            int product = digits[i] * digits[j];

                if (product > maxProduct) {
                    maxProduct = product;
        }
    }
}
        return maxProduct;
    }
}