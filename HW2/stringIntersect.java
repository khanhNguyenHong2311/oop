import java.util.Scanner;
import java.util.HashSet;

public class stringIntersect {
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> se = new HashSet();
        for (int i = 0; i <= a.length() - len; i++) {
            se.add(a.substring(i, i + len));   
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if (se.contains(b.substring(i, i+ len))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int len = sc.nextInt();
        System.out.print(stringIntersect(a, b, len));
    }
}
