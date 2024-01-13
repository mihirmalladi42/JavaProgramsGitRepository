package allprograms;
import java.util.Stack;

public class GoatProblem {
    public static void main(String[] args) {
        // Define the LaTeX equation as a string
        String javaExpression = "Math.pow(r2-1, 2)";

        // Replace LaTeX symbols with Java equivalents
       

        // Define variables
        double r2;

        // Parse and evaluate the equation
        try {
            r2 = evaluateExpression(javaExpression);
            System.out.println("r2: " + r2);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to evaluate a mathematical expression
    public static double evaluateExpression(String expression) {
        Stack<Double> stack = new Stack<>();

        // Tokenize the expression by spaces
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("[-+*/^]")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }

    // Method to perform mathematical operations
    public static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "^":
                return Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
