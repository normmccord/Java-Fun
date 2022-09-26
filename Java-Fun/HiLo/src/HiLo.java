import java.util.Random;
import java.util.Scanner;

public class HiLo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Random random = new Random();
        int rand = random.nextInt(100)+1;
        int guess = -1;


        while (guess != rand){
            System.out.print("Guess what number I'm thinking of (0-100): ");
            guess = sc.nextInt();
            if (guess == rand){
                System.out.println("You guessed it!");
            } else if (guess < rand) {
                System.out.println("Too low!");
            } else if (rand < guess) {
                System.out.println("Too high!");
            }
        }

    }
}
