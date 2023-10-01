public class Ch7_Recursion {

    //feonachi series
    static void feo(int a){
        // frboni chi series till n
        //create a crreay with nth size
        int[] feoarray=new int[a];
        int f=0;
        int s=1;

        for (int i=0; i<a;i++)
        {
            int next = f+s;

        }

    }

    //self code --
   static int fact(int a){
       int k;
       if (a<=1) {
           k= 1;
       }

       else {
        k =a*fact(a-1);}
       return k;
    }






    public static void main(String[] args) {

       // factorial
       int factorial = fact(4);
       System.out.println("factorial   "+ factorial);



         //feb = feo(4);
       // System.out.println("febonachi ceries   "+ feb);
    }
}
