package w3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.lang.reflect.Array;
import java.util.Arrays;

public class perimeter {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int number = (int) in.nval;
        int [] arr= new int[number];
        int [] secondArr= new int[number];
        for (int i=0 ; i<number;  i++){
            in.nextToken();
            int token  = (int ) in.nval;
            arr[i]= token;
        }
        int max=0;
        Arrays.sort(arr);
        for(int i=0 ; i+2<number; i++){
            int start= arr[i];
            int medium=arr[i+1];
            int end = arr[i+2];
            if((start+medium)>end){
                max=start+medium+end;
            }
        }
        System.out.println(max);
    }
}
