

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur no: ");
        int roll_no = input.nextInt();
        System.out.println("Roll no is : " + roll_no);
        input.close();
    
    int count = 1;
    while(count != 11) {
        System.out.println(count);
        count++;
    }
}
}
