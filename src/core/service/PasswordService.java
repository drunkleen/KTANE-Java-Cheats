package core.service;


import core.facade.ProblemSolver;
import core.util.StringUtils;
import core.util.Utils;

public class PasswordService implements ProblemSolver {
    private final StringUtils stringUtils = new StringUtils();

    public void initializePasswordSolver() {
        Utils utils = new Utils();
        String solvedText = this.solve();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
    }

    @Override
    public String solve() {
        String[] passwordEntries = stringUtils.getPasswordEntries();
        for (String word : stringUtils.getWords()) {
            if (
                    passwordEntries[0].contains(String.valueOf(word.charAt(0))) &&
                            passwordEntries[1].contains(String.valueOf(word.charAt(1))) &&
                            passwordEntries[2].contains(String.valueOf(word.charAt(2))) &&
                            passwordEntries[3].contains(String.valueOf(word.charAt(3))) &&
                            passwordEntries[4].contains(String.valueOf(word.charAt(4)))
            ) {
                return word;

            }
        }

        return "No match found";
    }

}
