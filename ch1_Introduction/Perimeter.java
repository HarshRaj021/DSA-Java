package ch1_Introduction;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER 1ST length =  ");
        int num1 = sc.nextInt();
        System.out.print("ENTER 2nd length =  ");
        int num2 = sc.nextInt();
        System.out.print("ENTER 3rd length =  ");
        int num3 = sc.nextInt();

        int perimeter = num1 + num2 +num3;
        System.out.println(perimeter);
        sc.close();
    
}
}
