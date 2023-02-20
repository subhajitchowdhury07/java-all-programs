import java.util.*;
public class countNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            while (true) {
                System.out.print("Enter a number (0 to quit): ");
                int number = scanner.nextInt();

                if (number == 0) {
                    break;
                } else if (number > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
            }

            System.out.printf("You entered %d positive numbers,%n %d negative numbers, and %d zeros.", positiveCount, negativeCount, zeroCount);
        }
    }


