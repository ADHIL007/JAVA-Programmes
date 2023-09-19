import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        System.out.println("1. Add\n2. Subtract\n3. Multiplication");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        char c = ' ';
        switch (choice) {
            case 1:
                result = a + b;
                c = '+';
                break;
            case 2:
                result = a - b;
                c = '-';
                break;
            case 3:
                result = a * b;
                c = '*';
                break;
        }
        System.out.println(a + " " + c + " " + b + " = " + result);
        scanner.close();
    }
}
