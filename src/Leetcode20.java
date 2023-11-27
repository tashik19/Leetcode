import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        Stack<Character> output = new Stack<>();
        int len = 0;
        while(!stack.empty()) {
            char a = stack.peek();
            stack.pop();
            if(len == 0) {
                len++;
                output.push(a);
                continue;
            }
            if (output.peek() == ')' && a == '(') {
                len--;
                output.pop();
                continue;
            }
            if (output.peek() == '}' && a == '{') {
                len--;
                output.pop();
                continue;
            }
            if (output.peek() == ']' && a == '[') {
                len--;
                output.pop();
                continue;
            }
            output.push(a);
            len++;
        }
        if(len == 0)
            return true;
        else
            return false;
    }
}