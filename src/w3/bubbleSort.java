package w3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class bubbleSort {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int number= (int)in.nval;
        int [] arr = new int[number];
        for(int i=0 ; i<number; i++){
            in.nextToken();
            int token = (int) in.nval;
            arr[i] = token;
        }
        for(int i=number-1; i>=1; i--){
            for(int j =0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }
        }
        for(int i=0 ; i<number; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
