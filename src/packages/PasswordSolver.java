package packages;


import java.util.Scanner;

public class PasswordSolver {
    private static final StringUtils stringUtils = new StringUtils();


    private PasswordSolver() {
    }

    public static void initializePasswordSolver() {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        String solvedText = solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));

//        scanner.nextLine();
    }

    private static String solver() {
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
