import java.util.ArrayList;
import java.util.HashSet;

public class Loop_Practic {
    public static void main(String[] args) {
        //pattern
       /*   ****
            ***
            **
            *
        * */

        // need to practice loops more -->
        /*int n=4;
        for(int i=0; i<=n;i++){
            for (int j=0; j<=i; j++){
                System.out.print(" *");}
            System.out.println();

        }*/


        //probjem 2 sum of even no teill n
       /* int sum =0;
        int n =6;
                for (int i =0; i<n; i++){
                    System.out.print(2*i);
                     sum = sum +(2*i);
                }
        System.out.print("sum" + sum);*/

        // multiply table of n

       /*
       int  n=19;
        for (int i =1; i<=10; i++){
            System.out.println(n +" * " +i+ " = "+ n*i);
        }
        */


       /*
       // table in reverse order
       int  n=10;
        for (int i =n; i>0; i--){
            System.out.println(n +" * " +i+ " = "+ n*i);
        }
*/
        // factorial of give no.. 5*4*3*2*1
       /* int  n=5;
        int fact =1;
        for (int i =n; i>=1; i--){
            fact = fact*i;
            System.out.println(i+" factorial is till now   "+ fact);

        }*/

     /*   // repeat 5 using while ..
        int  n=6;
        int fact =1;
        while  (n>=1){
            fact = fact*n;
            n--;}
        System.out.println(n+" factorial is till now   "+ fact);
*/

        // repeat 1 by while lopp -->

        // first n odd not
       /* int n= 5;
        for (int i =0; i<5; i++){
            System.out.println(2*i+1);
        }*/
   // print star pattern
      /*  for (int j =5; j>0;j--){

            for (int i =j; i>0; i--){
                System.out.print (" * ");
            }
            System.out.println (" ");
        }*/

        //unque char in char array
        char [] in = {'a','b','c','a','b'};

                HashSet<Character> Unique = new HashSet<>();
        HashSet<Character> repeat = new HashSet<>();
                for (char a : in){
                   if (!Unique.contains(a)){
                       Unique.add(a);
                   }
                   else {repeat.add(a);
                   }
                }
                    for(char j : repeat){
                        Unique.contains(j);
                        Unique.remove(j);


                }
        System.out.println (Unique.stream().toList().toString());
        System.out.println (repeat.stream().toList().toString());







    }
}
