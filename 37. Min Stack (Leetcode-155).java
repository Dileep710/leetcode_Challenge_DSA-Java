import java.util.Stack;
class MinStack
{
    private Stack<Integer> min;
    private Stack<Integer> st;
    public MinStack()
    {
        st = new Stack<>();
        min = new Stack<>();
    }
    public void push(int val)
    {
        if(st.size() == 0 || min.peek()>=val)
        {
            min.push(val);
        }st.push(val);
    }
    public void pop()
    {
        int ele1 = st.pop();
        int ele2 = min.peek();
        if(ele1 == ele2)
        {
            min.pop();
        }
    }
    public int top()
    {
        return st.peek();
    }
    public int getMin()
    {
        return min.peek();
    }
    public static void main(String[] args)
    {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println("Minimum: " + obj.getMin());
        obj.pop();
        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}
