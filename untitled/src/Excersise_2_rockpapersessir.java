import java.util.Scanner;

public class Excersise_2_rockpapersessir {

    // roc paper sessior play with computer -- generate no. -->on that deside what progeam choose
    /*random no -->
    coose wahat --> what user take -->
    campare vboth and decide winner

    do a series in while loop and deside overall winner -->
    * */

    /*leap year problem if year is leap year or not find by java condition*/
    public static void main(String[] args) {
        /*
        while loop Example
        Scanner sc = new Scanner(System.in);
        boolean ch = true;
        do {
            System.out.println("do you want anything");
            ch =  sc.nextBoolean();
        }
        while (ch);*/


        //first n odd numbers -- try failed
              /*  int n=5;
                for (int i=0; i<n; i++ ){
                    System.out.println(2*i+1);
                    if((2*i+1)>=7){ // condition shold be exactly same then works
                        System.out.println("hi ");
                    break;}
                }*/

                // naturel n no in reverse order

/*        // tax calculate -- acc to tax slabs -- cool

        double salary = 12;
        double Tax = 0;

        if(salary<=2.5){
            Tax = Tax +0;
        }
        else if (salary<=5.5 && salary>2.5){
            Tax = Tax + (salary-2.5)*0.05;}

        else if (salary<=10 && salary>5.5){
            Tax = Tax + (5.5-2.5)*0.05;
            Tax = Tax + (salary-5.5)*0.10;}
        else {
            Tax = Tax + (5.5-2.5)*0.05;
            Tax = Tax + (10-5.5)*0.10;
            Tax = Tax + (salary-10)*0.20;}
        System.out.println("Salary  " + salary + " tax is "+ Tax );

        */

        // find day of week by given no --
       /* int i= 6;
        switch(i){
            case (1):{
                System.out.println("monday");
                break;
            }
            case (2):{
                System.out.println("TUE");
                break;
            }case (3):{
                System.out.println("WED");
                break;
            }case (4):{
                System.out.println("THUS");
                break;
            }case (5):{
                System.out.println("FRY");
                break;
            }
            default:
                System.out.println("WEEKend");
                break;
        }
       */

       /* //leap year
       int year =1600;
         if ((year%400==0) && (year%100==0) && (year%4==0)){
            System.out.println("leap year");
        }
        else{
             System.out.println("NOT leap year");
         }*/

    // find the type of web side .. by url .com , .org .in
        String in = "ashe.orgfin";
        /*
        not a ideal code--
        in.indexOf('.');
        System.out.println("indec of "+in.indexOf('.'));

        in.substring(in.indexOf('.'));
        System.out.println("sub of "+ in.substring(in.indexOf('.')));*/

        // second type
      /*  if(in.endsWith(".com")){
            System.out.println("com");
        }
        else if(in.endsWith(".in")){
            System.out.println("in");
        }
        else if(in.endsWith(".org")){
            System.out.println("org");
        }
        else{
            System.out.println("sub of "+ in.substring(in.indexOf('.')));
        }*/


        // rock paper seissor
        //choose rock paper sessior --5 match series


        //int no =random.nextInt(1000);
        int no= 1;
        String computerCH;
        if (no%2==0){
            computerCH = "rock";
        }
        else if (no%3==0){
            computerCH = "paper";
        }
        else {
            computerCH = "sissor";
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice  ");
        String input = sc.next();

        System.out.println("Your choice  " + input);
        System.out.println("pc  choice  " + computerCH);

       if (input.equals(computerCH)){
           System.out.println("Draw ");
       }



        }

        }







