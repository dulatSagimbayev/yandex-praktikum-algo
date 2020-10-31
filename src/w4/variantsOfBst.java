package w4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;


public class variantsOfBst {
    public static void main (String [] args) throws IOException {
        StreamTokenizer input=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        input.nextToken();
        int s =(int) input.nval;
        System.out.println(numberOfTrees(s));
    }

    public static BigInteger factorial(int n){
        if (n == 0) return BigInteger.valueOf(1);
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }

    static BigInteger numberOfTrees(int s){
        return factorial(2*s).divide(factorial(s+1).multiply(factorial(s)));
    }
}
