class Solution {
    public boolean judgeCircle(String moves) {
        int X = 0 ;
        int Y = 0;
        for(int i = 0 ;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch =='U'){
                Y++;
            }
            if(ch=='D'){
                Y--;
            }
            if(ch=='R'){
                X++;
            }
            if(ch=='L'){
                X--;
            }
        }
        return X == 0 && Y == 0;
    }
}