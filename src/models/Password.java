package models;


import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Password {
    private static final String[] wordList = {
            "about", "after", "again", "below", "could",
            "every", "first", "found", "great", "house",
            "large", "learn", "never", "other", "place",
            "plant", "point", "right", "small", "sound",
            "spell", "still", "study", "their", "there",
            "these", "thing", "think", "three", "water",
            "where", "which", "world", "would", "write",
    };
    public Password() {
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        String solvedText = solver();
        utils.clearScreen();
        System.out.println(utils.solvationText(solvedText));
        System.out.println(utils.boldText("\nPress 'Enter' to return."));
        scanner.nextLine();

    }

    private String solver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write first characters [you can seperate them with ,]: ");
        String firstParameter = scanner.nextLine();
        System.out.print("write second characters [you can seperate them with ,]: ");
        String secondParameter = scanner.nextLine();
        System.out.print("write third characters [you can seperate them with ,]: ");
        String thirdParameter = scanner.nextLine();
        System.out.print("write fourth characters [you can seperate them with ,]: ");
        String fourthParameter = scanner.nextLine();
        System.out.print("write fifth characters [you can seperate them with ,]: ");
        String fifthParameter = scanner.nextLine();

        for (String word : wordList) {
            if (
                    firstParameter.contains(String.valueOf(word.charAt(0))) &&
                    secondParameter.contains(String.valueOf(word.charAt(1))) &&
                    thirdParameter.contains(String.valueOf(word.charAt(2))) &&
                    fourthParameter.contains(String.valueOf(word.charAt(3))) &&
                    fifthParameter.contains(String.valueOf(word.charAt(4)))
                    ) {
                return word;

            }
        }
        return "-1";
    }




}
