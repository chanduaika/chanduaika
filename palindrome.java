public class palindrome {
    public static void main(String[] args) {
        String str = "sakldjfh";
        String pal = new StringBuilder(str).reverse().toString();
        if (str.equals(pal)) {
            System.out.println("It's a palindrome.");
        } else{
            System.out.println("Not");
        }
    }
}
