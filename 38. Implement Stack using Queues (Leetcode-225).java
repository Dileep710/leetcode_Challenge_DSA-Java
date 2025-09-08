import java.util.*;
class MyStack
{
    private Queue<Integer> main;
    private Queue<Integer> helper;
    public MyStack()
    {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    public void push(int x)
    {
        while(main.size() > 0)
        {
            helper.add(main.remove());
        }main.add(x);
        while(helper.size() > 0)
        {
            main.add(helper.remove());
        }
    }
    public int pop()
    {
        return main.remove();
    }
    public int top()
    {
        return main.peek();
    }
    public boolean empty()
    {
        if(main.size()==0)
        {
            return true;
        }else{
            return false;
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MyStack obj = new MyStack();
        System.out.println("Enter number of operations:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter operation (push x / pop / top / empty):");
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            if(parts[0].equals("push"))
            {
                int x = Integer.parseInt(parts[1]);
                obj.push(x);
                System.out.println("Pushed: " + x);
            }else if(parts[0].equals("pop")){
                if(!obj.empty())
                {
                    System.out.println("Popped: " + obj.pop());
                }else
                {
                    System.out.println("Stack is empty!");
                }
            }else if(parts[0].equals("top")){
                if(!obj.empty()) {
                    System.out.println("Top: " + obj.top());
                }else{
                    System.out.println("Stack is empty!");
                }
            }else if(parts[0].equals("empty")){
                System.out.println("Is empty? " + obj.empty());
            }else
            {
                System.out.println("Invalid operation!");
            }
        }sc.close();
    }
}
