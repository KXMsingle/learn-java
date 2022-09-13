package FenLei;
/*
for循环格式：
for(初始化语句;判断条件语句;控制条件语句){
循环语句体;
}
需求：输出10次"helloworld"
 */
public class For {
    public static void main(String[] args) {
        //最原始的做法
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        //代码重复度过高，不好
        //for(初始化语句;判断条件语句;控制条件语句)
        //注意：判断条件语句是一个boolean类型
        for (int x=1;x<=10;x++){
            System.out.println("helloworld");
        }
        //循环语句中如果是一句话，则可以省略{},多句不可以，建议不省
        //有;无{,有{无;
    }
}
