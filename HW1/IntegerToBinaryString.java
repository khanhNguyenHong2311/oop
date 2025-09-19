import java.util.Scanner;
/**
 * Exercise 1.2.22 : Convert integer n to binary string
 * @param n n is positive integer
 * @return binary string
 */
public class IntegerToBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        while(n != 0) {
            res = (n % 2) + res;
            n /= 2;
        }
        System.out.print(res);
    }
}