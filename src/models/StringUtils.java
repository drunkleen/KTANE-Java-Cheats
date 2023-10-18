package models;

import java.util.Scanner;

public class StringUtils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    Utils utils = new Utils();


    public String[] getWords() {
        return new String[]{"about", "after", "again", "below", "could",
                "every", "first", "found", "great", "house",
                "large", "learn", "never", "other", "place",
                "plant", "point", "right", "small", "sound",
                "spell", "still", "study", "their", "there",
                "these", "thing", "think", "three", "water",
                "where", "which", "world", "would", "write",};
    }

    public String[] getPasswordEntries() {
        Scanner scanner = new Scanner(System.in);
        String[] entries = new String[5];

        System.out.print("write first characters [you can seperate them with ,]: ");
        entries[0] = scanner.nextLine();

        System.out.print("write second characters [you can seperate them with ,]: ");
        entries[1] = scanner.nextLine();

        System.out.print("write third characters [you can seperate them with ,]: ");
        entries[2] = scanner.nextLine();

        System.out.print("write fourth characters [you can seperate them with ,]: ");
        entries[3] = scanner.nextLine();

        System.out.print("write fifth characters [you can seperate them with ,]: ");
        entries[4] = scanner.nextLine();
        return entries;
    }

    public int strikeManager() {
        BombInformations bombInformations = new BombInformations();
        if (bombInformations.getStrikes() >= 3) {
            bombInformations.resetBombInformation();
        }
        return bombInformations.getStrikes();
    }

    public void askUserForChoice() {
        utils.clearScreen();
        BombInformations bombInformations = new BombInformations();
        System.out.println(utils.title("Welcome to KTANE Cheat!!!"));
        System.out.println(
                """
                        1. Wire Solver.
                        2. Button Solver.
                        3. Simon Says Solver.
                        4. Password Solver.
                        """
        );
        if (bombInformations.getStrikes() <= 0) {
            System.out.println("0. Strike");
        } else {
            System.out.println("0. Strike" + "[" + bombInformations.getStrikes() + "]");
        }
    }

}
