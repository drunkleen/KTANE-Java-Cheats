package packages;

import java.util.Scanner;

import static packages.StringUtils.ANSI_RED;
import static packages.StringUtils.ANSI_WHITE;

public class MainMenu {
    private final StringUtils stringUtils = new StringUtils();
    private final Utils utils = new Utils();
    private final WireSolver wireSolver = new WireSolver();
    private final ButtonSolver buttonSolver = new ButtonSolver();
    private final SimonSaysSolver simonSaysSolver = new SimonSaysSolver();
    private final PasswordSolver passwordSolver = new PasswordSolver();

    public void showMenu() {

        Scanner scanner = new Scanner(System.in);
        BombInformation bombInformation = new BombInformation();

        boolean status = true;

        while (status) {
            stringUtils.askUserForChoice();
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    wireSolver.initializeWireSolver();
                case 2:
                    buttonSolver.initializeButtonSolver();
                case 3:
                    simonSaysSolver.initializeSimonSaysSolver();
                case 4:
                    passwordSolver.initializePasswordSolver();
                case 0:
                    bombInformation.strikeUp();
                default:
                    status = false;
                    break;
            }

            if (bombInformation.getStrikes() > 2) {
                bombInformation.resetBombInformation();
                pressToPlayAgain();
            } else if (userChoice == 0) {
                continue;
            } else {
                pressToContinue();
            }
            scanner.close();

        }
    }

    public void pressToContinue() {
        System.out.println(utils.boldText("\nPress 'Enter' to return."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }

    public void pressToPlayAgain() {
        System.out.println(utils.boldText(ANSI_RED + "\nYou Lost!" + ANSI_WHITE + "\nPress 'Enter' to play again."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }

}






//            if (userChoice == 1) {
//                    wireSolver.initializeWireSolver();
//                    }
//                    else if (userChoice == 2) {
//                    buttonSolver.initializeButtonSolver();
//                    }
//                    else if (userChoice == 3) {
//                    simonSaysSolver.initializeSimonSaysSolver();
//                    }
//                    else if (userChoice == 4) {
//                    passwordSolver.initializePasswordSolver();
//                    }
//                    else if (userChoice == 0) {
//                    bombInformation.strikeUp();
//                    }
//                    else {
//                    status = false;
//                    break;
//                    }