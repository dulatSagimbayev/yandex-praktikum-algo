package w1.typicalTasks;

import java.util.HashSet;
import java.util.Scanner;

public class noRepetitions {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<num;i++){
            int n = scanner.nextInt();
            boolean a =set.add(n);
            if(a==false){
                set.remove(n);
            }

        }
        for(Integer some : set){
            System.out.println(some);
        }

    }
}
