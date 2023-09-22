package session6.practice;

public class StringMethodPractice {

    public static void main(String[] args) {
        String name = "John Doe";
        printStringLength("Test");
        printStringCharAt("Alice", 1);
                               //012345

        printStringindexAt("Alice", "i");
        printSubstring("Hello World", 6, 11);
        System.out.println(name.substring(5));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name + " contains Doe: " + name.contains("Doe"));

        System.out.println("Replaced 'e' from Hello: " + "Hello".replace("e", "a"));

        String  email = "user@google.com";
        String domain = email.substring(email.indexOf('@') + 1);
    }

    private static void printStringLength(String input) {
        System.out.println("String  input length: " + input.length());
    }

    private   static  void   printStringCharAt(String  input,  int index) {
        System.out.println("The character at index " + index + " is: " + input.charAt(index));
    }

    private static void printStringindexAt(String input, String target) {
        System.out.println("The  index  of target is: " + input.indexOf(target));
    }

    private static void  printSubstring(String input,  int  startIndex,int endIndex) {
        System.out.println("The substring is: " + input.substring(startIndex, endIndex));
    }
}
