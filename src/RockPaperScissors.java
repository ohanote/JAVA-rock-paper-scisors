import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        while (true) {
            String computerMove;
            while (true) {
                computerMove = rps[new Random().nextInt(rps.length)];
                System.out.println("Please enter your move ( r, p, s)");
                playerMove = scanner.nextLine();

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }

                System.out.println(playerMove + " is not a valid move");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You Win!");
                }
            }

            System.out.println("Do you wanna play again?");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("n")) {
                break;
            }
        }
    }
}