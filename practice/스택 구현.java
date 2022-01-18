import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<Integer>();

        s.push(5);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.push(6);
        while(!s.empty()){
            System.out.println(s.peek() + " ");
            s.pop();
        }

    }
}