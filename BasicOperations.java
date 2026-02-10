import java.util.*;

public class BasicOperations {
    public static void main(String[] args) {

        // Variables
        int a = 10;
        int b = 5;

        int sum = a + b;
        int diff = b - a;
        int mul = a * b;

        if (a - b != 0) {
            int ans = (a * b) / (a - b);
            System.out.println(ans);
        } else {
            System.out.println("Division not possible");
        }

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
