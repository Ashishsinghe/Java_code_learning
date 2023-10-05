
class Circle{
    private double radius;
    private double perimeter;
    private double area;

    double pi =3.14;

    public double getradius(){
        return radius;
    }
    public double getperimeter(){
        return perimeter;
    }
    public double getarea(){
        return area;
    }
    public void  setradius(double r){
         radius=r;
    }

    public void setperimeter(double p){
        perimeter=2*pi*radius;
        if(p!=perimeter){
            System.out.println("Wrong Circle Perimeter ");
        }
        perimeter=p;
    }

    public void setarea(double a){
        area= pi*radius*radius;
        if(a!=area){
            System.out.println("Wrong Circle area ");
        }
        area=a;
    }



}

public class Ch_9_AccessModifiers_circle {
    public static void main(String[] args) {

        Circle cir =new Circle();
        cir.setradius(2);
        cir.setperimeter(20);
        cir.setarea(cir.getradius()*cir.getradius()*cir.pi);

        System.out.println("Circle radius  " + cir.getradius());
        System.out.println("Circle perimeter " + cir.getperimeter());
        System.out.println("Circle area " + cir.getarea());

    }


}
