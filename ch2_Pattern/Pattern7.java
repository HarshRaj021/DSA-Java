package ch2_Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
      
        for(int r = 1; r<=n;r++){
            
           
            for(int c = 1; c<= r-1;c++){
                System.out.print(" ");
            }
            for(int c= 1; c<=2*n-2*r+1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
