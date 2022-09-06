package YuJuJieGou;
/*区别
三元运算符实现的，都可以用if语句实现；反之不成立
 */
public class QuBie {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //三元运算符
        int max1=(a>b)?a:b;
        System.out.println(max1);
        //if格式
        int max2;
        if(a>b){
            System.out.println(max2=a);
        }else{
            System.out.println(max2=b);
        }
        //判断一个数是奇数还是偶数，并输出是奇数还是偶数
        //if格式
        if(a%2==0){
            System.out.println(a+"这个数据是偶数");
        }else{
            System.out.println(a+"这个数据是奇数");
        }
        //三目运算格式
        //改法错误
       // String s=(a%2==0)?System.out.println(a+"这个数据是偶数"):System.out.println(a+"这个数据是奇数");
        boolean s=(a%2==0)?true:false;//只能判断是否正确，不能输出数据
    }
}
