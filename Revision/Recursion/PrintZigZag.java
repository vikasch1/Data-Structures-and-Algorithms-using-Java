
import java.io.*;
        import java.util.*;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        pzz(n-1);
        System.out.println(n);
        pzz(n-1);
        System.out.println(n);



    }

}
