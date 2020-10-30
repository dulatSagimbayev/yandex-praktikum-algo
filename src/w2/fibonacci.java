package w2;
import java.io.*;

public class fibonacci {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        in.nextToken();
        int input = (int) in.nval;
        System.out.println(fib(input));

    }
    public static int fib(int m){
        if(m==0){
            return 1;
        }
        else if(m==1)return 1;
        else {
            return fib(m-1)+fib(m-2);
        }
    }
}
