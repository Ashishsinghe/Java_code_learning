public class Ch7_Varargs {


    static int add(int a,int b){
       return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    //to much reoeatation ---> int abcd--> int [] arr --> ack it all in a array
    // ...arr -> int [] arr (behave)



    // static int add(int a, int ...arr) -> make one input mandatory --> so add() give error
    static int add(int ...arr){
//take all arguments pak in array -->
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {

                System.out.println(add(1,2));
                System.out.println(add(2,3,4));
                System.out.println(add(4,5,6));


    }
}
