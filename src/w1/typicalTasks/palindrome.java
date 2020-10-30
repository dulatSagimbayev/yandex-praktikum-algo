package w1.typicalTasks;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]+", "");
        input = input.toLowerCase();
        String flag ="True";
        int i = 0;
        int j = input.length()-1;
        while (i<j){
            if(input.charAt(i)!=input.charAt(j)){

                flag="False";
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
}
