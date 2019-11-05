/**
 * https://www.codewars.com/kata/587136ba2eefcb92a9000027
 */
public class SnakesLadders {
    public SnakesLadders() {
    }

    private static int[] board = new int[]{
            -1, 38, -1, -1, -1, -1, 14, 31, -1, -1, //1-10
            -1, -1, -1, -1, 26, 6, -1, -1, -1, -1, //11-20
            42, -1, -1, -1, -1, -1, -1, 84, -1, -1, //21-30
            -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, //31-40
            -1, -1, -1, -1, -1, 25, -1, -1, 11, -1, //41-50
            67, -1, -1, -1, -1, -1, -1, -1, -1, -1, //51-60
            -1, 19, -1, 60, -1, -1, -1, -1, -1, -1, //61-70
            91, -1, -1, 53, -1, -1, -1, 98, -1, -1, //71-80
            -1, -1, -1, -1, -1, -1, 94, -1, 68, -1, //81-90
            -1, 88, -1, -1, 75, -1, -1, -1, 80, -1  //91-100
    };

    private int[] players = new int[] {0, 0};
    private int currentPlayer = 0;
    private boolean gameOver = false;

    public String play(int die1, int die2) {
        if (gameOver)
            return "Game over!";

        players[currentPlayer] += die1 + die2;

        if (players[currentPlayer] > 100) {
            players[currentPlayer] = 200 - players[currentPlayer];
        }

        if (board[players[currentPlayer] - 1] != -1)
            players[currentPlayer] = board[players[currentPlayer] - 1];

        String message;

        if (players[currentPlayer] == 100) {
            message = String.format("Player %d Wins!", currentPlayer + 1);
            gameOver = true;
        } else
            message = String.format("Player %d is on square %s", currentPlayer + 1, players[currentPlayer]);

        if (die1 != die2) {
            if (currentPlayer == 0) {
                currentPlayer = 1;
            } else {
                currentPlayer = 0;
            }
        }
        return message;
    }
}
