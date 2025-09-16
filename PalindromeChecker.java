import java.util.Scanner;
public class PalindromeChecker {
    Scanner sc = new Scanner(System.in);
    String text;
    void get() {
        System.out.println("Enter text");
        text = sc.next();
    }
    void check() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != rev.charAt(i)) {
                isPalindrome = false;
                break; 
            }
        }
        if (isPalindrome) {
            System.out.println("no is palindrome");
        } else {
            System.out.println("no is not palindrome");
        }
    }
    public static void main(String args[]) {
        PalindromeChecker obj = new PalindromeChecker();
        obj.get();
        obj.check();
    }
}
