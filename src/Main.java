import models.Password;
import models.Utils;

import java.util.Scanner;

import static models.Utils.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();
        while (true) {
            utils.clearScreen();
            System.out.println(utils.title("Welcome to KTANE Cheat!!!"));
            System.out.println(
                    """
                            1. Wire Solver.
                            2. Button Solver.
                            3. Simon Says Solver.
                            4. Password Solver
                            """
            );

            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    Password password = new Password();
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                default:
                    break;
            }
        }

    }
}