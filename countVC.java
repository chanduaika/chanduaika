import java.util.Scanner;
public class countVC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int vowelCount = 0, consonantCount = 0, spaceCount = 0;
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'o' ||ch == 'U' ) {
                vowelCount++;
            }
            else if(ch == ' '){
                spaceCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("vowels: " + vowelCount);
        System.out.println("consonants: " + consonantCount);
        System.out.println("Space Count: " + spaceCount);
        int totalLetters = vowelCount + consonantCount;
        System.out.println("Total letters in this word: " + totalLetters);
        scan.close();
    }
}