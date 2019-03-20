import java.util.Scanner;

public class NumberFibo {
    public static void main(String[] args) {

        int xxx = toPrint();
        int numb = Math.abs(xxx);
        if (xxx < 0) {
            if (!(xxx % 2 == 0)) {
                System.out.println(fibRecursive(numb));
                System.out.println(fibNorm(numb));
            } else {
                System.out.println("-" + fibRecursive(numb));
                System.out.println("-" + fibNorm(numb));
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
        if (n > 0) {
            if (n > 2) {
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
            return 1;
        }
        return 0;
    }


    public static int toPrint() {
        System.out.println("This program print the fibonacci number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        String string = scanner.nextLine();
        scanner.close();
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Sorry. Restart the program and try again!");
            System.exit(0);
        }
        return 0;

    }


}



