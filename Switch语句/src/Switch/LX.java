package Switch;

public class LX {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        switch (b){
            case 3:
                a++;
                break;
            case 5:
                a++;
                break;
            default :
                a++;
                break;
        }
        System.out.println("a:"+a);//11
        /*int x=10;
        int y=20;
        switch (x){
            default :
                y++;
            case 10:
                y++;
            case 11:
                y++;

        }
        System.out.println("y:"+y);//22
        */
        int x=10;
        int y=20;
        switch (x){
            default :
                y++;
            case 11:
                y++;
            case 12:
                y++;

        }
        System.out.println("y:"+y);//23
        int q=2;
        int w=3;
        switch (q){
            default :
                w++;
            case 3:
                w++;
            case 4:
                w++;

        }
        System.out.println("w:"+w);//6
    }

}
