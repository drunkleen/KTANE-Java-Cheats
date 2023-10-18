package core.service;

import core.util.BombInformation;
import core.facade.ProblemSolver;
import core.util.Utils;
import lombok.Data;

import java.util.Scanner;

import static core.util.StringUtils.*;
import static core.util.StringUtils.WHITE;

@Data
public class WireService implements ProblemSolver {
    private int wireCount = 0;
    private int redWireCount = 0;
    private int blueWireCount = 0;
    private int blackWireCount = 0;
    private int yellowWireCount = 0;
    private int whiteWireCount = 0;

    public void initializeWireSolver() {
        Utils utils = new Utils();
        String solvedText = solve();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    @Override
    public String solve() {
        String[] wireColorList = wireColors();
        wireCount = wireColorList.length;

        setColorCount();

        if (wireCount == 3) {
            return solveIfThreeWires();

        } else if (wireCount == 4) {
            return solveIfFourWires();

        } else if (wireCount == 5) {
            return solveIfFiveWires();

        } else if (wireCount == 6) {
            return solveIfSixWires();
        } else {
            System.out.println("Invalid wire count");
        }

        return "Wire count invalid.";
    }

    BombInformation bombInformation = new BombInformation();
    private String[] wireColors;

    public String solveIfThreeWires() {
        if (redWireCount == 0) {
            this.resetColorCount();
            return "cut the 2nd wire.";
        } else if (blueWireCount > 1) {
            this.resetColorCount();
            return "cut the last blue wire.";
        } else {
            this.resetColorCount();
            return "cut the last wire.";
        }
    }

    public String solveIfFourWires() {
        if (redWireCount > 1 && bombInformation.getSerialNumberOdd()) {
            this.resetColorCount();
            return CUT_LAST_RED_WIRE;
        } else if ((wireColors[wireColors.length - 1].equals(YELLOW) && redWireCount == 0) || blueWireCount == 1) {
            this.resetColorCount();
            return CUT_FIRST_WIRE;
        } else if (yellowWireCount > 1) {
            this.resetColorCount();
            return CUT_LAST_WIRE;
        } else {
            this.resetColorCount();
            return CUT_SECOND_WIRE;
        }
    }

    public String solveIfFiveWires() {
        if (wireColors[wireColors.length - 1].equals(BLACK) && bombInformation.getSerialNumberOdd()) {
            this.resetColorCount();
            return CUT_FOURTH_WIRE;
        } else if (redWireCount == 1 && yellowWireCount > 1) {
            this.resetColorCount();
            return CUT_FIRST_WIRE;
        } else if (blackWireCount == 0) {
            this.resetColorCount();
            return CUT_SECOND_WIRE;
        } else {
            this.resetColorCount();
            return CUT_FIRST_WIRE;
        }
    }

    public String solveIfSixWires() {
        if (yellowWireCount == 0 && bombInformation.getSerialNumberOdd()) {
            this.resetColorCount();
            return CUT_THIRD_WIRE;
        } else if (yellowWireCount == 1 && whiteWireCount > 1) {
            this.resetColorCount();
            return CUT_FOURTH_WIRE;
        } else if (redWireCount == 0) {
            this.resetColorCount();
            return CUT_LAST_WIRE;
        } else {
            this.resetColorCount();
            return CUT_FOURTH_WIRE;
        }
    }

    public String[] wireColors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                ANSI_WHITE + "what colors do you have " +
                        ANSI_YELLOW + "(e.g red,blue,black,white,yellow)" +
                        ANSI_WHITE + "?");
        String userInputWires = scanner.nextLine().toLowerCase();
        userInputWires = userInputWires.replace(" ", "");
        wireColors = userInputWires.split(",");
        return userInputWires.split(",");
    }

    public void resetColorCount() {
        wireCount = 0;
        redWireCount = 0;
        blueWireCount = 0;
        blackWireCount = 0;
        yellowWireCount = 0;
        whiteWireCount = 0;
    }

    public void countUp(String wireColor) {
        if (wireColor.equals(RED)) redWireCount++;
        if (wireColor.equals(BLUE)) blueWireCount++;
        if (wireColor.equals(YELLOW)) yellowWireCount++;
        if (wireColor.equals(BLACK)) blackWireCount++;
        if (wireColor.equals(WHITE)) whiteWireCount++;

    }

    public void setColorCount() {
        for (String wire : wireColors) {
            if (wire.equals(RED)) {
                countUp(RED);
            }
            else if (wire.equals(BLUE)) {
                countUp(BLUE);
            }
            else if (wire.equals(BLACK)) {
                countUp(BLACK);
            }
            else if (wire.equals(YELLOW)) {
                countUp(YELLOW);
            }
            else if (wire.equals(WHITE)) {
                countUp(WHITE);
            }
            else {
                System.out.println("Color " + wire + " not Found");
            }
        }
    }

}
