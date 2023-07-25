package task04;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */ 
public class Task04 {
    public static void main(String[] args) {
        String input = null;
        do{
            try {
                input = prompt("Введите строку: ");
            } catch (RuntimeException e) {
                System.out.println(e);
                System.out.println("Do it again!");
                timeOut();
            }
        } while (input == null);
        System.out.println("Application stopped");
    }

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String input = in.nextLine();
        if (input.isEmpty()){
            throw new RuntimeException("Illegal data! Null strings forbidden!");
        }
        return input;
    }

    private static void timeOut() {
        System.out.println("Press ENTER to continue");
        Scanner stopScn = new Scanner(System.in);
        stopScn.nextLine();
    }
}
