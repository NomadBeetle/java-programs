class Solution {

    private static class Pair{
        char ch;
        int count;
        Pair(char ch, int c){
            this.ch = ch;
            this.count = c;
        }
    }

    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()){
            if (!stack.isEmpty() && stack.peek().ch == ch){
                stack.peek().count++;
            } else {
                stack.push(new Pair(ch, 1));
            }

            if (stack.peek().count == k){
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            Pair pop = stack.removeLast();
            for (int i = 0; i < pop.count; i++){
                sb.append(pop.ch);
            }
        }

        return sb.toString();
    }
}