import java.util.*;

public class P5_Factorial_by_Recursion {
    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial not possible.");
            return 0;
        } else if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int num = scan.nextInt();
        scan.close();

        System.out.println("Factorial is " + factorial(num));
    }
}
