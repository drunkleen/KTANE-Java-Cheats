package core.util;

public class MazeUtils {

    public void printMaze(int[][] maze) {
        char[][] mazeToPrint = new char[13][13];

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                if (maze[row][col] == 1) {
                    mazeToPrint[row][col] = '█';
                } else if (maze[row][col] == 0) {
                    mazeToPrint[row][col] = ' ';
                } else if (maze[row][col] == 2) {
                    if (row % 2 != 0 && col % 2 != 0) {
                        mazeToPrint[row][col] = '•';
                    }
                    else {
                        mazeToPrint[row][col] = ' ';
                    }

                }
            }
        }
        for (int row = 0; row < mazeToPrint.length; row++) {
            for (int col = 0; col < mazeToPrint[row].length; col++) {
                System.out.print(" " + mazeToPrint[row][col] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getMaze(String[] firstPoint, String[] secondPoint) {
        if (

                (pointChecker(firstPoint, 1,2) && pointChecker(secondPoint, 6,3)) ||
                (pointChecker(firstPoint, 6,3) && pointChecker(secondPoint, 1,2))
        ) {
            return getFirstMaze();
        }
        else if (
                (pointChecker(firstPoint, 2,4) && pointChecker(secondPoint, 5,2)) ||
                (pointChecker(firstPoint, 5,2) && pointChecker(secondPoint, 2,4))
        ) {
            return getSecondtMaze();
        }
        return null;
    }

    private boolean pointChecker(String[] pointsToCheck, int pointX, int pointY ){
        if (Integer.parseInt(pointsToCheck[0]) == pointX && Integer.parseInt(pointsToCheck[1]) == pointY) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] getMazeDirections() {
        return new int[][]
                {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
                };
    }

    public int[][] getFirstMaze() {
        return new int[][] {
                //0 1  2  3  4  5  6  7  8  9 10  11 12
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // 0
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 1
                {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1}, // 2
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 3
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, // 4
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 5
                {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, // 6
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1}, // 7
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}, // 8
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1}, // 9
                {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, // 10
                {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1}, // 11
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // 12
        };
    }

    public int[][] getSecondtMaze() {
        return new int[][] {
                //0 1  2  3  4  5  6  7  8  9 10  11 12
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // 0
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 1
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1}, // 2
                {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1}, // 3
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, // 4
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 5
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1}, // 6
                {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1}, // 7
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1}, // 8
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1}, // 9
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1}, // 10
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, // 11
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}  // 12
        };
    }
}
