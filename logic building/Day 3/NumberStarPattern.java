public class NumberStarPattern {
    public static void main(String[] args) {
       


 // Upper part
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
 }
        
        // Lower part
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2  
1 
*/