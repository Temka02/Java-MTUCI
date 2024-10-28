package LR4;

import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите делимое: ");
            int numerator = scanner.nextInt();

            System.out.print("Введите делитель: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new CustomDivisionException("Деление на ноль невозможно!");
            }

            int result = numerator / denominator;
            System.out.println("Результат деления: " + result);

        } catch (CustomDivisionException e) {
            System.out.println(e.getMessage());
            ExceptionLogger.logException(e);

        }
    }
}
