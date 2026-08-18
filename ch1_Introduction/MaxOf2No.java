package ch1_Introduction;

import java.util.Scanner;

public class MaxOf2No {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("ENTER 1st no =  ");
        int num1 = sc.nextInt();
        System.out.print("ENTER 2nd no =  ");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.println("num1 is greater");
        } else {
            System.out.println("num 2 is greater");
            sc.close();
        }
    }
    
}
