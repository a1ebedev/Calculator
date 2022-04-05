package ru.leqsle;

public class NumberConverter {

    public String toRoman(int number) {
        if (number >= 100) return "C" + toRoman(number - 100);
        if (number >= 50) return number >= 90 ? ("XC" + toRoman(number - 90)) : ("L" + toRoman(number - 50));
        if (number >= 10) return number >= 40 ? ("XL" + toRoman(number - 40)) : ("X" + toRoman(number - 10));
        if (number >= 5) return number == 9 ? "IX" : "V" + toRoman(number - 5);
        if (number > 0) return number == 4 ? "IV" : "I" + toRoman(number - 1);

        return "";
    }

    public int toArabian(String roman) {
        int[] arabNums = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        String[] romanNums = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        String str = roman.toUpperCase();

        int result = 0;
        for (int i = arabNums.length - 1; i >= 0; i--) {
            while (roman.indexOf(romanNums[i]) == 0) {
                result += arabNums[i];
                roman = roman.substring(romanNums[i].length());
            }
        }
        return result;
    }
}
