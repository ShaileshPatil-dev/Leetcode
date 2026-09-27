class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ')'){
                stack.push(ch);
            }
            else{
                String emptyS = "";

                // Pop characters until '('
                while(stack.peek() != '('){
                    emptyS += stack.pop();
                }

                // Remove '('
                stack.pop();

                // Push reversed characters back
                for(int j = 0; j < emptyS.length(); j++){
                    char ar = emptyS.charAt(j);
                    stack.push(ar);
                }
            }
        }

        String ans = "";

        // Stack gives characters in reverse order,
        // so insert each character at the beginning.
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;
    }
}