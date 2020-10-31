package w3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


public class wardrobe {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int number = (int) in.nval;
        int [] arr= new int[number];
        for (int i=0 ; i<number;  i++){
            in.nextToken();
            int token  = (int ) in.nval;
            arr[i]= token;
        }

        quickSort(arr, 0, number-1);
        for(int s :arr){
            System.out.print(s+" ");
        }
    }
}
