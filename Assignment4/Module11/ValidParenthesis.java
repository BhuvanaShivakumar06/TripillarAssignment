package Assignment4.Module11;
import java.util.Stack;

public class ValidParenthesis {
    static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        // "{[()]}" => {'{','[','(',')',']','}'};
        for (char c : s.toCharArray()){
            if (c == '{' || c == '[' || c =='('){
                stack.push(c); //Push opening braces to the stack
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                // in all the mismatch cases return false
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
                if (c == ')' && top != '(') return false;
            }
        }
        // if the String is valid Parenthesis if all the brackets are removed
        // It is invalid even if one character is present in it
        // This will happen when there are mismatched brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[[)}]";
        String s3 = "{[[";
        System.out.println(s1 + "->" + (isValidParenthesis(s1) ? "Valid" : "InValid"));
        System.out.println(s2 + "->" + (isValidParenthesis(s2) ? "Valid" : "InValid"));
        System.out.println(s3 + "->" + (isValidParenthesis(s3) ? "Valid" : "InValid"));
    }
}
