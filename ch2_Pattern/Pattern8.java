package ch2_Pattern;

public class Pattern8 {

    public static void main(String[] args) {

        int n = 4;

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= 6; c++) {

                if (r == 1 || r == n || c == 1 || c == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}