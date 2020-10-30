package w2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class factorial {
    public static void main (String [] args) throws IOException, IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        in.nextToken();
        int input = (int) in.nval;
        System.out.println(facrotial(input));
    }
    public static int facrotial(int in){
        if(in==0){
            return 1;
        }
        else return facrotial(in-1)*in;
    }
}
