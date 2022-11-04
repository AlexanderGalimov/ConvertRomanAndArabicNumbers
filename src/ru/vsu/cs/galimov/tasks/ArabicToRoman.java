package ru.vsu.cs.galimov.tasks;

public class ArabicToRoman {
    public static String convertArabicToRoman(int num) {
        String answer = "";
        if (num < 0) {
            System.out.print("error num must be > 0");
            return null;
        }
        if (num <= 9) {
            answer += singleDigits(num);
        }
        if (num >= 10 && num <= 39) {
            answer += from1To39(num) + singleDigits(num % 10);
        }
        if (num >= 40 && num < 50) {
            answer += from40To49() + singleDigits(num % 10);
        }
        if (num >= 50 && num < 90) {
            answer += from50To89(num) + singleDigits(num % 10);
        }
        if (num >= 90 && num < 100) {
            answer += from90To99() + singleDigits(num % 10);
        }
        if (num >= 100 && num < 400) {
            answer += from100To399(num);
            answer += convertArabicToRoman(num % 100);
        }
        if (num >= 400 && num < 500) {
            answer += from399To499();
            answer += convertArabicToRoman(num % 100);
        }
        if (num >= 500 && num < 900) {
            answer += from500To899();
            answer += convertArabicToRoman(num - 500);
        }
        if (num >= 900 && num < 1000) {
            answer += from900To1000();
            answer += convertArabicToRoman(num % 100);
        }
        if (num >= 1000) {
            answer += exceed1000(num);
            answer += convertArabicToRoman(num % 1000);
        }
        return answer;
    }

    public static String exceed1000(int currentNum) {
        String result;
        int countOfThousands = currentNum / 1000;
        String strH = "M";
        result = strH.repeat(countOfThousands);
        return result;
    }

    public static String from900To1000() {
        return "CM";
    }

    public static String from500To899() {
        return "D";
    }

    public static String from399To499() {
        return "CD";
    }

    public static String from100To399(int currentNum) {
        String result;
        int countOfHundreds = currentNum / 100;
        String strH = "C";
        result = strH.repeat(countOfHundreds);
        return result;
    }

    public static String from90To99() {
        return "XC";
    }

    public static String from50To89(int currentNum) {
        String result;
        int countOfDecades = (currentNum - 50) / 10;
        String str = "X";
        result = "L" + str.repeat(countOfDecades);
        return result;
    }

    public static String from40To49() {
        return "XL";
    }

    public static String from1To39(int currentNum) {
        String result;
        int countOfDecades = currentNum / 10;
        String str = "X";
        result = str.repeat(countOfDecades);
        return result;
    }

    public static String singleDigits(int currentNum) {
        String result = "";
        switch (currentNum) {
            case 0:
                break;
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
        }
        return result;
    }
}
