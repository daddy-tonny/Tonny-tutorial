import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number:");
    int number =scanner.nextInt();
    
    
     if (number % 5 == 0 && number % 3 == 0 )
    System.out.println("FIZZBUZZ");
    else if (number%5 == 0)
     System.out.println("FIZZ");
     else if (number%3 ==0)
     System.out.println("BUZZ");

     else 
     System.out.println(number);
     //ADJUSETMENT: since there is repeatition in our code we could do the following use a nested for loop ie
     if (number%5==0){
        if (number % 3==0)
        System.out.println("FIzzBuzz");
        else
        System.out.println("FIZZ");
        
     }

   }
}
