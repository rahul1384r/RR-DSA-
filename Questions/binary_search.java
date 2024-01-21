// binary search is only valid on sorted array{ascending}
// binary search has less time complexity than linear search.
// public class binary_search {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,5,10};
//         int key=10;
//         int start=0,end=arr.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;

//             if(arr[mid]==key){
//                 System.out.println(mid);
//             }
//             if(arr[mid]<key){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//     }
// }


// binary search by function
public class binary_search {

    public static int binarySearch(int arr[],int start,int end,int key){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=start+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,10};
        int key=10;
        int start=0,end=arr.length-1;
        int result=binarySearch(arr, start, end, key);
        System.out.println(result);
    }
}