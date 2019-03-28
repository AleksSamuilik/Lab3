import java.util.Scanner;

public class NumberFibo {
    public static void main(String[] args) {

        int xxx = readUserInput();
        System.out.println(fibRecursive(xxx));
        System.out.println(fibNorm(xxx));
    }


    private static int fibRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == -1) return 1;
        if (n == 2) return 1;
        if (n == -2) return -1;
        int j = Math.abs(n);
        int result = fibRecursive(j - 1) + fibRecursive(j - 2);
        return n > 2 || n % 2 != 0 ? result : result*-1;
    }

    private static int fibNorm(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == -1) return 1;
        if (n == 2) return 1;
        if (n == -2) return -1;
        int j = Math.abs(n);

        int x0 = 1;
        int x1 = 1;
        int x2;
        for (int i = 3; i <= j; i++) {
            x2 = x0 + x1;
            x0 = x1;
            x1 = x2;
        }
        if (n > 2 || n % 2 != 0) {
            return x1;
        }
        return x1 * -1;
    }

    public static int readUserInput() {
        System.out.println("This program prints the fibonacci number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            try {
                int number = Integer.parseInt(string);
                scanner.close();
                return number;

            } catch (NumberFormatException e) {
                System.out.println("Sorry. Try again!");
            }
        }
        return -1;
    }
}
