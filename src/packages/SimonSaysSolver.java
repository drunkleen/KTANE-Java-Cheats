package packages;

import java.util.ArrayList;
import java.util.Scanner;

public class SimonSaysSolver {
    static BombInformations bombInformations = new BombInformations();
    private static final StringUtils stringUtils = new StringUtils();

    private SimonSaysSolver() {
    }

    public static void initializeSimonSaysSolver() {
        Utils utils = new Utils();
        utils.clearScreen();
        solver();
    }

    private static void solver() {
        SimonSaysManager simonSaysManager = new SimonSaysManager();
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> simonSaysColorList = new ArrayList<String>();
        int flashChoice;

        bombInformations.getvowelInSerialNumber();

        for (int i = 0; i < 4; i++) {
            stringUtils.askUserForFlashLightColor();
            flashChoice = scanner.nextInt();

            simonSaysColorList.add(SimonSaysManager.solve(flashChoice));
            System.out.println(utils.solvationText(String.valueOf(simonSaysColorList)));
        }
    }

}

