package Way;
/*
需求：在控制台输出如下的形状
*****
*****
*****
*****
 */
public class LX4 {
    public static void main(String[] args) {
        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_____________");
        //需求：我要在控制台输出一个6行7列的星形图形
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= 7; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_____________");
        //需要继续改变，我们就应该考虑使用方法改进
        //单独调用
        printxing(3,4);
        System.out.println("_____________");
        printxing(4,6);
        System.out.println("_____________");
        printxing(7,8);
        System.out.println("_____________");
        //输出调用
        //System.out.println(printxing(5,6));
        //不允许使用'空'类型
        //赋值调用
        //void v=printxing(2,3);
        //非法表达式，void不能这样用
    }


    /*
    写一个m行n列的代码

     */
    public static void printxing(int m,int n){
        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
