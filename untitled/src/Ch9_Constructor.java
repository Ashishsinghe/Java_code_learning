class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Ch9_Constructor {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee Ashe = new MyMainEmployee();
        MyMainEmployee No = new MyMainEmployee();
        Ashe.setName("CodeWithAshe");
        Ashe.setId(20);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(Ashe.getId());
        System.out.println(Ashe.getName());
        System.out.println(No.getId());
        System.out.println(No.getName());
    }
}