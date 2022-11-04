package ru.vsu.cs.galimov.tasks;

import java.util.Scanner;

public class Main {

    public static int checkIntInput() {
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                num = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Неверное значение, повторите ввод: ");
                scanner.next();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Arabic num: ");
        int number = checkIntInput();
        System.out.println("Answer: " + ArabicToRoman.convertArabicToRoman(number));
        System.out.print("\n");

        System.out.println("---------------------");
        System.out.print("\n");
        System.out.println("Enter Roman num: ");
        String source = scanner.nextLine();
        System.out.println("Answer: " + RomanToArabic.convertRomanToArabic(source));
    }
}
