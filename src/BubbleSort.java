import java.util.Arrays;
public class BubbleSort {
    public static void sorting(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + Arrays.toString(numbers));
        sorting(numbers);
        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(numbers));
    }
}