import java.util.Scanner;

public class LogicalO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num > 0 && num % 2 == 0) {
            System.out.println("Positive and Even");
        } else {
            System.out.println("Not Positive and Even");
        }
       
    }
}