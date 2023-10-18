package packages;

import java.util.Scanner;

public class ButtonManager {
    BombInformation bombInformation = new BombInformation();
    StringUtils stringUtils = new StringUtils();

    public String solve(int buttonChoice, int buttonColorChoice) {
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
