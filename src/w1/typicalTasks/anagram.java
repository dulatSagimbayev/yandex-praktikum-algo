package w1.typicalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char [] arr = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        String answer = String.valueOf(arr).equals(String.valueOf(arr2)) ? "True":"False";
        System.out.println(answer);
    }
}
