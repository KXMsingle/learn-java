package FenLei;
/*
请在控制台输入曼珠如下条件的五位数
个位等于万位
十位等于千位
个位+十位+千位+万位=百位
 */
public class LXFor5 {
    public static void main(String[] args) {
        for (int x=10000;x<=99999;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            int qian=x/10/10/10%10;
            int wan=x/10/10/10/10%10;
            if (ge==wan && shi==qian && (ge+shi+qian+wan==bai)){
                System.out.println(x);
            }
        }
    }

}
