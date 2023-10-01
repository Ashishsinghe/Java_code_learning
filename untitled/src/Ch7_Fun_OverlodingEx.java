public class Ch7_Fun_OverlodingEx {

    static void change (int a){
        a=15;
    }

    static void change (int [] arr){
        arr[0]=15;
    }

    public static void main(String[] args) {
        //int obj case -local copy
        /*int a =5;
        change(a);
        System.out.println("Chnage value is  "+ a );*/

        //array refrence sent
        /*int [] a = {1,2,3,4};
        change(a);
        System.out.println("Chnage value is  "+ a[0]);*/

    }


}
