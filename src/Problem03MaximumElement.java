import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lgoychev on 5/29/16.
 */
public class Problem03MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandCount = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < commandCount; i++) {
            int command = sc.nextInt();
            if (command == 1){
                int numToPush = sc.nextInt();
                stack.push(numToPush);
                if (max <= numToPush) {
                    max = numToPush;
                    maxStack.push(max);
                }
            } else if (command == 2) {
                int poppedItem = stack.pop();
                if (poppedItem == max) {
                    maxStack.pop();
                    if (maxStack.size() > 0) {
                        max = maxStack.peek();
                    } else {
                        max = Integer.MIN_VALUE;
                    }
                }
            } else {
                System.out.println(max);
            }

        }
    }
}
