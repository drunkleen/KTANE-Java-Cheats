package core.facade;

import core.service.*;

public class ProblemSolverImpl {

    public void solveSimonSays() {
        SimonSaysService simonSaysService = new SimonSaysService();
        simonSaysService.initializeSimonSaysSolver();
    }

    public void solveButton() {
        ButtonService buttonService = new ButtonService();
        buttonService.initializeButtonSolver();
    }

    public void solveWires() {
        WireService wireService = new WireService();
        wireService.initializeWireSolver();
    }

    public void solvePassword() {
        PasswordService passwordService = new PasswordService();
        passwordService.initializePasswordSolver();
    }

    public void solveWhosOnFirst() {
        WhosOnFirstService whosOnFirstService = new WhosOnFirstService();
        whosOnFirstService.initializeWhosOnFirst();
    }

}
