package w2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class abc {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        in.nextToken();
        String input = (String) in.sval;
        System.out.println(abc(input,0));

    }
    public static String abc(String s,int a){
        String [] arr={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        if(s.equals(arr[a])){
            return ""+s;
        }
        else{
            return arr[a]+" "+abc(s,a+1);
        }
    }
}
