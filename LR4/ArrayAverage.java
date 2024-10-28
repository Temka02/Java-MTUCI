package LR4;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // String[] anotherNumbers = {"1", "2", "three", "4", "five"};
        int sum = 0;

        try {
            for (int i = 0; i < numbers.length; i++) {
                // sum += Integer.parseInt(anotherNumbers[i]);
                sum += numbers[i]; 
            }
            double average = (double) sum / numbers.length;
            System.out.println("Average: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: array out of bounds");

        } catch (NumberFormatException e) {
            System.out.println("Error: not all array elements are numbers");
        }
    }
}

