import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        Scanner ary = new Scanner(System.in);
        String[] a = new String[10];
        String as = "";
        for (int i = 0; i< a.length; i++){
            a[i]= "a";
            as += a[i];
        }
        System.out.println(as);
        int[] na = {50,20,30,10};

        for (int ea : na){
            System.out.println(ea + 2);
        }
    }
}
