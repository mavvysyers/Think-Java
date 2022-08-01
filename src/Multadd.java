import java.util.Scanner;

public class Multadd {

    public static void multadd(double a, double b, double c) {
        double result = a * b + c;
        System.out.println(result);
    }

    public static void firstequation() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first number?");
        //how to make sure they enter a double?
        double a = in.nextDouble();

        System.out.println("What is your second number?");
        double b = in.nextDouble();

        System.out.println("What is your final number?");
        double c = in.nextDouble();

        System.out.println("Thank you. The answer to a * b + c is:");

        multadd(a, b, c);
    }

    public static void nope() {
        System.out.println("How disappointing...");
    }

    public static void answer() {
        Scanner in = new Scanner(System.in);


        theAnswer: while (true) {
            System.out.println("Would you like to try our first equation?");
            String answer = in.next();
            switch (answer) {
                case "yes":
                    firstequation();
                case "Yes":
                    firstequation();
                case "YES":
                    firstequation();
                case "Y":
                    firstequation();
                case "y":
                    firstequation();
                case "no":
                    nope();
                case "NO":
                    nope();
                case "No":
                    nope();
                case "n":
                    nope();
                case "N":
                    nope();
                case "nope":
                    nope();
            }
        }
    }

    public static void expSum(double x) {
        double expSum = (x * Math.exp(-x)) + Math.sqrt(1 - Math.exp(-x));


    }


    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println();
        System.out.println();

        answer();

        System.out.println();
        System.out.println();
        System.out.println("Would you like try our next calculation?");
    }
}