import java.util.HashSet;

public class ValidSudoku {


    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String number = String.valueOf(board[i][j]);
                String row = "row " + i + " " + number;
                String column = "col " + j + " " + number;
                int boxGroup = (i / 3) * 3 + (j / 3);
                String box = "box " + boxGroup + " " + number;
                if (!number.equals(".") && (!seen.add(row) || !seen.add(column) || !seen.add(box))) {
                    return false;
                }

            }
        }
        return true;
    }
}
