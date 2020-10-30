package w1.typicalTasks;

import java.util.HashSet;
import java.util.Scanner;

public class repetitions {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<number; i++){
            int some= scanner.nextInt();

            if(!set.add(some)){
                System.out.println(some);
                break;
            }
        }
    }
}
