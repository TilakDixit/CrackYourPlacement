class Solution {
    public long multiplyTwoLists(Node first, Node second) {
         final long MOD = 1000000007;
        long number1 = 0;
        long number2 = 0;

        while (first != null) {
            number1 = (number1 * 10 + first.data) % MOD;
            first = first.next;
        }

        while (second != null) {
            number2 = (number2 * 10 + second.data) % MOD;
            second = second.next;
        }

        return (number1 * number2) % MOD;
    }
}
