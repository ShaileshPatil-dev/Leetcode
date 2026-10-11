class Solution {
    public String truncateSentence(String s, int k) {

        StringBuilder builder = new StringBuilder();

        String[] arr = s.split(" ");

        for (int i = 0; i < k; i++) {

            builder.append(arr[i]);

            if (i < k - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
