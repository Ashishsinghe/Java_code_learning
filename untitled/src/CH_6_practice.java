import java.util.Scanner;

public class CH_6_practice {
    public static void main(String[] args) {

        //ques 1-
        /*float [] f ={1.1f,2.2f,3.3f,4.4f,5.5f};
        double s =0;
        for (float ff : f){
            s+=ff;
        }
        System.out.print("sum is "+s);*/


        //Ques 2
        /*Scanner sc= new Scanner(System.in);
        System.out.print("Enter  is no ");
        int in = sc.nextInt();
        boolean f =false;
        int [] a ={2,3,4,5};
        for (int aa : a){
            if (in==aa){
                f= true;
                break;
            }
            else
                f=false;
        }
        if (f){
            System.out.print("FOUND is "+in);
        }
        else  System.out.print("NOT found "+in);*/


        //Ques3
       /* int [] marks = {4,5,6,7,8,9};
        int t=0;
        for (int m : marks){
            t+=m;
        }
        double avg = (double)t/marks.length;
        System.out.print("AVG   "+avg);*/


        //Ques4 add two mtrix 2X3
      /*  int [] [] a ={
                {1,2,3},
                {4,5,6}};
        int [] [] b ={
                {1,2,3},
                {4,5,6}};
        int [][] c =new int[2][3];

        for (int row =0; row<2;row ++){
            for (int col=0;col<3;col++){
                c[row][col] =a[row][col]+b[row][col];
            }
        }
        for (int [] m : c)
        {
            for (int k : m){
                System.out.print( k+ " ");
            }
            System.out.println(  " ");
        }*/

        //ques5 - prog reverse array
        //2 method come to head 1 create new array and use it will try second t/2
        //b=a, a=b, c=b
        /*int [] a= {1,2,3,4,5,7,8};
        for (int n: a){
            System.out.print(" " +n);}
        int l =a.length;
        for (int i=0;i<l/2;i++){
            int aa;
            aa=a[i];
            a[i]=a[l-1];
            a[l-1] =aa;
            l--;
        }
        System.out.println(" " );
        for (int n: a){
        System.out.print(" " +n);}
        */

        //ques7 max element of array
        //MIn is also same

        /*
        int [] a= {1,112,13,42,51,7,8};
        int max = Integer.MIN_VALUE;
        for (int n :a){
            if (n>max){
                max=n;
            }
        }System.out.println("MAX  "+max);
        */

        //ques8 array is sorted poor not
        //means A<B then ony sorted
       /* boolean sorted =true;
        int [] a= {1,2,3,141};
        int f,s;
        for (int i=0;i<a.length-1;i++){
            f=a[i];
            s=a[i+1];
            if (f>s) {
                sorted = false;
                break;
            }
        }System.out.println("sorted  "+sorted);*/


    }

}
