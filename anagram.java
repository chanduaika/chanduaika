import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "listen" , str2 = "silent";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        System.out.println(Arrays.equals(char1, char2));
    }
}
