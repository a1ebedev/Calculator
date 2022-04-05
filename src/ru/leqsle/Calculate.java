package ru.leqsle;

public class Calculate {

    public int calculateArabian(int firstNumber, int secondNumber, char operator) {
        if (firstNumber <= 0 || secondNumber <= 0 || firstNumber > 10 || secondNumber > 10) {
            throw new ArithmeticException("The entered numbers do not fall within the range from 1 to 10");
        } else {
            return switch (operator) {
                case '+' -> firstNumber + secondNumber;
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                case '/' -> firstNumber / secondNumber;
                default -> 0;
            };
        }
    }

    public String calculateRoman(String firstNumber, String secondNumber, char operator) {
        NumberConverter converter = new NumberConverter();

        int result = calculateArabian(converter.toArabian(firstNumber), converter.toArabian(secondNumber), operator);
        if (result < 0) {
            throw new ArithmeticException("result < 0");
        } else {
            return converter.toRoman(result);
        }
    }
}
