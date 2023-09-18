package Myclasses_MJ;

public class Methods {
    int logic(int x, int y){
        int z;
        if(x<y){
            z = (x+y)*5;

        }
        else{
            z = x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        Methods obj = new Methods();
        int c;
         c = obj.logic(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1 = obj.logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
    
}
