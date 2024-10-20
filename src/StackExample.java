public class StackExample {
    public static void main(String[] args) {
        functionA(5);
    }

    static void functionA(int x) {
        int y = x + 1;  // Local variable
        System.out.println("Value in functionA: " + y);
        functionB(y);
    }

    static void functionB(int z) {
        System.out.println("Value in functionB: " + z);
        // Function logic can go here
    }
}
