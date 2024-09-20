import java.util.Scanner;
public class reversed {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed*10 + num%10;
            num /= 10;
        }
        System.out.println(reversed);
        scan.close();
    }
}
