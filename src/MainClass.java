import java.util.Scanner;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input= sc.next();
            valid_paren(input);
        }
    }

    public static void valid_paren(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (char i : input.toCharArray()) {
            if (i == '{' || i == '(' || i == '[') {
                stack.push(i);
            } else {
                if (stack.empty()) {
                    System.out.println(false);
                    return;
                } else {
                    char top = stack.peek();
                    if (i == '}' && top == '{' || i == ')' && top == '(' || i == ']' && top == '[') {
                        stack.pop();
                    } else {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        if (stack.empty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

