package packages;

import java.util.ArrayList;
import java.util.Scanner;

public class SimonSaysSolver {
    private final BombInformation bombInformation = new BombInformation();
    private final StringUtils stringUtils = new StringUtils();
    private final SimonSaysManager simonSaysManager = new SimonSaysManager();

    public void initializeSimonSaysSolver() {
        Utils utils = new Utils();
        utils.clearScreen();
        this.solver();
    }

    private void solver() {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> simonSaysColorList = new ArrayList<>();
        int flashChoice;

        bombInformation.getvowelInSerialNumber();

        for (int i = 0; i < 4; i++) {
            stringUtils.askUserForFlashLightColor();
            flashChoice = scanner.nextInt();


            simonSaysColorList.add(simonSaysManager.solve(flashChoice));
            System.out.println(utils.solvationText(String.valueOf(simonSaysColorList)));
        }
    }

}

