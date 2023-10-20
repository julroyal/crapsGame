import java.util.Random;
import java.util.Scanner;

public class crapsGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        boolean replay = true;
        final int roll = die1 + die2;
        int point = 0;

        while(replay){
            if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You rolled " + roll + ". Craps! You lose.");
            } else if (roll == 7 || roll == 11) {
                System.out.println("You rolled " + roll + ". Natural! You win.");
            }
            while (point != roll && point != 7) {
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                point = die1 + die2;
                System.out.println("You rolled " + point + ". Roll Again.");
            }
            if (point == roll) {
                System.out.println("You rolled " + point + ". You win!");
            } else {
                System.out.println("You rolled " + point + ". You lose.");
            }
            System.out.println("Would you like to play again? [Y/N]");
            String answer = in.nextLine();
            replay = answer.equalsIgnoreCase("y");
        }
        System.exit(0);
    }
}