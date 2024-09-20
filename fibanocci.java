import java.util.Scanner;
public class fibanocci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 1;i <= n; i++){
            System.out.println("Fibonacci series = " + first);
            int next = first + second;
            first = second;
            second = next;
        }
        scan.close();
    }
}
