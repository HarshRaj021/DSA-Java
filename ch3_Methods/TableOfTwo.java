public class TableOfTwo{
   static  void print2KaTable () {
        for (int i = 1; i<= 10; i++) {
            int ans = 2*i;
            System.out.println("ans is --->" + ans);
        }
    }
    static void print2KaSum(int x, int y){
        System.out.println("sum -->"+ (x+y));

    }
    static void main() {
        System.out.println("HI");
      print2KaTable();
      print2KaSum(52, 041);
      System.out.println("BYE");
    }
}
