package kz.azaitken.service;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber) {
        String res = "";
        while (arabicNumber>= 5) {
            res+="V";
            arabicNumber-=5;
        }
        while (arabicNumber>= 1) {
            res+="I";
            arabicNumber--;
        }

        return res;
    }
}
