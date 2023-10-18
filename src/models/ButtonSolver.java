package models;

import java.util.Scanner;

public class ButtonSolver {
    private static final StringUtils stringUtils = new StringUtils();
    private ButtonSolver() {};

    public static void initializeButtonSolver() {
        Utils utils = new Utils();
        String solvedText = solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    };

    private static String solver() {
        stringUtils.askUserForChoiceButtonLabel();
        Scanner scanner = new Scanner(System.in);

        int buttonChoice = scanner.nextInt();
        stringUtils.askUserForChoiceButtonColor();
        int buttonColorChoice = scanner.nextInt();
        ButtonManager buttonManager = new ButtonManager();
        return buttonManager.solve(buttonChoice, buttonColorChoice);



    }
}
