import java.util.Scanner;

public class LoopMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // For loop: Triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // While loop: Factorial
        int fact = 1;
        int i = n;
        while (i > 1) {
            fact *= i;
            i--;
        }
        System.out.println("Factorial: " + fact);

        // Do-while loop: Countdown
        int j = n;
        System.out.print("Countdown: ");
        do {
            System.out.print(j + " ");
            j--;
        } while (j > 0);
        System.out.println();
    }
}
