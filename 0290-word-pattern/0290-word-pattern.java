class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] arr1 = pattern.toCharArray();
        String[] arr2 = s.split(" ");

        if (arr1.length != arr2.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {

            char ch = arr1[i];
            String word = arr2[i];

            // Character already has a word
            if (map1.containsKey(ch)) {

                if (!map1.get(ch).equals(word)) {
                    return false;
                }

            } else {

                // Word is already mapped to another character
                if (map2.containsKey(word)) {
                    return false;
                }

                map1.put(ch, word);
                map2.put(word, ch);
            }
        }

        return true;
    }
}