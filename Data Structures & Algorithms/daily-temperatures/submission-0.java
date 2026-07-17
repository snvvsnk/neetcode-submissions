class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;
        Stack<Integer> stack = new Stack<>();
        int[] results = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int index = stack.pop();
                results[index] = i - index ;
            }
            stack.push(i);
        }

        return results;
        
    }
}
