// public class subarray_sum {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int sum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum=sum+arr[k];
//                 }
//                 if(maxSum<sum){
//                     maxSum=sum;
//                 }
//                 System.out.println(sum);
                
                
//             }
//         }
//         System.out.println("the max sum is "+maxSum);
//     }
// }



// // optimized maxSum
// public class subarray_sum {
//     public static void main(String[] args) {
//         int arr[]={1,-2,6,-1,3};
//         int sum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int[arr.length];
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                
//                 if(maxSum<sum){
//                     maxSum=sum;
//                 }
//                 System.out.println(sum); 
//             }
//         }
//         System.out.println("the max sum is "+maxSum);
//     }
// }



// kadane's a;gorithm
public class subarray_sum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
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

