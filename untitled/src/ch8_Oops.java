
 class Employee{
    int id, salary;
    String name;

    void getdetails(){
        System.out.println("  ID " + id);
        System.out.println("  salary " + salary);
        System.out.println("  name " + name);
    }

    int getsalary(){
        return salary;
    }

     public void id(int i) {
     }
 }
public class ch8_Oops {
    public static void main(String[] args) {
        System.out.println("HI OOPS");

        Employee ravi = new Employee();
        Employee Ashe = new Employee();

        ravi.id(1);
        ravi.salary=30;
        ravi.name ="R";

        Ashe.id =2;
        Ashe.salary=25;
        Ashe.name ="A";

        ravi.getdetails();
        Ashe.getdetails();
        System.out.println(Ashe.getsalary());

    }
}
