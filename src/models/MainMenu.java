package models;

import java.util.Scanner;

public class MainMenu {
    private static final StringUtils stringUtils = new StringUtils();
    private static final Utils utils = new Utils();
    private MainMenu() {
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean status = true;

        while (status) {
            stringUtils.askUserForChoice();
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                PasswordSolver.initializePasswordSolver();
                if(!hasNext()) showMenu();
            }
        }
    }



    public static boolean hasNext() {
        System.out.println(utils.boldText("\nPress 'Enter' to return."));
        Scanner scanner = new Scanner(System.in);
        return scanner.hasNext();
    }

}
