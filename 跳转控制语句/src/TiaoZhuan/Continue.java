package TiaoZhuan;

public class Continue {
    public static void main(String[] args) {
        for(int x=0;x<=10;x++){
            if(x==5){
                continue;
            }
            System.out.println(x);
        }//continue退出本次循环
        System.out.println("__________________");
        for(int x=0;x<=10;x++){
            if(x==5){
                break;
            }
            System.out.println(x);
        }//break退出当前循环
        /*
        需求：
        for(int x=1;x<=10;x++){
            if(x%3==0){
               填入代码
            }
            System.out.println("java基础班");
            我想在控制台输出2次java基础班；
            我想在控制台输出7次java基础班；
            我想在控制台输出13次java基础班；
         */
        for(int x=1;x<=10;x++){
            if(x%3==0){
                break;
            }
            System.out.println("java基础班");
        }
        System.out.println("___________________");
        for(int x=1;x<=10;x++){
            if(x%3==0){
                continue;
            }
            System.out.println("java基础班");
        }
        System.out.println("___________________");
        for(int x=1;x<=10;x++){
            if(x%3==0){
                System.out.println("java基础班");
            }
            System.out.println("java基础班");
        }
    }
}
