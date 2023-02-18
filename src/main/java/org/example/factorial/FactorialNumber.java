package org.example.factorial;

public class FactorialNumber {

    private static final String MULTIPLICATION_SIGN = "*";
    private static final String EQUALS_SIGN = "=";
    private static final String EXCLAMATION_MARK = "!";
    public String factorialNumber(int number) {
        if (isPositive(number)) {
            StringBuilder factorial = new StringBuilder();
            long resultFactorial = 1L;
            for (int i = number; i >= 1; i--) {
                factorial.append(i).append(MULTIPLICATION_SIGN);
                resultFactorial *= i;
            }
            return number + EXCLAMATION_MARK.concat(EQUALS_SIGN).concat(factorial.substring(0, factorial.length() - 1))
                    .concat(EQUALS_SIGN) + resultFactorial;
        }
        return negativeOrNeutral(number);

    }
    private String negativeOrNeutral(int number) {
        return number == 0 ?
                "0" + EXCLAMATION_MARK.concat(EQUALS_SIGN) + "1" :
                "The factorial of negative numbers can't be calculated.";
    }
    private boolean isPositive(int number) {
        return number > 0;
    }
}
