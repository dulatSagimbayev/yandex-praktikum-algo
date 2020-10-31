package w1;

import java.util.Stack;
import java.util.Scanner;


public class calc {
    public static void main(String [] args) {
        Stack <Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String [] arr =in.split(" ");
        for (int i=0; i<arr.length; i++){
            String some= arr[i];
            if(some.equals("+" )|| some.equals("*") || some.equals("/") || some.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                if(some.equals("+")){
                    stack.push(b+a);
                }
                else if(some.equals("-")){
                    stack.push(b-a);
                }
                else if (some.equals("*")){
                    stack.push(a*b);
                }
                else if(some.equals("/")){
                    stack.push(b/a);
                }
            }
            else {

                stack.push(Integer.parseInt(some));

            }

        }
        System.out.println(stack.pop());

    }
}
