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

    private final BombInformation bombInformation = new BombInformation();

    public void showMenu() {

        Scanner scanner = new Scanner(System.in);


        boolean status = true;

        while (status) {
            stringUtils.askUserForChoice();
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                wireSolver.initializeWireSolver();
            }
            else if (userChoice == 2) {
                buttonSolver.initializeButtonSolver();
            }
            else if (userChoice == 3) {
                simonSaysSolver.initializeSimonSaysSolver();
            }
            else if (userChoice == 4) {
                passwordSolver.initializePasswordSolver();
            }
            else if (userChoice == 0) {
                bombInformation.strikeUp();
            }
            else {
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

        }
    }

    public void pressToContinue() {
        System.out.println(utils.boldText("\nPress 'Enter' to return."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void pressToPlayAgain() {
        System.out.println(utils.boldText(ANSI_RED + "\nYou Lost!" + ANSI_WHITE + "\nPress 'Enter' to play again."));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}






