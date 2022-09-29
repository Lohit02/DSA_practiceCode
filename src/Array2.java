import java.util.Arrays;
import java.util.Stack;

public class Array2 {
    public static void main(String[] args) {
      int arr[]={1,4,5,2,0,6};int target=6;
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));
        Stack<Integer>stack=new Stack();

        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println(stack.peek());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(stack.pop());
            if(stack.contains(target-stack.pop()))
            {
                System.out.println(i);
            }
        }
    }

    }

