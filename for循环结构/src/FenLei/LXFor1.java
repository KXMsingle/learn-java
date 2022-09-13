package FenLei;
//需求：求出1-10之间数据之和
public class LXFor1 {
    public static void main(String[] args) {
        //原始做法
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        /*
        0+1=1
            1+2=3
                3+3=6
                    6+4=10
                    ....
                    由此可见要定义两个变量
                    第一个加数为前一个两个数据相加之和
                    第二个加数为变化的数1-10
         */
        int y=0;
        for (int x=1;x<=10;x++){
           // y=x+y,等价于下面这个
           y+=x;
        }
        System.out.println("y:"+y);
    }
}
