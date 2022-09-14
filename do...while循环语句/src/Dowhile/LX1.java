package Dowhile;
/*
需求：输出以下图形
*
**
***
****
****
 */
public class LX1 {
    public static void main(String[] args) {
        //五行五列
        for (int x=1;x<=5;x++){
            for (int y=1;y<=5;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_______________");
        /*
        列数变化
        第一行：1列    y=1,y<=1,y++
        第二行：2列    y=1,y<=2,y++
        第三行：3列    y=1,y<=3,y++
        第四行：4列    y=1,y<=4,y++
        第五行：5列    y=1,y<=5,y++
         */
        for (int x=1;x<=5;x++){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
