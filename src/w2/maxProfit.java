package w2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class maxProfit {
    public static void main(String [] args) throws IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int input = (int) in.nval;
        int result=0;
        boolean flag=false;
        in.nextToken();
        int some=(int) in.nval;
        int end=some;
        int start=some;
        for (int i=1 ; i<input; i++){
            in.nextToken();
            some=(int) in.nval;
            if(end<=some){
                end=some;
                flag=false;
            }
            else{
                result+=end-start;
                start=some;
                end=some;
                flag=true;
            }
        }
        if(flag==false){
            System.out.println(result+(end-start));
        }
        else System.out.println(result);

    }
}
