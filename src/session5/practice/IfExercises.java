package session5.practice;

public class IfExercises {

    public static void main(String[] args) {
        int numberValue = 53;
        int numberToCompareValue = 10;
        int lowerNumberToCompareValue = 0;
        int biggerNumberToCompareValue = 50;
        printNumberComparisonInfo(numberValue, numberToCompareValue);
        System.out.println("");
        printMultipleNumberComparison(numberValue, lowerNumberToCompareValue, biggerNumberToCompareValue);
    }

    private static void printNumberComparisonInfo(int number, int numberToCompare) {
        if (number > numberToCompare) {
            System.out.println("The number is greater than " + numberToCompare);
        } else if (number == numberToCompare) {
            System.out.println("The number is equal with " + numberToCompare);
        } else {
            System.out.println("The number is smaller than " + numberToCompare);
        }
    }

    private static void printMultipleNumberComparison(int number, int lowerNumberToCompare, int biggerNumberToCompare) {
        if (number >= lowerNumberToCompare && number <= biggerNumberToCompare){
            System.out.println("The number is between " + lowerNumberToCompare + " & " + biggerNumberToCompare + ".");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The number is between 51 and 100.");
        }
    }
}
