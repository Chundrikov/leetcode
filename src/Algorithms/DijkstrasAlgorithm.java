package Algorithms;

import java.util.Stack;

/*
dijkstra 's algorithm for calculating the expression
 */

public class DijkstrasAlgorithm {

    public String evaluate(String in) {
        //create two stacks - one for arithmetic signs and second for numbers
        Stack<String> operation = new Stack<>();
        Stack<Integer> number = new Stack<>();

        //also we focus on the brackets
        // and as soon as they close, we do an arithmetic operation,
        // taking data from the stacks
        String trimedString = in.replaceAll("\\s","");
        int result = 0;

        for (char ch: trimedString.toCharArray()) {
            if (String.valueOf(ch).equals("(")) {
            } else if (String.valueOf(ch).equals("+")) {
                operation.push(String.valueOf(ch));
            } else if (String.valueOf(ch).equals("-")) {
                operation.push(String.valueOf(ch));
            } else if (String.valueOf(ch).equals("/")) {
                operation.push(String.valueOf(ch));
            } else if (String.valueOf(ch).equals("*")) {
                operation.push(String.valueOf(ch));
            } else if (String.valueOf(ch).equals(")")) {
                if (!operation.isEmpty() && !number.isEmpty() && operation.peek().equals("+")) {
                    result = number.pop() + number.pop();
                    operation.pop();
                    number.push(result);
                } else if (!operation.isEmpty() && !number.isEmpty() && operation.peek().equals("/")) {
                    int one = number.pop();
                    int two = number.pop();
                    result = two / one;
                    operation.pop();
                    number.push(result);
                } else if (!operation.isEmpty() && !number.isEmpty() && operation.peek().equals("-")) {
                    int one = number.pop();
                    int two = number.pop();
                    result = two - one;
                    operation.pop();
                    number.push(result);
                } else if (!operation.isEmpty() && !number.isEmpty() && operation.peek().equals("*")) {
                    result = number.pop() * number.pop();
                    operation.pop();
                    number.push(result);
                }
            } else {
                String numberChar = String.valueOf(ch);
                number.push(Integer.valueOf(numberChar));
            }
        }
        
        return String.valueOf(result);
    }
}
