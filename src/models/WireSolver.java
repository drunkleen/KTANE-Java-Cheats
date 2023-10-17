package models;

import exceptions.InvalidColorException;

import java.util.Scanner;

import static models.StringUtils.ANSI_WHITE;
import static models.StringUtils.ANSI_YELLOW;

public class WireSolver {


    private static int wireCount = 0;
    private static int redWireCount = 0;
    private static int blueWireCount = 0;
    private static int blackWireCount = 0;
    private static int yellowWireCount = 0;
    private static int whiteWireCount = 0;

    private WireSolver() {
    }

    private static void countUp(String wireColor) {
        switch (wireColor) {
            case "red":
                redWireCount++;
            case "blue":
                blueWireCount++;
            case "black":
                blackWireCount++;
            case "yellow":
                yellowWireCount++;
            case "white":
                whiteWireCount++;
            default:
                break;
        }
    }

    public static void initializeWireSolver() {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        String solvedText = solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    private static String solver() {
        BombInformations bombInformations = new BombInformations();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                ANSI_WHITE + "what colors do you have " +
                        ANSI_YELLOW + "(e.g red,blue,black,white,yellow)" +
                        ANSI_WHITE + "?");
        String userInputWires = scanner.nextLine().toLowerCase();
        String[] wireColors = userInputWires.split(",");

        wireCount = wireColors.length;

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

        if (wireCount == 3) {
            if (redWireCount == 0) {
                return "cut the 2nd wire.";
            } else if (blueWireCount > 1) {
                return "cut the last blue wire.";
            } else {
                return "cut the last wire.";
            }

        } else if (wireCount == 4) {

            if (redWireCount > 1 && bombInformations.getSerialNumberOdd()) {
                return "cut the last red wire.";
            } else if ((wireColors[wireColors.length - 1] == "yellow" && redWireCount == 0) || blueWireCount == 1) {
                return "cut the 1st wire.";
            } else if (yellowWireCount > 1) {
                return "cut the last wire.";
            } else {
                return "cut the 2nd wire.";
            }

        } else if (wireCount == 5) {

            if (wireColors[wireColors.length - 1] == "black" && bombInformations.getSerialNumberOdd()) {
                return "cut the 4th wire.";
            } else if (redWireCount == 1 && yellowWireCount > 1) {
                return "cut the 1st wire.";
            } else if (blackWireCount == 0) {
                return "cut the 2nd wire.";
            } else {
                return "cut the 1nd wire.";
            }


        } else if (wireCount == 6) {

            if (yellowWireCount == 0 && bombInformations.getSerialNumberOdd()) {
                return "cut the 3th wire.";
            } else if (yellowWireCount == 1 && whiteWireCount > 1) {
                return "cut the 4th wire.";
            } else if (redWireCount == 0) {
                return "cut the last wire.";
            } else {
                return "cut the 4th wire.";
            }

        } else {
            System.out.println("Invalid wire count");
        }

        return "ashnajkhbisa";
    }

}
