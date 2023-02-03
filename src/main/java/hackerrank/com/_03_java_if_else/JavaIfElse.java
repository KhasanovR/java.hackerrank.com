package hackerrank.com._03_java_if_else;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 0 && ((2 <= N && N <= 5) || N > 20)) {
            System.out.print("Not ");
        }
        System.out.println("Weird");
        scanner.close();
    }
}
