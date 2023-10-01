import java.util.Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {


       /*
       //5 flot cal their sum
        float [] val = {1.2f, 2.3f, 3.4f,4.6f,5.4f};
        float sum=0f;
        for (float i :val){
            sum = sum+ i;
        }
        System.out.println("sum is " + sum);


      //given int present in arry or not

        float [] val = {1.2f, 2.3f, 3.4f,4.6f,5.4f};
        float [] prsent = new float[2];
        boolean have = false;
        float a=1.3f;
        for (float i :val){
            if(i==a){
                have =true;
                break;
            }
        }
        if (have){
            System.out.println("arrwy in present  " + a);
        }
        else System.out.println("NOT in present  " + a);



        //AVG OF MARKS
        float [] marks  = {1.2f, 2.3f, 3.4f,4.6f,5.4f};
        float sum=0f;
        for (float i :marks){
            sum = sum+ i;
        }
        System.out.println("avg score is " + sum/marks.length);

        //create matrix if 2*3 + 2*3 matrix
        // will dounderstand the conceot
        int [][] one = new int[2][3];
        int [][] two = new int[2][3];

        //assign the values
        int count = 1;
        for (int i =0; i<one.length; i++){

            for (int j=0;j< one[i].length;j++ ){
                one[i][j] =count;
                System.out.print(one[i][j] +" " +i+j+"  ");
                count++;
            }
            System.out.println();

        }



        //java program reverse the array
        int  [] val = {1, 2, 3,4,5};
        int  [] val2 = new int [5];

        int count =0;
        int len = (val.length)-1;
        for (int i : val){

           // we use swaping logic need to work on this more

            val2[count] =val[len];

            count ++;
            len--;

        }
        for (int i : val2){
            System.out.println(i);
        }
        //will implement the vedio menthod --



        //find MAX and MIN in array;

        int  [] val = {122, 23, 13,42,35};
        int q=100;
        int min=Integer.MAX_VALUE;
        //his can be refined
        for(int i: val){
            if (i<min){
                min =i;

            }

        }
        System.out.println("MIN" + min);


        //java program to tell array sorted or not done by myself --
        boolean sort = true;
        int  [] val = {1, 13, 4,10,};
        for (int i=0;i< val.length;i++){


            if (i+1 ==val.length){
                continue;
            }
           if  (val[i] > val[i+1]) {sort =false;
                }
            }

        System.out.println(sort);

*/





        }


    }

