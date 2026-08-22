public class Static {
    static void printWelcome() {
        System.out.println("welcome");
    }
    static int calculateTotal(int solved , int bonus) {
        return solved + bonus;
    }
    static boolean isEligibileForBadge(int streakdays) {
        return streakdays>= 30;
    }
    public static void main(String[] args) {
        printWelcome();
        int finalscore = calculateTotal(120 , 15);
        System.out.println(finalscore);

        boolean eligible = isEligibileForBadge(35);
        System.out.println(eligible);
    }
}
