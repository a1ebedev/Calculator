package ru.leqsle;


public class Main {
    public static void main(String[] args) throws InputErrorException {
        Calculate calc = new Calculate();
        Input input = new Input();
        input.init();

        if (input.isInputIsArabian()) {
            System.out.println(calc.calculateArabian(Integer.parseInt(input.getFirstNumber()),
                    Integer.parseInt(input.getSecondNumber()), input.getOperator()));
        } else {
            System.out.println(calc.calculateRoman(input.getFirstNumber(), input.getSecondNumber(), input.getOperator()));
        }

    }
}
