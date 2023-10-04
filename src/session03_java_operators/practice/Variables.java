package session03_java_operators.practice;

public class Variables {

    public static void main(String[] args) {
        int age; //declaration
        age = 27; //initialization

        int  myAge = 29;
        System.out.println("I'm John, and I'm " + age + " years old.");
    }

    public static void practiceVariablesScope(){
        int outerVar = 24;

        if (outerVar > 10) {
            int innerVal = 200;
            System.out.println(innerVal + outerVar);
        }
        //System.out.println(innerVal); this leads to a compiler error due to the variable scope being just the if;
    }
}
