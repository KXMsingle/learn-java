package Way;
/*
方法（函数）
格式：
修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2...){
函数体;
return返回值;
}
如何调用（有明确返回值的调用）
 */
public class PS {
    public static void main(String[] args) {
      int a=10;
      int b=20;
      //方法1:单独调用
        sum(a,b);
        //方法2：输出调用
        System.out.println(sum(a,b));
        System.out.println(30);//与上面的等价
        //方法3：赋值调用
        int result=sum(a,b);
        //这样赋值的话就可以在中间再次计算
        System.out.println(result);
    }
    /*
    需求：
    求两个数据之和
    明确：
    返回值类型：int
    参数列表：2个，都是int类型。
     */
    public static int sum(int x,int y){
        int z=x+y;
        return z;
        //z=x+y,所以可以直接return a+b
        //未调用不执行
    }

}
