package models;

import java.awt.*;
import java.util.Scanner;

import static models.StringUtils.ANSI_RED;
import static models.StringUtils.ANSI_WHITE;

public class MainMenu {
    private static final StringUtils stringUtils = new StringUtils();
    private static final Utils utils = new Utils();

    private MainMenu() {
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        BombInformations bombInformations = new BombInformations();

        boolean status = true;

        while (status) {
            stringUtils.askUserForChoice();
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                WireSolver.initializeWireSolver();
            } else if (userChoice == 2) {
                ButtonSolver.initializeButtonSolver();
            } else if (userChoice == 4) {
                PasswordSolver.initializePasswordSolver();
            } else if (userChoice == 0) {
                bombInformations.strikeUp();
            } else {
                status = false;
                break;
            }
            if (bombInformations.getStrikes() > 2) {
                bombInformations.resetBombInformation();
                pressToPlayAgain();
            } else if (userChoice == 0) {
                continue;
            } else {
                pressToContinue();
            }

        }
    }

    public static void pressToContinue() {
        System.out.println(utils.boldText("\nPress 'Enter' to return."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void pressToPlayAgain() {
        System.out.println(utils.boldText(ANSI_RED + "\nYou Lost!" + ANSI_WHITE + "\nPress 'Enter' to play again."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}
