class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<command.length() ; i++){
            
            if(command.charAt(i) =='G'){
                ans.append('G');
            }
            else if(command.charAt(i) == '('){
                if(command.charAt(i+1)==')'){
                ans.append('o');
                }
                else{
                    ans.append("al");
                }
            }
        }
        return ans.toString();
    }
}