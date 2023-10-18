package core.util;

import java.util.HashMap;
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
    public static final String RED = "red";
    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final String BLUE = "blue";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String CUT_LAST_RED_WIRE = "cut the last red wire.";
    public static final String CUT_FIRST_WIRE = "cut the 1st wire.";
    public static final String CUT_SECOND_WIRE = "cut the 2nd wire.";
    public static final String CUT_THIRD_WIRE = "cut the 3th wire.";
    public static final String CUT_FOURTH_WIRE = "cut the 4th wire.";
    public static final String CUT_LAST_WIRE = "cut the last wire.";
    public static final String TL = "Top Left";
    public static final String TR = "Top Right";
    public static final String ML = "Middle Left";
    public static final String MR = "Middle Right";
    public static final String BL = "Bottom Left";
    public static final String BR = "Bottom Right";








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

    public HashMap<String, String> getWhosOnFirstHashMapFirstStep() {
        HashMap<String, String> map = new HashMap<>();
        map.put("yes", ML);
        map.put("first", TR);
        map.put("display", BR);
        map.put("okay", TR);
        map.put("says", BR);
        map.put("nothing", ML);
        map.put("empty", BL);
        map.put("blank", MR);
        map.put("no", BR);
        map.put("led", ML);
        map.put("lead", BR);
        map.put("read", MR);
        map.put("red", MR);
        map.put("reed", BL);
        map.put("leed", BL);
        map.put("hold on", BR);
        map.put("you", MR);
        map.put("you are", BR);
        map.put("your", MR);
        map.put("you're", MR);
        map.put("ur", TL);
        map.put("there", BR);
        map.put("they're", BL);
        map.put("their", MR);
        map.put("they are", ML);
        map.put("see", BR);
        map.put("c", TR);
        map.put("cee", BR);

        return map;
    }
    public HashMap<String, String> getWhosOnFirstHashMapSecondStep() {
        HashMap<String, String> map = new HashMap<>();
        map.put("READY", " YES, OKAY, WHAT, MIDDLE, LEFT, PRESS, RIGHT, BLANK, READY, NO, FIRST, UHHH, NOTHING, WAIT");
        map.put("FIRST", " LEFT, OKAY, YES, MIDDLE, NO, RIGHT, NOTHING, UHHH, WAIT, READY, BLANK, WHAT, PRESS, FIRST");
        map.put("NO", " BLANK, UHHH, WAIT, FIRST, WHAT, READY, RIGHT, YES, NOTHING, LEFT, PRESS, OKAY, NO, MIDDLE");
        map.put("BLANK", " WAIT, RIGHT, OKAY, MIDDLE, BLANK, PRESS, READY, NOTHING, NO, WHAT, LEFT, UHHH, YES, FIRST");
        map.put("NOTHING", " UHHH, RIGHT, OKAY, MIDDLE, YES, BLANK, NO, PRESS, LEFT, WHAT, WAIT, FIRST, NOTHING, READY");
        map.put("YES", " OKAY, RIGHT, UHHH, MIDDLE, FIRST, WHAT, PRESS, READY, NOTHING, YES, LEFT, BLANK, NO, WAIT");
        map.put("WHAT", " UHHH, WHAT, LEFT, NOTHING, READY, BLANK, MIDDLE, NO, OKAY, FIRST, WAIT, YES, PRESS, RIGHT");
        map.put("UHHH", " READY, NOTHING, LEFT, WHAT, OKAY, YES, RIGHT, NO, PRESS, BLANK, UHHH, MIDDLE, WAIT, FIRST");
        map.put("LEFT", " RIGHT, LEFT, FIRST, NO, MIDDLE, YES, BLANK, WHAT, UHHH, WAIT, PRESS, READY, OKAY, NOTHING");
        map.put("RIGHT", " YES, NOTHING, READY, PRESS, NO, WAIT, WHAT, RIGHT, MIDDLE, LEFT, UHHH, BLANK, OKAY, FIRST");
        map.put("MIDDLE", " BLANK, READY, OKAY, WHAT, NOTHING, PRESS, NO, WAIT, LEFT, MIDDLE, RIGHT, FIRST, UHHH, YES");
        map.put("OKAY", " MIDDLE, NO, FIRST, YES, UHHH, NOTHING, WAIT, OKAY, LEFT, READY, BLANK, PRESS, WHAT, RIGHT");
        map.put("WAIT", " UHHH, NO, BLANK, OKAY, YES, LEFT, FIRST, PRESS, WHAT, WAIT, NOTHING, READY, RIGHT, MIDDLE");
        map.put("PRESS", " RIGHT, MIDDLE, YES, READY, PRESS, OKAY, NOTHING, UHHH, BLANK, LEFT, FIRST, WHAT, NO, WAIT");
        map.put("YOU", " SURE, YOU ARE, YOUR, YOU'RE, NEXT, UH HUH, UR, HOLD, WHAT?, YOU, UH UH, LIKE, DONE, U");
        map.put("YOU ARE", " YOUR, NEXT, LIKE, UH HUH, WHAT?, DONE, UH UH, HOLD, YOU, U, YOU'RE, SURE, UR, YOU ARE");
        map.put("YOUR", " UH UH, YOU ARE, UH HUH, YOUR, NEXT, UR, SURE, U, YOU'RE, YOU, WHAT?, HOLD, LIKE, DONE");
        map.put("YOU'RE", " YOU, YOU'RE, UR, NEXT, UH UH, YOU ARE, U, YOUR, WHAT?, UH HUH, SURE, DONE, LIKE, HOLD");
        map.put("UR", " DONE, U, UR, UH HUH, WHAT?, SURE, YOUR, HOLD, YOU'RE, LIKE, NEXT, UH UH, YOU ARE, YOU");
        map.put("U", " UH HUH, SURE, NEXT, WHAT?, YOU'RE, UR, UH UH, DONE, U, YOU, LIKE, HOLD, YOU ARE, YOUR");
        map.put("UH HUH", " UH HUH, YOUR, YOU ARE, YOU, DONE, HOLD, UH UH, NEXT, SURE, LIKE, YOU'RE, UR, U, WHAT?");
        map.put("UH UH", " UR, U, YOU ARE, YOU'RE, NEXT, UH UH, DONE, YOU, UH HUH, LIKE, YOUR, SURE, HOLD, WHAT?");
        map.put("WHAT?", " YOU, HOLD, YOU'RE, YOUR, U, DONE, UH UH, LIKE, YOU ARE, UH HUH, UR, NEXT, WHAT?, SURE");
        map.put("DONE", " SURE, UH HUH, NEXT, WHAT?, YOUR, UR, YOU'RE, HOLD, LIKE, YOU, U, YOU ARE, UH UH, DONE");
        map.put("NEXT", " WHAT?, UH HUH, UH UH, YOUR, HOLD, SURE, NEXT, LIKE, DONE, YOU ARE, UR, YOU'RE, U, YOU");
        map.put("HOLD", " YOU ARE, U, DONE, UH UH, YOU, UR, SURE, WHAT?, YOU'RE, NEXT, HOLD, UH HUH, YOUR, LIKE");
        map.put("SURE", " YOU ARE, DONE, LIKE, YOU'RE, YOU, HOLD, UH HUH, UR, SURE, U, WHAT?, NEXT, YOUR, UH UH");
        map.put("LIKE", " YOU'RE, NEXT, U, UR, HOLD, DONE, UH UH, WHAT?, UH HUH, YOU, LIKE, SURE, YOU ARE, YOUR");

        return map;
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
        BombInformation bombInformation = new BombInformation();
        if (bombInformation.getStrikes() >= 3) {
            bombInformation.resetBombInformation();
        }
        return bombInformation.getStrikes();
    }

    public void askUserForChoice() {
        utils.clearScreen();
        BombInformation bombInformation = new BombInformation();
        System.out.println(utils.title("Welcome to KTANE Cheat!!!"));
        System.out.println(
                """
                        1. Wire Solver.
                        2. Button Solver.
                        3. Simon Says Solver.
                        4. Password Solver.
                        5. Who’s on First.
                        """
        );
        if (bombInformation.getStrikes() <= 0) {
            System.out.println("0. Strike");
        } else {
            System.out.println("0. Strike" + "[" + bombInformation.getStrikes() + "]");
        }
    }

    public void askUserForChoiceButtonLabel() {
        utils.clearScreen();
        System.out.println(utils.title(
                "Which label does the button have?"
        ));
        System.out.println(
                """
                        1. Detonate.
                        2. Hold.
                        3. Press.
                        4. Abort.
                        """
        );
    }

    public void askUserForChoiceButtonColor() {
        utils.clearScreen();
        System.out.println(utils.title("Which color does the button have?"));
        System.out.println(
                        "1. " + ANSI_RED + "Red.\n" + ANSI_WHITE +
                        "2. " + ANSI_YELLOW + "Yellow.\n" + ANSI_WHITE +
                        "3. " + ANSI_BLUE + "Blue.\n" + ANSI_WHITE +
                        "4. " + ANSI_WHITE + "White." + ANSI_WHITE
        );
    }

    public void askUserForButtonLightColor() {
        utils.clearScreen();
        System.out.println(utils.title("Which is the light?"));
        System.out.println(
                "1. " + ANSI_RED + "Red.\n" + ANSI_WHITE +
                        "2. " + ANSI_YELLOW + "Yellow.\n" + ANSI_WHITE +
                        "3. " + ANSI_BLUE + "Blue.\n" + ANSI_WHITE +
                        "4. " + ANSI_WHITE + "White." + ANSI_WHITE
        );
    }

    public void askUserForFlashLightColor() {
        utils.clearScreen();
        System.out.println(utils.title("Which is the light?"));
        System.out.println(
                "1. " + ANSI_RED + "Red.\n" + ANSI_WHITE +
                "2. " + ANSI_YELLOW + "Yellow.\n" + ANSI_WHITE +
                "3. " + ANSI_BLUE + "Blue.\n" + ANSI_WHITE +
                "4. " + ANSI_GREEN + "Green." + ANSI_WHITE
        );
    }

}
