class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        // Build the Roman numeral string
        String result = "";
        result += thousands[num / 1000];
        result += hundreds[(num % 1000) / 100];
        result += tens[(num % 100) / 10];
        result += ones[num % 10];
        
        return result;
        }
    }
   
