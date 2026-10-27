class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 != 0){
            return false;
        }

        int i = 0; 

        while(i < s.length()) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false; 
                }

                Character popped = stack.pop();

                if(
                    (s.charAt(i) == ']' && !(popped == '[')) || 
                    (s.charAt(i) == ')' && !(popped == '(')) ||
                    (s.charAt(i) == '}' && !(popped == '{'))
                ) {
                    return false; 
                }
            }
            i++;
        }

        if(!stack.isEmpty()){
            return false;
        } else {
            return true; 

        }
        
    }
}
