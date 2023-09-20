import java.util.Scanner;

public class largestOfthreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + "th number");
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        for (int i = 1; i < 3; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("The greatest number is " + largest);
    }
}
