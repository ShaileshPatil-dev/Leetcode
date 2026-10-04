class Solution {
    public int maxFreqSum(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        int maxV=0;
        int maxC=0;

        for(int i = 0 ;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch == 'u'){
                maxV= Math.max(map.get(ch),maxV);
            }
            else{
                maxC =Math.max(map.get(ch),maxC);
            }
        }
        return maxV+maxC;
    }
}