import java.util.Scanner;

public class check_practice {
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10};
        int key=6;
        // // linear search
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         System.out.println(i);
        //     }
        // }
        
        // // binary search:-only valid on sorted arrays.
        // int start=0;
        // int end=arr.length-1;
        // while(start<=end){
        //     int mid=(start+end)/2;
        //     if(arr[mid]==key){
        //         System.out.println("found at "+mid);
        //         break;
        //     }
        //     if(arr[mid]<key){
        //         start=mid+1;
        //     }
        //     if(arr[mid]>key){
        //         end=mid-1;
        //     }
        // }

        // // reverse an array
        // int start=0;
        // int end=arr.length-1;
        // while(start<=end){
        //     int temp=arr[end];
        //     arr[end]=arr[start];
        //     arr[start]=temp;
        //     start++;
        //     end--;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // // pairs in array
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         System.out.println("("+i+","+j+")");
        //     }
        // }

        // // printing continuous subarrays
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k]);
        //         }
        //         System.out.println();
        //     }
        // }

        // // maximum subarray sum{Brute Force}
        // int maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //         }
        //         System.out.println("current sum: "+sum);
        //         if(sum>maxSum){
        //             maxSum=sum;
        //         }
        //         System.out.println(maxSum);
        //     }
        // }

        // // maximum subarray sum{prefix sum}
        // int arr[]={2,4,6,8,10};
        // int prefix[]=new int[arr.length];
        // prefix[0]=arr[0];
        // int maxSum=Integer.MIN_VALUE;
        // for(int i=1;i<prefix.length;i++){
        //     prefix[i]=arr[i]+prefix[i-1];
        // }
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
        //         if(sum>maxSum){
        //             maxSum=sum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        // maximum subarray sum{Kadane's algo}
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
