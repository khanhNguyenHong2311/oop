import java.util.Scanner;
public class maxRun {
    public static int maxRun(String str) {  
        int n = str.length();  
        int l = 0;
        int r = 0;
        int max_val = 1;
        while (r < n) {
            while (r < n && str.charAt(l) == str.charAt(r)) {
                r++;
            }
            max_val = Math.max(max_val, r - l);
            l = r;
        }   
        return max_val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.print(maxRun(s));
        }
    }
}
