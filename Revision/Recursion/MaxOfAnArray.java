
import java.io.*;
        import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int max=maxOfArray(arr,0);
        System.out.print(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int misa=maxOfArray(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }


    }

}
