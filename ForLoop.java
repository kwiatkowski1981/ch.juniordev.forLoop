import java.util.Arrays;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

// exercise 1
//        int[] numbers = new int[100];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

// exercise 2

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę do sprawdzenia");
            int tmp = scanner.nextInt();

            if (tmp % 2 == 0){
                System.out.println("Liczba " + tmp + " jest parzysta");
            }else {
                System.out.println("Liczba " + tmp + " jest nieparzysta");
            }

        }
        scanner.close();

    }
}
