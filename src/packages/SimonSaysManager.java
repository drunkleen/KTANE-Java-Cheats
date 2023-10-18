package packages;

import static packages.StringUtils.*;

public class SimonSaysManager {
    static BombInformations bombInformations = new BombInformations();

    public static String solve(int flashChoice) {
        if (bombInformations.getStrikes() == 0) {
            return zeroStrikeSolver(flashChoice);
        } else if (bombInformations.getStrikes() == 1) {
            return oneStrikeSolver(flashChoice);
        } else if (bombInformations.getStrikes() == 2) {
            return twoStrikeSolver(flashChoice);
        } else {
            return "-1";
        }
    }

    private static String zeroStrikeSolver(int flashChoice) {
        if (bombInformations.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            } else {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            }
        }

    }

    private static String oneStrikeSolver(int flashChoice) {
        if (bombInformations.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            } else {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            } else {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            }
        }
    }

    private static String twoStrikeSolver(int flashChoice) {
        if (bombInformations.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_YELLOW + "Yellow" + ANSI_WHITE);
            } else if (flashChoice == 2) {
                return (ANSI_RED + "Red" + ANSI_WHITE);
            } else if (flashChoice == 3) {
                return (ANSI_GREEN + "Green" + ANSI_WHITE);
            } else {
                return (ANSI_BLUE + "Blue" + ANSI_WHITE);
            }
        }
    }
}
