import java.util.Scanner;
public class primeNumber {  
   public static void main(String[] args) {  
       Scanner scan = new Scanner(System.in);  
       System.out.println("Enter a number : ");  
       int num = scan.nextInt();  
       if (checkPrime(num)) {  
           System.out.println(num + " is a prime number");  
       }
       else {  
           System.out.println(num + " is not a prime number");  
       }
       scan.close();  
   }  
   public static boolean checkPrime(int num) {  
       if (num <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(num); i++) {  
           if (num % i == 0) {  
               return false;  
           }  
       }  
       return true;
    }
}