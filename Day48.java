class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int result;
        for(int i=0;i<tokens.length;i++)
        {
            String ch=tokens[i];
            int a,b;
          if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"))
            {
                b=st.pop();
                a=st.pop();
                
                    if(ch.equals("+"))
                     result = a + b;

                    else if(ch.equals("-"))
                      result = a - b;

                    else if(ch.equals("*"))
                     result = a * b;

                    else
                     result = a / b;
                
                st.push(result);

            }
            else
            st.push(Integer.parseInt(ch));
        }
        return st.peek();
    }
}
