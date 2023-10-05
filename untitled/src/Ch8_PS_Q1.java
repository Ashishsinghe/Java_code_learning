class Employees{
    private int  salary;
    private String name;

    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public void setNmae( String name ){
        this.name = name;
    }

}

class CellPhone{
    public static void ring(){
        System.out.println("Ringing . . .");
    }

    public static void Vibrate(){
        System.out.println("Vibrating . . .");
    }
}

class Square{
    private int side;

    public Square(int a ){
        this.side=a;
        area();
        Perimeter();
    }

    public void area(){
        System.out.println("Area . . ." + this.side*this.side);
    }
    public void Perimeter(){
        System.out.println("Perimeter . . ." + 4*this.side);
    }



    public void Vibrate(){
        System.out.println("Vibrating . . .");
    }
}
public class Ch8_PS_Q1 {
    public static void main(String[] args) {
        CellPhone.ring();
        CellPhone.Vibrate();

        Square s= new Square(2);

    }
}

class Tommy{
    public static void Hit(){
        System.out.println("hitting . . .");
    }

    public static void Running(){
        System.out.println("Running . . .");
    }
}
