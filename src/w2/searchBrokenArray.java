package w2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class searchBrokenArray {
    public static int search(int a[], int left, int right, int k) {
        int mid = (left + right) / 2;
        if (k == a[mid]) { // Элемент найден
            return mid;
        }
        if (right < left) {
            return -1;
        }

        /* Либо левая, либо правая половина должна быть нормально упорядочена .
         * Найти нормально упорядоченную сторону, а затем использовать ее
         * для определения стороны, в которой следует искать х. */
        if (a[left] < a[mid]) { // Левая половина нормально упорядочена .
            if (k >= a[left] && k < a[mid]) {
                return search(a, left, mid - 1, k);// Искать слева
            } else {
                return search(a, mid + 1, right, k);// Искать справа
            }
        } else if (a[mid] < a[left]) { // Правая половина нормально упорядочена.
            if (k > a[mid] && k <= a[right]) {
                return search(a, mid + 1, right, k); // Искать справа
            } else {
                return search(a, left, mid - 1, k); // Искать слева
            }
        } else if (a[left] == a[mid]) { // Левая половина состоит из повторов
            if (a[mid] != a[right]) { // Если правая половина отличается, искать в ней
                return search(a, mid + 1, right, k);// Искать справа
            } else { // Иначе искать придется в обеих половинах
                int result = search(a, left, mid - 1, k); // Искать слева
                if (result == -1) {
                    return search(a, mid + 1, right, k); // Искать справа
                } else {
                    return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int howMany=(int) in.nval;
        int [] arr = new int[howMany];
        in.nextToken();
        int tokenValue =(int) in.nval;
        for (int i=0; i<howMany; i++){
            in.nextToken();
            int token= (int) in.nval;
            arr[i]=token;
        }

        System.out.println((search(arr,0, arr.length-1, tokenValue)));
    }
}
