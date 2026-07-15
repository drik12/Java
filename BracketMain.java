import java.util.Scanner;
import java.util.Stack;

/**Algorithm
Create an empty stack.
Traverse each character of the input string.
If the character is an opening bracket ((, {, [), push it onto the stack.
If the character is a closing bracket (), }, ]):
If the stack is empty, return Invalid.
Pop the top element from the stack.
Check whether the popped bracket matches the current closing bracket.
If it does not match, return Invalid.
After traversing the entire string:
If the stack is empty, return Valid.
Otherwise, return Invalid. */


// Class to check whether the brackets are balanced
class BracketCheck {

    // Method to validate the bracket sequence
    boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> st = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Process closing brackets
            else {

                // If stack is empty, no matching opening bracket exists
                if (st.isEmpty())
                    return false;

                // Remove the top opening bracket
                char top = st.pop();

                // Check whether the closing bracket matches
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '['))
                    return false;
            }
        }

        // If stack is empty, all brackets are balanced
        return st.isEmpty();
    }
}

// Main class
public class BracketMain {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Create object of BracketCheck class
        BracketCheck obj = new BracketCheck();

        // Read input string
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        // Check whether the string contains balanced brackets
        if (obj.isValid(s))
            System.out.println("Valid");
        else
            System.out.println("Invalid");

        // Close Scanner object
        sc.close();
    }
}