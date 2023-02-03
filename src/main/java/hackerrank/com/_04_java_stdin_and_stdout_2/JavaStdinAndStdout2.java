package hackerrank.com._04_java_stdin_and_stdout_2;

import java.util.Scanner;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}