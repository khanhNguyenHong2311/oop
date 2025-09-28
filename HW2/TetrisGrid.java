import java.util.Scanner;
import java.util.ArrayList;

public class TetrisGrid {
    private boolean[][] grid;
    private int n;
    private int m;

    public TetrisGrid(boolean[][] _grid) {
        grid = _grid;
        n = grid.length;
        m = grid[0].length;
    }

    public void clearRows() {
        for (int i = 0; i < n; i++) {
            boolean check = false;
            int tmp = 0;
            for (int j = 0; j< m; j++) {
                if (grid[i][j] != true ) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                for (int k = i; k > 0; k--) {
                    for (int h = 0; h < m; h++) {
                        grid[k][h] = grid[k-1][h];
                    }
                }
                for (int k = 0; k < m; k++) {
                    grid[0][k] = false;
                }
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }
    public static void main(String args[]) {
        boolean[][] tmp = {
            {true , true , true},
            {false , false , false}
        };
        TetrisGrid grid = new TetrisGrid(tmp);
        grid.clearRows();
        grid.getGrid();
    }
}
