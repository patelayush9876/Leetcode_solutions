public class LC20_Valid_Parenthesis {



    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    //  Or other solution will be - (Slow)

//    public static boolean isValid(String s) {
//        // Use a stack to keep track of opening brackets
//        Stack<Character> stack = new Stack<>();
//
//        // Iterate through the characters in the string
//        for (char c : s.toCharArray()) {
//            // Push opening brackets onto the stack
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            }
//            // Check for matching closing brackets
//            else {
//                if (stack.isEmpty()) {
//                    return false; // No matching opening bracket
//                }
//                char top = stack.pop();
//                if ((c == ')' && top != '(') ||
//                        (c == '}' && top != '{') ||
//                        (c == ']' && top != '[')) {
//                    return false; // Brackets don't match
//                }
//            }
//        }
//
//        // If the stack is empty, all brackets were matched
//        return stack.isEmpty();
//    }



    public static void main(String[] args) {
            //
    }
}
