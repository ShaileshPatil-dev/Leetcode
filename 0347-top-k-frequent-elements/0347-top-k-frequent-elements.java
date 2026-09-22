class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Get all keys from HashMap
        Integer[] keys = map.keySet().toArray(new Integer[0]);

        // Step 3: Sort keys based on frequency
        for (int i = 0; i < keys.length - 1; i++) {

            for (int j = i + 1; j < keys.length; j++) {

                if (map.get(keys[i]) < map.get(keys[j])) {

                    Integer temp = keys[i];
                    keys[i] = keys[j];
                    keys[j] = temp;
                }
            }
        }

        // Step 4: Take first k elements
        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = keys[i];
        }

        return answer;
    }
}