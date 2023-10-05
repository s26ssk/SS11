package BT2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                System.out.println(stack);

            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    System.out.println(stack);
                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự:");
        String input = scanner.nextLine();

        System.out.println("Chuỗi vừa nhập " + (isValid(input) ? "có cặp dấu ngoặc đúng" : "có cặp dấu ngoặc sai"));
    }
}
