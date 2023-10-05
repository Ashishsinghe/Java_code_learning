public class Ch7_practic {


    //Ques 1 table of n
    static void table(int a) {
         for (int i=1;i<=10;i++){
             System.out.println(i*a);
         }
    }
    //Ques 2 start with n --right angle star
    static void star(int a) {
        for (int i=0;i<a;i++){
            for (int in =0;in<=i;in++ ){
            System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    //Ques 3 first n natural no
    static void natural(int a) {
        int sum =0;
        for (int i=1;i<=a;i++){
            sum+=i;

        }
        System.out.println("natural sum  "+sum);
    }

    //Ques 3 first n RECURDIVE natural no
    static int  Recno(int a) {
        if (a<=1){
            return 1;
        }
        else
            return
            a+Recno(a-1);
    }



    //Ques 4 start with REV --right angle star
    static void RevStar(int a) {
        for (int i=a;i>0;i--){
            for (int in =i;in>0;in-- ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    //
    static void avg( int... arr) {
        if (arr.length==0){
            System.err.println(" ZERO INUT");
        }
        int sum =0;
        int count =0;
        for (int n:arr){
            sum+=n;
            count++;
        }
        System.out.println("avg  "+(double) sum/count);
    }
    // Ques3 = Recursion sum till nth natural No check ---
    //n=1,2,3,4,5
    static int RecSum(int no){
        int sum =0;
        if (no <=1){
            sum =1;
        }
        else
            sum = no+Recno(no-1);
        return sum;
    }

    //Ques to print Febnochi series
    // 0,1,n+n-1,..
    static void febo(int f){
        if (f==0){

        }
        if (f==1){

        }

    }

    //Quest Nth febono ===
    //fenoci no = 0,1,1,2,3,5,8,13...
    // F(n) = f(n-1)+f(n-2)
    static int f(int fn){
       if (fn==0){
           return 0;
       }
        else if (fn==1){
            return 1;
        }
        else
           System.out.println(" ");
            return f(fn-1)+f(fn-2);
    }

    //febonachi series
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }


    //recursion approch for star
    /*
    ****   //recursion *x4 recstar(3)
    ***
    **
    *
     * */

    static void RecStar(int no){
        if (no<=0){
            return;
        }
        int c=no;
        while (c>0){
        System.out.print(" * ");
        c--;
        }
        System.out.print(" ");
        Recno(no-1);
    }


    //recursion rec approch for star
    /*
     *   //recursion * x4 recstar(2)
     **
     ***
     ****
     * */

    static void RevRecStar(int no){


    }

    public static void main(String[] args) {

        RecStar(4);

        int a=8;
       // table(a);
       // star(a);
        natural(3);
        //recursive fun

       int rno = Recno(2);
        System.out.println("natural no recursion  "+rno);
        RevStar(4);
        avg(2,3);


        //n=1,2,3,4,5
       int x =  RecSum( 5);
        System.out.println("natural RevRec  "+x);

        //nth term for fechnoi series -- recursion
        x=  f( 6);
        System.out.println("febo nth no  "+x);


        printFibonacci(5);




        //recursion approch for star =

    }




}
