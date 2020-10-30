package w1.typicalTasks;

import java.util.Scanner;

public class quadraticFunction {

    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x= scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a *(x*x)+b*x + c);
    }
}
