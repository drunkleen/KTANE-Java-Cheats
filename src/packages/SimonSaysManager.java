package packages;

import static packages.StringUtils.*;

public class SimonSaysManager {
    private final BombInformation bombInformation = new BombInformation();

    public String solve(int flashChoice) {
        if (bombInformation.getStrikes() == 0) {
            return zeroStrikeSolver(flashChoice);
        }
        else if (bombInformation.getStrikes() == 1) {
            return oneStrikeSolver(flashChoice);
        }
        else if (bombInformation.getStrikes() == 2) {
            return twoStrikeSolver(flashChoice);
        }
        else {
            return "-1";
        }
    }

    private String zeroStrikeSolver(int flashChoice) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
        }

    }

    private String oneStrikeSolver(int flashChoice) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        }
    }

    private String twoStrikeSolver(int flashChoice) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashChoice == 1) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        } else {
            if (flashChoice == 1) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else if (flashChoice == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashChoice == 3) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
        }
    }
}
