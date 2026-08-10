package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /) or x to exit: ");
            char op = sc.next().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Calculator closed.");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                }

                System.out.println("Result: " + ans);

            } else {
                System.out.println("Invalid operator!");
            }
        }

        sc.close();
    }
}