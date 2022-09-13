package FenLei;
/*
A:求1-100之和
B:求1-100之间偶数之和
C:求1-100之间奇数之和
 */
public class LXFor2 {
    public static void main(String[] args) {
         //A
        int sum=0;
        for (int x=1;x<=100;x++){
            sum +=x;
        }


        System.out.println("sum:"+sum);
        //B
        int sum1=0;
        for (int x=1;x<=100;x++){
            if(x%2==0){
                sum1 +=x;
            }
        }
        System.out.println("sum1:"+sum1);
        //C
        int sum2=0;
        for (int x=1;x<=100;x++){
            if(x%2!=0){
                sum2 +=x;
            }
        }
        System.out.println("sum2:"+sum2);
    }

}
