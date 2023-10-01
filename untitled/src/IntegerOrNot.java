import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       if (sc.hasNextInt()){
            System.out.println("is Int");
        }
        else
            System.out.println("other");

        System.out.println("plese enter km---> miles");
        System.out.println(" ");

        double km = sc.nextDouble();
        double miles =km * 0.621371;
        System.out.println("miles  -->" + miles );
    }

}
