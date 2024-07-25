class Solution {
    public int calculate(String s) {
    
        char[] t = s.toCharArray();
        int sum = 0;
        int a = 0;
        char operation = '+';
        int currentNumber = 0; // To handle multi-digit numbers

        for (int i = 0; i < t.length; i++) {
            char c = t[i];

            // Build the current number
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            // If we reach an operator or end of the string, process the current number
            if (!Character.isDigit(c) && c != ' ' || i == t.length - 1) {
                switch (operation) {
                    case '+':
                        sum += a;
                        a = currentNumber;
                        break;
                    case '-':
                        sum += a;
                        a = -currentNumber;
                        break;
                    case '*':
                        a *= currentNumber;
                        break;
                    case '/':
                        a /= currentNumber;
                        break;
                }

                // Update the operation
                operation = c;
                // Reset current number
                currentNumber = 0;
            }
        }

        // Add the last processed number
        sum += a;

        return sum;
    }
}

        
    
