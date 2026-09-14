class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                int last = stack.peek();
                int secondLast = stack.get(stack.size() - 2);

                stack.push(last + secondLast);
            }

            else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            }

            else if (operations[i].equals("C")) {
                stack.pop();
            }

            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}