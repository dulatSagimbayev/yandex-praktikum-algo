package w2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subsequence {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sub = reader.readLine();
        String text = reader.readLine();
        int j = 0;
        for (int i = 0; i < text.length() && j < sub.length(); i++)
            if (text.charAt(i) == sub.charAt(j))
                j++;
        System.out.println (j == sub.length()? "True" :"False");
    }
}
