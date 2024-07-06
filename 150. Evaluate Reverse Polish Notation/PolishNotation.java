import java.util.Stack;

class PolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> tokensStack = new Stack<>();
        for(String token : tokens) {
            if(!isOperator(token)) {
                tokensStack.push(token);
            }
            else {
                String val2 = tokensStack.pop();
                String val1 = tokensStack.pop();
                tokensStack.push(doOperation(token, val1, val2)+"");
            }
        }
        return Integer.parseInt(tokensStack.pop());
    }

    private boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }

    private int doOperation(String token, String val1, String val2) {
        int parsedValue1 = Integer.parseInt(val1);
        int parsedValue2 = Integer.parseInt(val2);
        switch(token) {
            case "+":  return parsedValue1+parsedValue2;
            case "-": return parsedValue1-parsedValue2;
            case "*":  return parsedValue1*parsedValue2;
            case "/": return parsedValue1/parsedValue2;
        }
        return 0;
    }
}