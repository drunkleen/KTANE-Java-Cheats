package packages;

import java.util.Scanner;

public class ButtonSolver {
    private final StringUtils stringUtils = new StringUtils();

    public void initializeButtonSolver() {
        Utils utils = new Utils();
        String solvedText = this.solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    private String solver() {
        stringUtils.askUserForChoiceButtonLabel();
        Scanner scanner = new Scanner(System.in);

        int buttonChoice = scanner.nextInt();
        stringUtils.askUserForChoiceButtonColor();
        int buttonColorChoice = scanner.nextInt();
        ButtonManager buttonManager = new ButtonManager();
        scanner.close();
        return buttonManager.solve(buttonChoice, buttonColorChoice);
    }
}
