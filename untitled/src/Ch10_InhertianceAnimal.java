class Animal{

    Animal() {
        // No constructor body
    }
    Animal(String s){
        System.out.println("I am animel overloaded const ...." +s );
    }
    static void walk(){
            System.out.println("I am Walking ....");
    }
    public void Speak(){
        System.out.println("I am not yet alive ....");
    }

}

class Dog extends Animal{
    String live ="Living";
    Dog(){
        System.out.println("I am DOG ....");
    }

    Dog(String s,String k){
        super(s);
        System.out.println("I am DOG Constructor with ..." + k + "i ma alive    "+this.live);
    }
    @Override //anotation is imp to avoid mistakes
    public void Speak(){
        System.out.println("I am Bhow Bhow ....");
    }
}

class Sheru extends Dog{

    Sheru(){
        System.out.println("I am Sheru constructor ....");
    }

    Sheru(String s,String k,String c){
        super(s,k);
        System.out.println("I am DOG Constructor with ..." +c);
    }
    @Override
    public void Speak(){
        System.out.println("I am Sheru Sheru ....");
    }
}



public class Ch10_InhertianceAnimal {
    public static void main(String[] args) {
       // Animal A = new Animal("fetch");
      //  Dog Rikky = new Dog(); //firt base class const run. . .
      //  Rikky.Speak();
     //   Rikky.walk();
      Dog beauty = new Dog("Home","Come");

        // hericary of call is very imp ->
       // Sheru s =new Sheru();
        Sheru s2 =new Sheru("Run","eat","sleep");

        beauty.Speak();  //diff defination of same method in parent and clid class
                        // if i remove the static i neeed to use the obj to call .

        s2.Speak();

    }
}
