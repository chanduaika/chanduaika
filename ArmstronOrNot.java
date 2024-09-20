import java.util.Scanner;
public class ArmstronOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp != 0) {
            int digit = temp%10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("It's an armstrong number");
        } else{
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
}