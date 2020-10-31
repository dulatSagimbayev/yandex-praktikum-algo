package w3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


public class quickSort {
    public static void main (String []args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();

        int number = (int) in.nval;
        int [] arr= new int[number];

        for(int i=0  ; i <number; i++){
            in.nextToken();
            int token = (int) in.nval;
            arr[i]= token;
        }
        insertionSortImperative(arr);

    }
    public static void insertionSortImperative(int[]input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j]> key) {
                input[j + 1]= input[j];
                j = j - 1;
            }
            input[j + 1]= key;
        }
        for (int i=0 ; i<input.length; i++){
            System.out.print(input[i]+" ");
        }
    }
}
