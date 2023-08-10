import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args){
        int N=new Random().nextInt(100);
        int attempt= 0;
        int guess;
        int max= 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String user = scanner.nextLine();
        while (user.length() == 0) {
            System.out.println("Please enter your name:");
            user = scanner.nextLine();
        };
        System.out.println("Hello " + user + "! Welcome to the number guessing game.");
        for (int i = 1; i <= max; i++) {
            System.out.println("Guess a number between 0 and 100:");
            guess= scanner.nextInt();
            attempt++;
            if (guess==N){
                System.out.println("Congratulations " + user + "! You have successfully guessed the correct number in " +attempt + " attempt(s)");
                break;
            }
            else if ( guess<N) System.out.println("Your guess is too low");
            else System.out.println("Your guess is too high");
            if (i ==max)System.out.println("Sorry, " + user + ", you didn't guess the number in " + max + " attempts. The correct number was " + N);
        }
    }
}
