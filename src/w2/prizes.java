package w2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class prizes {
    public static void main(String [] args) throws IOException {
        StreamTokenizer in;
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int persons = (int) in.nval;
        int sum=0;
        ArrayList<Integer> arr = new ArrayList<>();
        in.nextToken();
        int numberOfCoins = (int) in.nval;
        for(int i=0; i<numberOfCoins; i++){
            in.nextToken();
            int coin =(int) in.nval;
            arr.add(coin);
            sum+=coin;
        }
        int some = sum/persons;
        for(int i =0 ; i<arr.size(); i++){
            if(arr.get(i)>some){
                System.out.println("False");
                return;
            }
            else if(arr.get(i)==some){
                arr.remove(i);
                sum=sum-arr.get(i);
                persons=persons-1;
            }
        }
        int [] array = new int[persons];
        if(sum%persons!=0){
            System.out.println("False");
            return;
        }
        else{
            Collections.sort(arr);
            for(int i=arr.size()-1; i>=0; i--){
                int coin = arr.get(i);
                boolean flag= false;
                for(int j=0; j<persons;j++){
                    if(array[j]+coin<=(sum/persons)){
                        array[j]=array[j]+coin;
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    System.out.println("False");
                    return;
                }

            }
        }
        System.out.println("True");
        return;
    }
}
