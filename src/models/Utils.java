package models;
import static models.StringUtils.*;

public class Utils {


    public String boldText(String text) {
        return "\u001B[1m" + text + "\u001B[0m";
    }

    public void clearScreen() {
        System.out.print("\033\143");
        System.out.flush();
    }

    public String title(String title) {
        return boldText( ANSI_GREEN + title + ANSI_WHITE);
    }
    public String solvationText(String solvation) {
        return boldText( ANSI_YELLOW + "Solved: " + ANSI_WHITE) + solvation;
    }

}
