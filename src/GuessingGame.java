import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;


            System.out.println("I'm thinking of a number between 1 and 100." );
            System.out.println();
            System.out.println("Can you guess what it is?");
            System.out.println("Type a number: ");


            //start while loop here!

            int guess = in.nextInt();
            System.out.println("Your guess is: " + guess);


            int i = 1;
            while (i < 4) {
                i++;
                if (randomNumber > guess) {

                    System.out.println("Your guess was too low.");
                    if ((i == 2) && (guess != randomNumber)) {
                        System.out.println("Strike one! Try again:");
                    } else if ((i == 3) && (guess != randomNumber)) {
                        System.out.println("Strike two! Try again:");
                    } else if ((i == 4) && (guess != randomNumber)) {
                        System.out.println("Strike three! You're out!");
                        System.out.print("The number I was thinking of is: " + randomNumber);
                        System.out.println();
                        System.out.print("You were off by: ");
                        int difference = randomNumber - guess;
                        System.out.println(difference);
                        System.out.println("Thanks for playing!");
                    }
                    guess = in.nextInt();

                } else if (randomNumber < guess) {
                    System.out.println("Your guess was too high.");
                    if ((i == 2) && (guess != randomNumber)) {
                        System.out.println("Strike one! Try again:");
                    } else if ((i == 3) && (guess != randomNumber)) {
                        System.out.println("Strike two! Try again:");
                    } else if ((i == 4) && (guess != randomNumber)) {
                        System.out.println("Strike three! You're out!");
                        System.out.print("The number I was thinking of is: " + randomNumber);
                        System.out.println();
                        System.out.print("You were off by: ");
                        int difference = guess - randomNumber;
                        System.out.println(difference);
                        System.out.println("Thanks for playing!");
                    }
                    guess = in.nextInt();

                } else if (randomNumber == guess) {
                    System.out.println("Congratulations on guessing correctly!");
                    System.out.println("Thanks for playing!");
                }
            }

        }

    }

