class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int[] que = new int[boxes.length()];
        
    for (int i = 0; i < boxes.length(); i++) {
    que[i] = Character.getNumericValue(boxes.charAt(i));
}   


        int index = 0;
        for(int j = 0 ; j< que.length;j++){
        int value = 0;
        for(int i = 0 ; i< que.length ;i++){
            if(que[i]==1 && index != i){
                value += Math.abs(index - i);
            }
        }
        ans[index] = value; 
        index++;
        }
        return ans;
    }
}