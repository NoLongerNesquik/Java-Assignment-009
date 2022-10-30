import java.util.Scanner;

public class ArrayProcessing {
    int[] array;
    Scanner in;
    public ArrayProcessing() {
        array = new int[5];
        in = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        System.out.println("Input five integers for array assignment:");
        for(int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }
    public void processNumbers() {
        boolean conditon;
        do {
            int num = printMenu();
            switch (num) {
                case 1 -> add();
                case 2 -> mult();
                case 3 -> print();
                case 4 -> reverse();
                default -> System.out.println("Input was not a valid input.");
            }
        conditon = again();
        }
        while (conditon);
    }

    public int printMenu() {
        System.out.print("""
                Choose an option to perform:
                1) Add numbers
                2) Multiply numbers
                3) Print numbers
                4) Print number in reverse
                """);
        return in.nextInt();
    }

    public void add() {
        System.out.println("Printing sum of array:");
        int sum = 0;
        for(int i: array) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void mult() {
        System.out.println("Printing product of array:");
        int product = 1;
        for(int i: array) {
            product *= i;
        }
        System.out.println(product);
    }

    public void print() {
        System.out.println("Printing array:");
        for(int i: array) {
            System.out.println(i);
        }
    }

    public void reverse() {
        System.out.println("Printing reversed array:");
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public boolean again() {
        System.out.print("""
                Choose an option to perform:
                1) Choose another option
                2) Exit
                """);
        return in.nextInt() != 2;
    }
}

