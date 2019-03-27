import java.util.Scanner;

public class NumberFibo {
    public static void main(String[] args) {

        int xxx = readUserInput();
        int numb = Math.abs(xxx);
        if (xxx < 0) {
            if (xxx % 2 != 0) {
                System.out.println(fibRecursive(numb));
                System.out.println(fibNorm(numb));
            } else {
                int resultRecurs = -1 * fibRecursive(numb);
                int resultNorm = -1 * fibNorm(numb);
                System.out.println(resultRecurs);
                System.out.println(resultNorm);
            }
        } else {
            System.out.println(fibRecursive(numb));
            System.out.println(fibNorm(numb));
        }
    }

    private static int fibRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    private static int fibNorm(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int x0 = 1;
        int x1 = 1;
        int x2;
        for (int i = 3; i <= n; i++) {
            x2 = x0 + x1;
            x0 = x1;
            x1 = x2;
        }
        return x1;
    }

    public static int readUserInput() {
        System.out.println("This program prints the fibonacci number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        boolean checkInput = true;
        while (checkInput) {
            String string = scanner.nextLine();
            try {
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Sorry. Try again!");
            }
        }
        scanner.close();
        return 0;
    }
}