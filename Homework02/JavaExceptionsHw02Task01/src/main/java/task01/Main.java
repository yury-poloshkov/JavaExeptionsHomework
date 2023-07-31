package task01;
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.

 ПРИМЕЧАНИЕ:
 В решении принято, что вод: ",123" = 0.123 -> дробное число

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float userNumber;
        do {
            userNumber = inputFloat();
        } while (userNumber == null);
        System.out.println("Введено дробное число: " + userNumber);
    }

    private static Float inputFloat() {
        Float userNumber = null;
        String input = prompt("Введите дробное число: ").replaceFirst("[,]",".");
        if (input.matches("[0-9]*[.]?[0-9]+")){
            userNumber = Float.parseFloat(input);
            if (userNumber % 1 == 0 ){
                System.out.println("Введенное число - целое! Повторите ввод.");
                userNumber = null;
            }
        } else {
            System.out.println("Введено не число! Повторите ввод.");
        }
        return userNumber;
    }

    private static String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}