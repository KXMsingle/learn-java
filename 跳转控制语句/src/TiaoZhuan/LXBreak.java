package TiaoZhuan;
/*
需求：
小芳的妈妈每天给她2.5元，她都会存起来，但是，
每当这一天是存钱数的第五天或者五的倍数的话，他就会花去6元，
请问，经过多少天，小芳才可以存到100元
 */

public class LXBreak {
    public static void main(String[] args) {
        double daymoney=2.5;
        //每天可以存的钱
        int result=100;
        //最终要存到的钱
        double daysum=0;
        //初始的钱
        int daycount=1;
        //存钱天数
        while(true){

             daysum+=daymoney;
             //不能写成double daysum=(double)daycount*daymoney;
            //表示存钱数随存钱天数的变化
            if (daysum>=result) {
                System.out.println("经过"+daycount+"天小芳可以存100元");
                break;
            }
            if (daycount%5==0){
                daysum-=6;
                System.out.println("第"+daycount+"天花了6元");
                //存钱天数曼珠第五天或者五的倍数花去6元
            }
            daycount++;
            //存钱天数的增长
        }

    }
}
