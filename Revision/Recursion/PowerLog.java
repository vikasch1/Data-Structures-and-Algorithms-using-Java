
import java.io.*;
        import java.util.*;

public class PowerLog {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int pow=power(x,n);
        System.out.print(pow);

    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }



        int xn2=power(x,n/2);
        int xn =xn2*xn2;
        if(n%2==1){
            xn=xn*x;
        }


return xn;
    }

}

