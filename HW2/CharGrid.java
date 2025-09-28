import java.util.Scanner;
import java.util.ArrayList;

public class CharGrid {
    private ArrayList<ArrayList<Character>> charGrid = new ArrayList<>();
    private int n;
    private int m;

    public CharGrid() {
        ArrayList<Character> tmp1 = new ArrayList<>();
        ArrayList<Character> tmp2 = new ArrayList<>();
        ArrayList<Character> tmp3 = new ArrayList<>();
        tmp1.add('b');
        tmp1.add('a');
        tmp1.add('c');
        charGrid.add(tmp1);
        tmp2.add('a');
        tmp2.add('a');
        tmp2.add('a');
        charGrid.add(tmp2);
        tmp3.add('g');
        tmp3.add('a');
        tmp3.add('k');
        charGrid.add(tmp3);
        n = charGrid.size(); // height
        m = charGrid.get(0).size(); // width
    }


    public int charArea(char ch) {
        int minRow = n, maxRow = -1;
        int minCol = m, maxCol = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ch == charGrid.get(i).get(j)) {
                minRow = Math.min(minRow, i);
                maxRow = Math.max(maxRow, i);
                minCol = Math.min(minCol, j);
                maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (minRow == n) return 0;
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public int countPlus() {
        int count = 0;
        int idx = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Try(i, j, 0, charGrid.get(i).get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean Try(int i, int j, int idx, char c) {
        int[] dx = {-1 - idx, 0, 0, 1 + idx};
        int[] dy = {0, -1 - idx, 1 + idx, 0};
        int cnt = 0;
        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            if (ni >= 0 && ni < n && nj >= 0 && nj < m && charGrid.get(ni).get(nj) == c) {
                cnt++;
            } 
        }
        if (cnt == 4) {
            return Try(i, j, idx + 1, c);
        }
        else {
            return idx >= 1;
        }
    }

    public static void main(String[] args) {
        CharGrid grid = new CharGrid();
        System.out.println(grid.charArea('a'));
        System.out.println(grid.countPlus());
    }
}
//a b c 
//d e f
//g h k 
