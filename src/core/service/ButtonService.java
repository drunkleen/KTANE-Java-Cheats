package core.service;

import core.util.BombInformation;
import core.facade.ProblemSolver;
import core.util.StringUtils;
import core.util.Utils;

import java.util.Scanner;

public class ButtonService implements ProblemSolver {
    private final StringUtils stringUtils = new StringUtils();
    private final BombInformation bombInformation = new BombInformation();

    public void initializeButtonSolver() {
        Utils utils = new Utils();
        String solvedText = this.solve();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    @Override
    public String solve() {
        stringUtils.askUserForChoiceButtonLabel();
        Scanner scanner = new Scanner(System.in);

        int buttonChoice = scanner.nextInt();
        stringUtils.askUserForChoiceButtonColor();
        int buttonColorChoice = scanner.nextInt();
        return getCorrectReleaseTime(buttonChoice, buttonColorChoice);
    }

    public String getCorrectReleaseTime(int buttonChoice, int buttonColorChoice) {
        if (buttonColorChoice == 3 && buttonChoice == 4) {
            return buttonHeld();

        } else if (bombInformation.getBatteryCount() > 1 && buttonChoice == 1) {
            return "press and immediately release.";

        } else if (buttonColorChoice == 4 && bombInformation.getCarLabel()) {
            return buttonHeld();

        } else if (bombInformation.getBatteryCount() > 2 && bombInformation.getFrkLabel()) {
            return "press and immediately release";

        } else if (buttonColorChoice == 2) {
            return buttonHeld();

        } else if (buttonColorChoice == 1 && buttonChoice == 2) {
            return "press and immediately release.";

        } else {
            return buttonHeld();
        }
    }

    public String buttonHeld() {
        System.out.println("Hold the button!");

        stringUtils.askUserForButtonLightColor();
        Scanner scanner = new Scanner(System.in);
        int userLightColorChoice = scanner.nextInt();

        return lightColorSolver(userLightColorChoice);
    }

    private String lightColorSolver(int userColorChoice) {
        if (userColorChoice == 3) {
            return "Hold, release when the countdown timer has a 4 in any position.";
        } else if (userColorChoice == 2) {
            return "Hold, release when the countdown timer has a 5 in any position.";
        } else {
            return "release when the countdown timer has a 1 in any position.";
        }
    }
}

