//5. Write a program to print the Fibonacci sequence up to the number 21.

public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1, next;
        
        System.out.print(a + " " + b + " ");
        
        next = a + b;
        while (next <= 21) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
    }
}
