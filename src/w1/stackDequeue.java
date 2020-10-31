package w1;
import java.util.Scanner;

public class stackDequeue {
    public static void main(String[] argh) {

        MyQueue queue = new MyQueue();
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        for (int i=0; i<in; i++){
            String some = scanner.next();
            switch (some){
                case("put"):
                    int a1= scanner.nextInt();
                    queue.enqueue(a1);
                    break;
                case("get"):
                    if(queue.isEmpty()){
                        System.out.println("error");
                    }
                    else System.out.println(queue.dequeue());
                    break;
                case("get_size"):
                    System.out.println(queue.size());
                    break;

            }
        }


    }


    static class Stacky {
        int top=-1;
        private long[] arr = new long[5002];


        //добавление
        public void push (long s){
            arr[++top]=s;

        }
        //извлечение элемента с вершины
        public long pop(){

            return arr[top--];
        }
        //проверка на пустоту
        public boolean isEmpty(){
            return (top==-1);
        }
    }
    static class MyQueue {

        private Stacky inputStack;      // for enqueue
        private Stacky outputStack;     // for dequeue
        private int size;

        public  MyQueue() {
            inputStack = new Stacky();
            outputStack = new Stacky();
        }

        public void enqueue(int e) {
            inputStack.push(e);
            size++;
        }

        public long dequeue() {
            // fill out all the Input if output stack is empty
            if(outputStack.isEmpty())
                while(!inputStack.isEmpty()){
                    outputStack.push(inputStack.pop());
                }

            long temp=0;
            if(!outputStack.isEmpty()) {
                temp = outputStack.pop();
                size--;
            }

            return temp;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

    }
}
