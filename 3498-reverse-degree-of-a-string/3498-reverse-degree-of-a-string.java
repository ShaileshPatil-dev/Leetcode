
class Solution {

    public int reverseDegree(String s) {

        int degree = 0;

        for (int i = 0; i < s.length(); i++) {
            int ch = 'z' - s.charAt(i) + 1;
            int product = ch * (i + 1);
            degree += product;
        }

        return degree;
    }
}
