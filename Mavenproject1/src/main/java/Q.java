
import java.util.Scanner;

public class Q {

    static void q(int n) {

        if (n < 0) {
            System.out.println("Negative input");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Number: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Negative input");
        } else {
            System.out.println("The number is " + n);
        }
    }
}
