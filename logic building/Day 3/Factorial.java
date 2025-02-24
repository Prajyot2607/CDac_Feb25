//Write a program to compute the factorial of the number 10. 

public class Factorial { 

 public static void main(String[] args) { 
        int num  = 10;
	long fact =1; 
        for (int i = 1; i <=num; i++) { 
           fact *=i; 
        } 
        System.out.println(num); 
	System.out.println(fact); 
    } 
}