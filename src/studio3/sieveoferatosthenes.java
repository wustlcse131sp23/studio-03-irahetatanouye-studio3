package studio3;

import java.util.Scanner;

public class sieveoferatosthenes {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    boolean[] prime = new boolean[n + 1];

    // Initialize the primes array with true values
    for (int i = 0; i <= n; i++) {
        prime[i] = true;
    }

    // non-prime numbers as false
    for (int j = 2; j * j <= n; j++) {
        if (prime[j]) {
            for (int i = j * j; i <= n; i += j) {
                prime[i] = false;
            }
        }
    }

    // Print all the prime numbers
    for (int i = 2; i <= n; i++) {
        if (prime[i]) {
            System.out.print(i+ " ");
        }
    }
}
}