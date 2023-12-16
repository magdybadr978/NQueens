public class Legal {
    public static boolean posibleQ(int i, int[][] queenBoard) {
        int r = i / Search.n, c = i % Search.n;
        int temp = 1;
        try {// up, left
            while (0 == queenBoard[r - temp][c - temp]) {
                temp++;
            }
            if (1 == queenBoard[r - temp][c - temp]) {
                return false;
            }
        } catch (Exception e) {
        }
        temp = 1;
        try {// up
            while (0 == queenBoard[r - temp][c]) {
                temp++;
            }
            if (1 == queenBoard[r - temp][c]) {
                return false;
            }
        } catch (Exception e) {
        }
        temp = 1;
        try {// up, right
            while (0 == queenBoard[r - temp][c + temp]) {
                temp++;
            }
            if (1 == queenBoard[r - temp][c + temp]) {
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }
}