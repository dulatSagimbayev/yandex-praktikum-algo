package w2;

import java.io.*;

public class lastDigitOfFibonacciNumber {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        in.nextToken();
        int input = (int) in.nval;
        System.out.println(fib(input));

    }
    public static int fib(int m){
        if(m<2) return 1;
        else{
            int a=1;
            int b=1;
            int c;
            for(int i=1; i<m;i++){
                c=(a+b)%10;
                a=b;
                b=c;
            }
            return b;
        }
    }
}
