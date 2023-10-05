
class Phone{
    static void showTime(){
        System.out.println("Showing Time . . .Good ");
    }
    static void turnOn(){
        System.out.println("Turning On I am Phone  . . . ");
    }
}
class SmartPhone extends Phone{
    static void playMusic(){
        System.out.println("Playing songs  . . . ");
    }
    static void turnOn(){
        System.out.println("Turning On I am SmartPhone  . . . ");
    }

}
public class Ch10_dynamic_m_dispach {
    public static void main(String[] args) {

        /*
        Phone nokia = new Phone();
        nokia.showTime();
        nokia.turnOn();
        */

        Phone samsung = new SmartPhone();
        samsung.turnOn();
        samsung.showTime();
        // samsung.playMusic();  --> will not work becose we called it by calling it as basic phone...


        SmartPhone moto = new SmartPhone();
        moto.playMusic();  // it works good we calling it as smartphoen

        // dynamic method dispatch
        //polymorphism --> runtime --> new will create obj runtime only


    }
}
