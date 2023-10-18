package core.service;

import core.facade.ProblemSolver;
import core.util.StringUtils;
import core.util.Utils;

import java.util.Scanner;

public class WhosOnFirstService implements ProblemSolver {
    StringUtils stringUtils = new StringUtils();
    public void initializeWhosOnFirst() {
        Utils utils = new Utils();
        for (int i = 0; i < 4; i++) {
            String solvedText = solve();
            utils.clearScreen();
            System.out.println(utils.solvationText(solvedText));
        }

    }
    @Override
    public String solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word is shown on display?");
        String userInputStepOne = scanner.nextLine().toLowerCase();
//        return stringUtils.getWhosOnFirstHashMapFirstStep().get(userInputStepOne);
        System.out.println(
                "What is the lable of " +
                        stringUtils.getWhosOnFirstHashMapFirstStep().get(userInputStepOne) +
                        " position?"
        );
        String userInputStepTwo = scanner.nextLine().toUpperCase();
        return stringUtils.getWhosOnFirstHashMapSecondStep().get(userInputStepTwo);
    }

}
