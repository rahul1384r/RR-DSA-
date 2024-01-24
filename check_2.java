import java.util.Scanner;

public class check_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[size];
        arr2[0]=arr[0];
        int sum=0;
        int maxSum=INTEGER.MIN_VALUE;
        for(int i=1;i<arr2.length;i++){
            arr2[i]=arr2[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=(i==0)?arr2[j]:arr2[j]-arr2[i-1];

            }
            if(maxSum<sum){
                maxSum=sum;
                System.out.println(arr[i]);
            }
        }
        System.out.println(maxSum);
    }
}
