package w3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class evenSort {
    public  static void main (String [] args) throws IOException {
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
        for (int i=0 ; i<number;  i++){
            int token  = Integer.MIN_VALUE;
            secondArr[i]= token;
        }

        for(int i=0; i<number; i++){
            for(int j=0;j<number; j++){
                if(j%2==0 && arr[i]%2==0 && secondArr[j]==Integer.MIN_VALUE){
                    secondArr[j]=arr[i];
                    break;

                }
                else if(j%2!=0 && arr[i]%2!=0 && secondArr[j]==Integer.MIN_VALUE){
                    secondArr[j]=arr[i];
                    break;

                }
            }
        }
        for(int i=0; i<number; i++){
            System.out.print(secondArr[i]+" ");
        }
    }
}
