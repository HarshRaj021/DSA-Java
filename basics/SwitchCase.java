    package basics;

    import java.util.Scanner;


    public class SwitchCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your fruit type : ");
            String Fruit = sc.next();

            switch(Fruit) {
                case "Mango" :
                    System.out.println("king of fruits");
                    break;
                case "Apple" :
                    System.out.println("Doctor killer");
                    break;
                case "Grapes" :
                    System.out.println("round fruit");
                    break;
                default :
                    System.out.println("invalid fruit");
                sc.close();
                }
            }
        }
        

