package core.service;

import core.util.BombInformation;
import core.facade.ProblemSolver;
import core.util.StringUtils;
import core.util.Utils;

import java.util.ArrayList;
import java.util.Scanner;

import static core.util.StringUtils.*;
import static core.util.StringUtils.ANSI_WHITE;

public class SimonSaysService implements ProblemSolver {
    private final BombInformation bombInformation = new BombInformation();
    private final StringUtils stringUtils = new StringUtils();

    public void initializeSimonSaysSolver() {
        Utils utils = new Utils();
        utils.clearScreen();
        System.out.println(this.solve());
    }

    @Override
    public String solve() {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> simonSaysColorList = new ArrayList<>();
        int flashingColor;

        bombInformation.getvowelInSerialNumber();

        for (int i = 0; i < 4; i++) {
            stringUtils.askUserForFlashLightColor();
            flashingColor = scanner.nextInt();

            simonSaysColorList.add(this.solveBasedOnStrikeCount(flashingColor));
        }
        return utils.solvationText(String.valueOf(simonSaysColorList));
    }

    private String solveBasedOnStrikeCount(int flashingColor) {
        if (bombInformation.getStrikes() == 0) {
            return zeroStrikeSolver(flashingColor);
        }
        else if (bombInformation.getStrikes() == 1) {
            return oneStrikeSolver(flashingColor);
        }
        else if (bombInformation.getStrikes() == 2) {
            return twoStrikeSolver(flashingColor);
        }
        else {
            return "-1";
        }
    }

    private String zeroStrikeSolver(int flashingColor) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashingColor == 1) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        } else {
            if (flashingColor == 1) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
        }

    }

    private String oneStrikeSolver(int flashingColor) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashingColor == 1) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
        } else {
            if (flashingColor == 1) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        }
    }

    private String twoStrikeSolver(int flashingColor) {
        if (bombInformation.getvowelInSerialNumber()) {
            if (flashingColor == 1) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
        } else {
            if (flashingColor == 1) {
                return (ANSI_YELLOW + YELLOW + ANSI_WHITE);
            }
            else if (flashingColor == 2) {
                return (ANSI_RED + RED + ANSI_WHITE);
            }
            else if (flashingColor == 3) {
                return (ANSI_GREEN + GREEN + ANSI_WHITE);
            }
            else {
                return (ANSI_BLUE + BLUE + ANSI_WHITE);
            }
        }
    }

}

