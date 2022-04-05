package ru.leqsle;

import java.util.Scanner;

public class Input {
    private String[] inputValues;
    private boolean inputIsArabian;

    public void init() throws InputErrorException {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        validateString(inputString);
        inputValues = inputString.split(" ");

    }

    public void validateString(String string) throws InputErrorException {
        if (string.matches("(\\d{1,2})(\\s{1})([\\-\\+\\/\\*]{1})(\\s{1})(\\d{1,2})")) {
            inputIsArabian = true;
        } else if (string.matches("([ICLVX]{1,4})(\\s{1})([\\-\\+\\/\\*]{1})(\\s{1})([ICLVX]{1,4})")) {
            inputIsArabian = false;
        } else {
            throw new InputErrorException("Input format error!");
        }
    }

    public String getFirstNumber() {
        return inputValues[0];
    }

    public String getSecondNumber() {
        return inputValues[2];
    }

    public char getOperator() {
        return inputValues[1].charAt(0);
    }

    public boolean isInputIsArabian() {
        return inputIsArabian;
    }

}

class InputErrorException extends Exception {
    public InputErrorException(String msg) {
        super(msg);
    }
}
