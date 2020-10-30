package w1.typicalTasks;

import java.util.Scanner;

public class degreeOfFour {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int max=4;
        boolean flag=false;

        if (input==1 || input==4){
            flag=true;
        }
        else {
            while(max<=input){
                max=4*max;
                if(max==input){
                    flag=true;
                    break;
                }
            }

        }
        if(flag){
            System.out.println("True");

        }
        else System.out.println("False");
    }
}
