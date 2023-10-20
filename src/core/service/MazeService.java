package core.service;

import core.util.MazeUtils;
import core.util.Utils;

import java.util.Scanner;

public class MazeService {
    private final MazeUtils mazeUtils = new MazeUtils();
    public void initializeMazeSolver() {
        Utils utils = new Utils();
        utils.clearScreen();
        this.solve();
    }

    public void solve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input the start point coordinates (eg. x, y)");
        String[] startPoint = scanner.nextLine().replace(" ", "").split(",");

        System.out.println("input the end point coordinates (eg. x, y)");
        String[] endPoint = scanner.nextLine().replace(" ", "").split(",");
        
        int[][] solvedMaze = this.solveMaze(
                (Integer.parseInt(startPoint[0]) * 2) - 1,
                (Integer.parseInt(startPoint[1]) * 2) - 1,
                (Integer.parseInt(endPoint[0]) * 2) - 1,
                (Integer.parseInt(endPoint[1]) * 2) - 1,
                mazePatternFinder()
        );
        if (solvedMaze != null) {
            mazeUtils.printMaze(solvedMaze);
        }
        else {
            System.out.println("No solution");
        }

    }

    public int[][] mazePatternFinder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input the first circle coordinates (eg. x, y)");
        String[] firstPoint = scanner.nextLine().replace(" ", "").split(",");

        System.out.println("input the second circle coordinates (eg. x, y)");
        String[] secondPoint = scanner.nextLine().replace(" ", "").split(",");

        if (
                ((Integer.parseInt(firstPoint[0]) == 1 && Integer.parseInt(firstPoint[1]) == 2) &&
                (Integer.parseInt(secondPoint[0]) == 6 && Integer.parseInt(secondPoint[1]) == 3))
                ||
                ((Integer.parseInt(firstPoint[0]) == 6 && Integer.parseInt(firstPoint[1]) == 3) &&
                (Integer.parseInt(secondPoint[0]) == 1 && Integer.parseInt(secondPoint[1]) == 2))
        ) {
            return mazeUtils.getFirstMaze();
        }
        else if (
                ((Integer.parseInt(firstPoint[0]) == 2 && Integer.parseInt(firstPoint[1]) == 4) &&
                (Integer.parseInt(secondPoint[0]) == 5 && Integer.parseInt(secondPoint[1]) == 2))
                ||
                ((Integer.parseInt(firstPoint[0]) == 5 && Integer.parseInt(firstPoint[1]) == 2) &&
                (Integer.parseInt(secondPoint[0]) == 2 && Integer.parseInt(secondPoint[1]) == 4))
        ) {
            return mazeUtils.getSecondtMaze();
        }
        return null;
    }

    public int[][] solveMaze(int posX, int posY, int endX, int endY ,int[][] maze ) {
        if (posX == endX && posY == endY) {
            return maze;
        }
        if (this.positionValidation(posX, posY, maze)) {
            maze[posY][posX] = 2;

            for (int[] direction: mazeUtils.getMazeDirections()) {
                int new_x = posX + direction[0];
                int new_y = posY + direction[1];
                if (this.solveMaze(new_x, new_y, endX, endY, maze) != null) {
                    return maze;
                }
            }
            maze[posY][posX] = 0;
        }
        return null;
    }

    public boolean positionValidation(int x, int y, int[][] maze) {
        return ((0 < x && x < 13) && (0 < y && y < 13) && maze[y][x] == 0);
    }

}
