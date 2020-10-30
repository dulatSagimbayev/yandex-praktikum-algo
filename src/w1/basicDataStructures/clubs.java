package w1.basicDataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class clubs {
    public static void  main (String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        HashSet<String> set = new HashSet<>();
        for(int i =0; i<num;i++){
            String input = scanner.nextLine();
            if(set.add(input)==true){
                System.out.println(input);
            }
        }
    }
}

