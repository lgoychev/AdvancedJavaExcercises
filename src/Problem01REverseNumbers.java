import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lgoychev on 5/29/16.
 */
public class Problem01REverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String[] line = sc.nextLine().split(" ");

        for (int i = 0; i < line.length; i++) {
            int input = sc.nextInt();
            stack.push(input);
            System.out.println(input);
        }

        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }
    }
}
