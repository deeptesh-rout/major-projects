public class question2 {

    public static void main(String[] args) {
        int decimalNumber = 42;  // Replace with your desired decimal number
        int targetBase = 10;      // Replace with your desired target base

        String result = convertToAnyBase(decimalNumber, targetBase);
        System.out.println(decimalNumber + " in base 10 is equivalent to " + result + " in base " + targetBase);
    }

    public static String convertToAnyBase(int n, int b) {
        if (n == 0) {
            return "0";  // Special case for 0
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % b;
            char digit = getCharDigit(remainder);
            result.insert(0, digit); 
            n /= b;
        }

        return result.toString();
    }
    private static char getCharDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return (char) ('0' + digit);
        } else {
            return (char) ('A' + digit - 10);
        }
    }
}
