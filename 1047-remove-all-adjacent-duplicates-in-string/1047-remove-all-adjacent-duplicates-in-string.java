// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> stack = new Stack<>();

//         for(int i = 0 ; i < s.length() ; i++){
//             char ch = s.charAt(i);

//             if(stack.isEmpty()){
//                 stack.push(ch);
//             }
//             else if(stack.peek()==ch){
//                 stack.pop();
//             }
//             else{
//                 stack.push(ch);
//             }
//         }
      // Convert the stack into a String: unnecessarily complicated for this problem.
//    return stack.stream()
//             .map(String::valueOf)
//             .collect(Collectors.joining());
//     }
// }


class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
      
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();

    }
}