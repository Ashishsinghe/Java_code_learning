 public class Store {
    int name ;

     public int getname(){
            return this.name  ;
        }

        public void setname(int name){
            this.name = name ;
        }
        // new method: constructor!
        public Store() {
            System.out.println("I am inside the constructor method.");

        }

        // main method is where we create instances!
        public static void main(String[] args) {

            System.out.println("Start of the main method.");

            // create the instance below
            Store lemonadeStand = new Store();
            lemonadeStand.setname(1);
            System.out.println(lemonadeStand.getname());



            // print the instance below

        }
    }
