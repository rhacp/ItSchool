package session05_advanced_flow_control.practice;

public class ForExercises {

    public static void main(String[] args) {
        printEvenNumbers(20);
        System.out.println("");
        System.out.println("");
        printFactorialOfNumber(3);
        System.out.println("");

        String[] myArray = {"Apple", "Cherry", "Plum"};
        printArray(myArray);
        System.out.println("");
        System.out.println("");

        int[] myArrayNumber = {1, 5, 67, 8};
        printArrayMaxValue(myArrayNumber);
        System.out.println(" ");

        printSearchedValue(myArrayNumber, 67);

        System.out.println("");
        int[][] array2D = {{1, 2, 3}, {6, 9, 43}, {8, 1, 10}, {6, 8, 9}};
        print2DArray(array2D);

        System.out.println("");
        System.out.println("Second value from first nested array: " + array2D[0][1]);
    }

    public static void printEvenNumbers(int number) {
        for (int index = 0; index <= number; index += 2) {
            System.out.print(index + " ");
        }
    }

    public static void printFactorialOfNumber(int number) {
        int factorial = 1;
        if (number < 0) {
            System.out.println("Please enter positive number.");
            return;
        }
//        } else if (number == 0) {
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    public static void printArrayMaxValue(int[] array) {
        int maxValue = 0;
        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("The max value is: " + maxValue);
    }

    public static void printSearchedValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                System.out.println("Number found: " + value);
                break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
                System.out.print(array[rowIndex][columnIndex] + " ");
            }
            System.out.println("");
        }
    }
}

