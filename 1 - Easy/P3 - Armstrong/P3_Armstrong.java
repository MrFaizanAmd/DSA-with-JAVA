import java.util.*;

public class P3_Armstrong {
    public static boolean isArmstrong(int n) {
        int temp = n, digits = 0, sum = 0;

        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = n;

        while (temp != 0) {
            sum = (int) (sum + Math.pow(temp % 10, digits));
            temp /= 10;
        }

        return n == sum;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println("text : " + isArmstrong(num));
    }
}
