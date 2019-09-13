//review the concept of Stack

import java.util.*;

public class Help{

    public static Stack reverse(Stack stack){ //reverse the stack iteratively
        Stack reverseStack = new Stack();
        while (!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }

    public static Stack reverseRe(Stack stack, Stack reStack){ //reverse the stack recursively
        if (stack.isEmpty()){
            return reStack;
        }
        reStack.push(stack.pop());
        return reverseRe(stack, reStack);
    }

    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println("Stack s is: ");
        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Reverse of stack s is: ");
        Stack<String> reverse = reverseRe(s, new Stack<String>());
        Iterator<String> itr2 = reverse.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
