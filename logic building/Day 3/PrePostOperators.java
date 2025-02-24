// Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//operators in a single expression
public class PrePostOperators {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = ++a + b-- ; // Pre-increment a, Post-decrement b

        System.out.println("Result: " + result);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
