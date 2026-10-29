import java.util.Stack;

class Pair {
    int value;
    int min;

    Pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

class MinStack {

    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {

        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            int currentMin = Math.min(val, st.peek().min);
            st.push(new Pair(val, currentMin));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().value;
    }

    public int getMin() {
        return st.peek().min;
    }
}