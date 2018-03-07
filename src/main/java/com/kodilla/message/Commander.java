package com.kodilla.message;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Commander {
    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Witamy w darmowej bramce SMS");
        getPhoneNumber();
        getMessage();
        System.out.println("Dziękujemy! Twoja wiadomość została wysłana");
    }

    public static String getMessage() {
        System.out.println("Prosimy podać treść wiadomości, którą chcesz wysłac:");
        String message = scanner.next();
        return message;
    }

    public static int getPhoneNumber() {
        boolean correctChoice = false;
        System.out.println("Prosimy podać numer telefonu, do którego chcesz wysłać wiadomość:");

        while (!correctChoice) {
            String phoneNumber = scanner.nextLine();

                try {
                        correctChoice = true;
                        return Integer.parseInt(phoneNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Prosimy podać prawidłowy numer telefonu!");
                    correctChoice = false;
                }
            }
        return 0;
    }
}
