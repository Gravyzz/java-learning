package Workout;

import java.util.Arrays;

public class Main {
     public static void main(String[] args) {

         String[] tests = {"()", "()[]{}", "([{}])", "(]", "([)]", "(", ")", "a(b)c[d]", ""};
         for (String t : tests) {
             System.out.println("\"" + t + "\" -> " + isBalanced(t));
         }
     }

public static boolean isBalanced(String input){
         Stack<Character> chars = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c == '(' || c == '[' || c == '{' ){
            chars.push(c);
        }

        if (c == ')' || c == ']' || c == '}' ){
            if (chars.isEmpty()) return false;

            char h = chars.pop();
            if ((c == ')' && h == '(') || (c == '}' && h == '{') || (c == ']' && h == '[')) {
                continue;
            } else return false;
        }

    }
    if (chars.isEmpty()) return true;
    return false;
}



}
