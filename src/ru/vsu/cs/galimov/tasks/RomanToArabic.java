package ru.vsu.cs.galimov.tasks;

public class RomanToArabic {
    public static int convertRomanToArabic(String str) {
        int result = 0;
        int a = 0;
        for (int i = 0; i < str.length(); i += a) {
            if (i < str.length() - 1) {
                if (singleStr(str.charAt(i)) >= singleStr(str.charAt(i + 1))) {
                    result += singleStr(str.charAt(i));
                    a = 1;
                }
                if (singleStr(str.charAt(i)) < singleStr(str.charAt(i + 1))) {
                    result += singleStr(str.charAt(i + 1)) - singleStr(str.charAt(i));
                    a = 2;
                }
            }
            else if (i == str.length() - 1) {
                result += singleStr(str.charAt(i));
                return result;
            }
        }
        return result;
    }


    public static int singleStr(char currStr) {
        int result = 0;
        switch (currStr) {
            case '\0':
                break;
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
        }
        return result;
    }
}
