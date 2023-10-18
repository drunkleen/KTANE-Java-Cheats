package models;

import static models.WireManager.*;

public class WireSolver {
    private static final WireManager wireManager = new WireManager();

    private WireSolver() {
    }

    public static void initializeWireSolver() {
        Utils utils = new Utils();
        String solvedText = solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    private static String solver() {
        BombInformations bombInformations = new BombInformations();
        String[] wireColors = wireManager.wireColors();
        wireCount = wireColors.length;

        wireManager.setColorCount();

        if (wireCount == 3) {
            return wireManager.solveIfThreeWires();

        } else if (wireCount == 4) {
            return wireManager.solveIfFourWires();

        } else if (wireCount == 5) {
            return wireManager.solveIfFiveWires();

        } else if (wireCount == 6) {
            return wireManager.solveIfSixWires();
        } else {
            System.out.println("Invalid wire count");
        }

        return "Wire count invalid.";
    }

}
