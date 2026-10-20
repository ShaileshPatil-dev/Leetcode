class Solution {
    public String decodeMessage(String key, String message) {
        String ogkey = key.replaceAll("\\s", "");

        HashMap<Character, Character> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < ogkey.length(); i++) {
            char ch = ogkey.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, (char) ('a' + count));
                count++;
            }
        }

        String ans = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (ch == ' ') {
                ans += " ";
            } else {
                ans += map.get(ch);
            }
        }

        return ans;
    }
}