import java.util.Scanner;
public class blowUp {
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = str.charAt(i) - '0';
                while (count !=0) {
                    result.append(str.charAt(i + 1));
                    count--;
                } 
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (Character.isDigit(s.charAt(s.length()-1))) {
            s = s.substring(0, s.length() - 1); 
        }
        System.out.print(blowup(s));
    }
}
