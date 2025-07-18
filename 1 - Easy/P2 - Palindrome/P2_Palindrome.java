import java.util.*;

public class P2_Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int orig = x;
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return orig == rev;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println("Is Palindrome ? : " + isPalindrome(num));
    }
}