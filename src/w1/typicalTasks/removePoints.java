package w1.typicalTasks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.IOException;

public class removePoints {
    public static void main (String [] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int input = (int) in.nval;
        for(int i =0; i<input;i++){
            in.nextToken();
            int some = (int) in.nval;
            if(some!=0) System.out.print(some+" ");
        }
    }
}
