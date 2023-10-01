import java.util.Scanner;

public class Harry_percentage_exc1_1 {
    public static void main(String[] args) {
        int math;
        int english;
        int science;
        int Hindi;
        int sst;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter markes of subjects");
        System.out.println("Enter markes of math");
        math = sc.nextInt();

        System.out.println("Enter markes of English");
        english = sc.nextInt();

        System.out.println("Enter markes of science");
        science = sc.nextInt();

        System.out.println("Enter markes of Hindi");
        Hindi = sc.nextInt();

        System.out.println("Enter markes of sst");
        sst = sc.nextInt();
        int total =(math+ english+science+ Hindi+sst);
        System.out.println(total);
        int percentage = (total/5);

        System.out.println(percentage);
    }
}
