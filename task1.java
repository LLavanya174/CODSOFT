import java.util.Random;
import java.util.Scanner;
public class task1{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       Random random=new Random();
       int rounds=0;
       System.out.println("Let's start the number guessing game!");
       boolean play=true;
       while(play){
        int guessnumber=random.nextInt(100)+1;
        int attempt=5;
        boolean guessedcorrect=false;
        System.out.println("I selected a number between 1 and 100");
        System.out.println("you have "+ attempt + " attempts to guess that number");
        while(attempt>0){
            System.out.println("Enter the number you guessed");
            int userguessed=sc.nextInt();
            if(userguessed==guessnumber){
                System.out.println("COngrats,you guessed it correctly");
                guessedcorrect=true;
                rounds++;
                break;
            }
            else if(userguessed>guessnumber){
                System.out.println("You guessed to high");
            }
            else{
                System.out.println("You guessed to low");
            }
            attempt--;
            System.out.println("You have "+attempt + "attempts left to guess");
        }
        if(!guessedcorrect){
            System.out.println("You run out of the attempts..");
        }
        System.out.println("Do you want to play again?(Yes/No)");
        String response=sc.next().toLowerCase();
        play=response.equals("yes");
       }
       System.out.println("Game over you won "+ rounds + "rounds in this number guessing game");

    }
}