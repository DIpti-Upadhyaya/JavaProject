package ifelse;

public class GameWinner {
    public static void announceWinnerPlayer( int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("1st Player is a winner");
        } else if (b > a && b > c) {
            System.out.println("2nd Player is a winner");
        } else if (c > a && c > b) {
            System.out.println("3rd Player is a winner");
        } else if (a == b && b > c) {
            System.out.println("1st and 2nd players are winners");
        } else if (a == c && c > b) {
            System.out.println("1st and 3rd players are winners");
        } else if (b == c && c > a) {
            System.out.println("1st and 3rd players are winners");
        } else if (b == c && c == a) {
            System.out.println("It's a tie. All players have same points");
        }
    }
    public static void main(String[] args) {
         announceWinnerPlayer(20,20,20);
         announceWinnerPlayer(10,35,20);
         announceWinnerPlayer(65,60,78);
         announceWinnerPlayer(220,200,78);
    }




}
