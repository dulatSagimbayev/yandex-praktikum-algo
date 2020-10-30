package w1.typicalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class stringСomparison {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();
        char [] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        boolean flag= true;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        char[] n = arr1.length<arr2.length ? arr1 :arr2;
        for(int i =0; i<n.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println(arr1.length>arr2.length? arr1[i] :arr2[i] );
                flag= false;
                break;
            }
        }
        if(flag) System.out.println(arr1.length>arr2.length? arr1 [arr1.length-1]: arr2[arr2.length-1]);


    }
}
