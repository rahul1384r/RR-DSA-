// public class reverse_array {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         int start=0,end=arr.length-1;
//         while(start<end){
//             int temp=arr[end];
//             arr[end]=arr[start];
//             arr[start]=temp;
//             start++;
//             end--;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
        
//     }
// }

// reverse of an array using function
public class reverse_array {

    public static void reverseArray(int arr[],int start,int end){
        if(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int start=0,end=arr.length-1;
        reverseArray(arr, start, end);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
