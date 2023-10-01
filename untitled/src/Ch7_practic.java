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


    //recursion approch for star ==

    public static void main(String[] args) {
        int a=8;
       // table(a);
       // star(a);
        natural(3);
        //recursive fun

       int rno = Recno(2);
        System.out.println("natural no recursion  "+rno);

        RevStar(4);

        //nth term for fechnoi series -- recursion


        avg(2,3);


        //recursion approch for star ==


    }

}
