public class reversestring {

    public static void main(String[] agrs){
        String str = "chandu";
        System.out.println(str);
        StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println(rev);
    }
}