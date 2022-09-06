package YuJuJieGou;
/*
if语句的注意事项：
        A:结果必须是boolean类型
        B:if控制的是单条语句可以省略{}，多条不行，建议不省
        C：有左大括号就没有分号，有分号就没有左大括号
 */
public class XuanZeZhuYiShiXiang {
    public static void main(String[] args) {
        int x = 10;
        if (x < 10 || x == 10) ;
        {
            System.out.println("x小于等于10");
        }
        System.out.println("x大于10");
        int a = 100;
        if (a == 100)
            System.out.println("a等于100");


        if (a == 100) {
            System.out.println("a等于100");
            if (a == 100) {
                System.out.println("a等于100");
                System.out.println("over");
                /*结果为：a等于100
                         over

                 */
            }
          /* if (a ！= 100)
                System.out.println("a等于100");
            System.out.println("over");
结果为：over
*/
        }

 if (a==100);//这是空语句体
    }
}