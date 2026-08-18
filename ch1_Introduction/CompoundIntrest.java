package ch1_Introduction;
import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER PRINCIPAL =  ");
        int p = sc.nextInt();
        System.out.print("ENTER RATE =  ");
        int r = sc.nextInt();
        System.out.print("ENTER TIME =  ");
        int t = sc.nextInt();

        double a = p* Math.pow((1 + r / 100.0),t);
        double intrest = a - p;
        System.out.println(intrest);
        sc.close();
    
}
}
    

