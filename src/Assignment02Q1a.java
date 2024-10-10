
public class Assignment02Q1a {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 12};
        int sum = 1; // Initial sum as 1
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Sum after adding " + numbers[i] + ": " + sum); // Debugging
        }
    }
}
