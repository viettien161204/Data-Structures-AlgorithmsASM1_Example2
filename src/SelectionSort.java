import java.util.Arrays;
public class SelectionSort {
    public static void sorting(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            swap(numbers, i, min);
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + Arrays.toString(numbers));
        sorting(numbers);
        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(numbers));
    }
}