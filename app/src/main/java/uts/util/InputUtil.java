package quiz2.util;

import java.util.Scanner;
 
public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);
 
    public static int readIInt() {
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
    
    public static double readIDouble() {
        double n = scanner.nextDouble();
        scanner.nextLine();
        return n;
    }

    public static String readLine() {
        return scanner.nextLine();
    }
}
 