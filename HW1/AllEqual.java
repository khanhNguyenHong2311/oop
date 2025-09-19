import java.util.Scanner;
/**
 * Exercise 1.2.1 : prints equal if all three are equal, and not equal otherwise.
 * @param a first number
 * @param b second number
 * @param c third number
 * @return true or false
 */
public class AllEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.print("equal");
        }
        else {
            System.out.print("not equal");
        }
    }
}