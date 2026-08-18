package ch1_Introduction;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER 1ST NUMBER =  ");
        int num1 = sc.nextInt();
        System.out.print("ENTER 2nd NUMBER =  ");
        int num2 = sc.nextInt();

        int product = num1 * num2;
        System.out.println(product);
        sc.close();
    }
}
