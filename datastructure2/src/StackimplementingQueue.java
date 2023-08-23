import java.util.*;

public class StackimplementingQueue {
    public static void main(String[] args) {Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();


        int [] arr= new int[n];
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(8);
        s.push(80);

        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
    }

    public static class Stack{
        Queue<Integer> q1= new LinkedList<Integer>();
        Queue<Integer> q2= new LinkedList<Integer>();


        static int curr_sizze=0;
         void push(int x)
        {
            q2.add(x);
            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue <Integer> q= q1;
            q1=q2;
            q2=q;

        }

        void pop()
        {
            if(q1.isEmpty())
            {
                return;
            }q1.remove();
        }
         int top()
        {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.peek();
        }
    }

}
