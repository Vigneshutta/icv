

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeTest {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number till which the prime numbers are to be calculated: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;
      for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; 
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        String s = primes.toString().replace("[", "").replace("]", "");
        System.out.println("The number of prime is: " + primes.size() + ", and they are: " + s);
    }
}
