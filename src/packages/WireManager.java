package packages;

import lombok.Data;

import java.util.Scanner;

import static packages.StringUtils.ANSI_WHITE;
import static packages.StringUtils.ANSI_YELLOW;

@Data
public class WireManager {
    public int wireCount = 0;
    public int redWireCount = 0;
    public int blueWireCount = 0;
    public int blackWireCount = 0;
    public int yellowWireCount = 0;
    public int whiteWireCount = 0;


    BombInformations bombInformations = new BombInformations();
    private static String[] wireColors;

    public String solveIfThreeWires() {
        if (redWireCount == 0) {
            resetColorCount();
            return "cut the 2nd wire.";
        } else if (blueWireCount > 1) {
            resetColorCount();
            return "cut the last blue wire.";
        } else {
            resetColorCount();
            return "cut the last wire.";
        }
    }

    public String solveIfFourWires() {
        if (redWireCount > 1 && bombInformations.getSerialNumberOdd()) {
            resetColorCount();
            return "cut the last red wire.";
        } else if ((wireColors[wireColors.length - 1].equals("yellow") && redWireCount == 0) || blueWireCount == 1) {
            resetColorCount();
            return "cut the 1st wire.";
        } else if (yellowWireCount > 1) {
            resetColorCount();
            return "cut the last wire.";
        } else {
            resetColorCount();
            return "cut the 2nd wire.";
        }
    }

    public String solveIfFiveWires() {
        if (wireColors[wireColors.length - 1].equals("black") && bombInformations.getSerialNumberOdd()) {
            resetColorCount();
            return "cut the 4th wire.";
        } else if (redWireCount == 1 && yellowWireCount > 1) {
            resetColorCount();
            return "cut the 1st wire.";
        } else if (blackWireCount == 0) {
            resetColorCount();
            return "cut the 2nd wire.";
        } else {
            resetColorCount();
            return "cut the 1nd wire.";
        }
    }

    public String solveIfSixWires() {
        if (yellowWireCount == 0 && bombInformations.getSerialNumberOdd()) {
            resetColorCount();
            return "cut the 3th wire.";
        } else if (yellowWireCount == 1 && whiteWireCount > 1) {
            resetColorCount();
            return "cut the 4th wire.";
        } else if (redWireCount == 0) {
            resetColorCount();
            return "cut the last wire.";
        } else {
            resetColorCount();
            return "cut the 4th wire.";
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
        if (wireColor.equals("red")) redWireCount++;
        if (wireColor.equals("blue")) blueWireCount++;
        if (wireColor.equals("yellow")) yellowWireCount++;
        if (wireColor.equals("black")) blackWireCount++;
        if (wireColor.equals("white")) whiteWireCount++;

    }

    public void setColorCount() {
        for (String wire : wireColors) {
            if (wire.equals("red")) {
                countUp("red");
            } else if (wire.equals("blue")) {
                countUp("blue");
            } else if (wire.equals("black")) {
                countUp("black");
            } else if (wire.equals("yellow")) {
                countUp("yellow");
            } else if (wire.equals("white")) {
                countUp("white");
            } else {
                System.out.println("Color " + wire + " not Found");
            }
        }
    }


}
