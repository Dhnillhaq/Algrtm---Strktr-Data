package InfixPostfix;

public class Postfix17 {
    int n;
    int top;
    char[] stack;

    public Postfix17(int all) {
        n = all;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char dataIn) {
        top++;
        stack[top] = dataIn;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char dataIn) {
        if ((dataIn >= 'A' && dataIn <= 'Z') || (dataIn >= 'a' && dataIn <= 'z') || (dataIn >= '0' && dataIn <= '9') || dataIn == ' ' || dataIn == '.') {
            return true;            
        } else {
            return false;
        }
    }

    public boolean isOperator(char dataIn) {
        if (dataIn == '^'  || dataIn == '%' || dataIn == '/' || dataIn == '*' || dataIn == '-' || dataIn == '+') {
            return true;
        } else {
            return false;
        }
    } 

    public int derajat(char dataIn) {
        switch (dataIn) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String operasi) {
        String p = "";
        char x;
        for (int i = 0; i < n; i++) {
            x = operasi.charAt(i);
            if (isOperand(x)) {
                p = p + x;
            }
            if (x == '(') {
                push(x);
            }
            if (x == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop();
            }
            if (isOperator(x)) {
                while (derajat(stack[top]) >= derajat(x)) {
                    p = p + pop();
                }
                push(x);
            }
        }
        return p;
    }
}
