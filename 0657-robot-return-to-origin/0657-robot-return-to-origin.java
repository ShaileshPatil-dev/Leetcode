class Solution {
    public boolean judgeCircle(String moves) {
     if(moves.length()%2!=0) {return false;}
        int X = 0 ;
        int Y = 0;
        for(int i = 0 ;i<moves.length();i++){
            char ch = moves.charAt(i);
            if (ch == 'U') {
    Y++;
} else if (ch == 'D') {
    Y--;
} else if (ch == 'R') {
    X++;
} else {
    X--;
}
        }
        return X == 0 && Y == 0;
    }
}