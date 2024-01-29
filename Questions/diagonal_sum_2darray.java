import java.util.Scanner;

public class diagonal_sum_2darray {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        // Brute force
        int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //      // pd    
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //      // sd
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        // optimized code
        for(int i=0;i<arr.length;i++){
            // pd
            sum+=arr[i][i];
            // sd
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }
}
