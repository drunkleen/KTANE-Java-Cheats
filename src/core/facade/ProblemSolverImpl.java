package core.facade;

import core.service.ButtonService;
import core.service.PasswordService;
import core.service.SimonSaysService;
import core.service.WireService;

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

}
