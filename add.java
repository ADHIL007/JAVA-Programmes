public class add {
    public static void main(String[] args) {
        // Primitive int
        int num = 42;

        // Using Integer wrapper class
        Integer wrappedNum = Integer.valueOf(num); // Wrapping

        // Performing operations
        int result = wrappedNum + 10;

        System.out.println("Original Number: " + num);
        System.out.println("Wrapped Number: " + wrappedNum);
        System.out.println("Result: " + result);

        if (wrappedNum == num) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}