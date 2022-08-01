
import java.util.Random;

public class DiceRoller {

   public static void main(String[] args){

        Random random = new Random();
        rolld4(random);
        System.out.println();
        rolld6(random);
        System.out.println();
        rolld8(random);
        System.out.println();
        rolld10(random);
        System.out.println();
    }

    private static void rolld4(Random random) {
        int number = random.nextInt(4) + 1;
        System.out.print(number);
    }

    private static void rolld6(Random random) {
        int number = random.nextInt(6) + 1;
        System.out.print(number);
    }

    private static void rolld8(Random random) {
        int number = random.nextInt(8) + 1;
        System.out.print(number);
    }

    private static void rolld10(Random random) {
        int number = random.nextInt(10) + 1;
        System.out.print(number);
    }
}
