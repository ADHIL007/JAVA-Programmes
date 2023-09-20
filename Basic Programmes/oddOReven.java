import java.util.Scanner;

public class oddOReven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The Given number is even");

        } else {
            System.out.println("The Given number is odd");
        }

    }
}
