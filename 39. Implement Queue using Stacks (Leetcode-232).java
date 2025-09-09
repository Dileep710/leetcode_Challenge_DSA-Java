import java.util.*;
class MyQueue
{
    private Stack<Integer> main;
    private Stack<Integer> helper;
    public MyQueue()
    {
        main = new Stack<>();
        helper = new Stack<>();
    }
    public void push(int x)
    {
        while(main.size() > 0)
        {
            helper.push(main.pop());
        }
        main.push(x);
        while(helper.size() > 0)
        {
            main.push(helper.pop());
        }
    }  
    public int pop()
    {
        return main.pop();
    }
    public int peek()
    {
        return main.peek();
    }
    public boolean empty()
    {
        return main.size() == 0;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MyQueue obj = new MyQueue();
        System.out.println("Enter number of operations:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter operation (push x / pop / peek / empty):");
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            switch(parts[0])
            {
                case "push":
                    int x = Integer.parseInt(parts[1]);
                    obj.push(x);
                    System.out.println("Pushed: " + x);
                    break;             
                case "pop":
                    System.out.println("Popped: " + obj.pop());
                    break;
                case "peek":
                    System.out.println("Peek: " + obj.peek());
                    break;
                case "empty":
                    System.out.println("Is empty? " + obj.empty());
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }sc.close();
    }
}
