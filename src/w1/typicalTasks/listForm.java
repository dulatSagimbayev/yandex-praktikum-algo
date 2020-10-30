package w1.typicalTasks;

import java.util.Scanner;

public class listForm {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String number="";
        for (int i=0; i<size; i++){
            String T = scanner.next();
            number=number+T;
        }
        int answer = Integer.parseInt(number);
        size = scanner.nextInt();
        answer= answer+size;
        String vivod = Integer.toString(answer);
        for(int i=0; i<vivod.length();i++){
            System.out.print(vivod.charAt(i)+" ");
        }


    }

}
