class Solution {

    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            int total = 0;

            for (int j = 0; j < words[i].length(); j++) {

                int index = words[i].charAt(j) - 'a';

                total += weights[index];
            }

            char value = (char) ('z' - (total % 26));

            builder.append(value);
        }

        return builder.toString();
    }
}