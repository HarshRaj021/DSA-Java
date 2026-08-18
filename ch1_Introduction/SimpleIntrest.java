package ch1_Introduction;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER PRINCIPAL =  ");
        int p = sc.nextInt();
        System.out.print("ENTER RATE =  ");
        int r = sc.nextInt();
        System.out.print("ENTER TIME =  ");
        int t = sc.nextInt();

        int intrest = p*r*t/100;
        System.out.println(intrest);
        sc.close();
    
}
}