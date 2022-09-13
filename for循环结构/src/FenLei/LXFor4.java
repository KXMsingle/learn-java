package FenLei;
/*
需求：在控制台输出所有的“水仙花数”
水仙花指：一个三位数，其各位数字的立方和等于该数本身
PS：153=1*1*1+5*5*5+3*3*3=1+125+27=153
t
 */
public class LXFor4 {
    public static void main(String[] args) {

        for (int x = 100; x <= 999; x++) {
            /*如何获得个位，十位，百位的数呢
            PS：153
            个位：3，153%10=3
            十位：5，153/10%10=5
            百位：1, 153/10/10%10=1
             */
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if (x==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                System.out.println(x);

            }
        }

    }
}

