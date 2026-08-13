
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if (op.equals("+")) {

                int val1 = st.pop();
                int val2 = st.pop();

                int newK = val1 + val2;

                st.push(val2);
                st.push(val1);
                st.push(newK);

            } 
            else if (op.equals("C")) {

                st.pop();

            } 
            else if (op.equals("D")) {

                st.push(2 * st.peek());

            } 
            else {

                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;

        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}