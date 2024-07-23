       Stack<Integer> stack = new Stack<>();

        for (char curr : S.toCharArray()) {
            if (Character.isDigit(curr)) {
                stack.push(curr - '0');  // Convert char to int
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                
                switch (curr) {
                    case '*':
                        result = a * b;
                        break;
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }
        
        return stack.pop();
    }
