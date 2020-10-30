package w1.typicalTasks;

import java.util.Scanner;

public class numberOfTrueBits {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[15];
        int sum=0;
        int index = 0;
        while (number > 0) {
            arr[index++] = number % 2;
            number = number / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            if(arr[i]==1){
                sum=sum+1;
            }
        }
        System.out.println(sum);

    }
}
