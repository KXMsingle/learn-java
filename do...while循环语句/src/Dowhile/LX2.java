package Dowhile;
/*
需求：
在控制台输出九九乘法表
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
......
可以看成这样的式子
*
**
***
****
*****
******
*******
********
*********
 */
public class LX2 {
    public static void main(String[] args) {
        //基本格式
        for(int x=1;x<=9;x++){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=1;x<=9;x++){
            for (int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
        //"\t":转义字符，tab建位置
    }
}
