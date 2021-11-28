import java.util.Stack;

public class stack {
    public static void main(String[] args) {
//        it uses LIFO concept
        Stack<Integer> s = new Stack<>();
//        adding element in stack where order is preserved
        s.push(1);
        s.push(5);
        s.push(2);
        s.push(6);
        s.push(10);
        System.out.println(s);
//        remove element last in stack and returns it
        System.out.println(s.pop());
//        returns next element in stack to be pop out
        System.out.println(s);
        System.out.println(s.peek());
//        tell capacity of stack
        System.out.println(s.capacity());
    }
}
