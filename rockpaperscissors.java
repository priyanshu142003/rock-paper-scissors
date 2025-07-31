import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user = 0;
        int computer = 0;

        String[] option = {"Rock", "Paper", "Scissor"};

        for (int round = 1; round <= 5; round++) {
            System.out.println("\nRound " + round);
            System.out.println("Enter your choice: \n0 for Rock \n1 for Paper \n2 for Scissor");
            int userchoice = sc.nextInt();

        
            if (userchoice < 0 || userchoice > 2) {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                round--;
                continue;
            }

            int computerchoice = rand.nextInt(3);

            System.out.println("Your choice: " + option[userchoice]);
            System.out.println("Computer choice: " + option[computerchoice]);

            if (userchoice == computerchoice) {
                System.out.println("It's a tie!");
            } else if (
                    (userchoice == 0 && computerchoice == 2) ||
                            (userchoice == 1 && computerchoice == 0) ||
                            (userchoice == 2 && computerchoice == 1)) {
                System.out.println("You win the round ");
                user++;
            } else {
                System.out.println("Computer wins the round ");
                computer++;
            }

            System.out.println("Score => You: " + user + " | Computer: " + computer);
        }

        System.out.println("\nGame Over ");
        if (user > computer) {
            System.out.println(" You are  winner!");
        } else if (computer > user) {
            System.out.println("Computer is winner!");
        } else 
            System.out.println("It's a draw!");
        }
    }

    
