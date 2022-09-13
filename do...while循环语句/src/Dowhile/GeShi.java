package Dowhile;
/*
基本格式
do{
循环语句体
}while(判断条件语句);
拓展格式
初始化语句；
do{
循环语句体
控制条件语句
}while(判断条件语句);
 */
public class GeShi {
    public static void main(String[] args) {
        //输出十次"hello"
        int x=1;
        do {
            System.out.println("hello");
            x++;
        }while(x<=10);
        //求和1-100
        int sum=0;
        int y=1;
        do{
            sum+=y;
            y++;
        }while(y<=100);
        System.out.println("sum:"+sum);

    }
}
