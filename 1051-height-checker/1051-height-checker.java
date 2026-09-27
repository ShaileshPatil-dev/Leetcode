class Solution {
    public int heightChecker(int[] heights) {
     int[] copy = heights.clone();  
     Arrays.sort(heights);
     int count = 0;
     for(int i = 0; i<heights.length;i++){
        if(copy[i] != heights[i]){
            count++;
        }
     } 
     return count;
    }
}