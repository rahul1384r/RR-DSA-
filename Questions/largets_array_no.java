import java.util.*;
public class largets_array_no {
    public static void main(String[] args) {
        int arr[]={54,2,213,54,23,23};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
