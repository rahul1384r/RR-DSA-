// public class Linear_search {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,10,2,3,45,23};
//         int key=10;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// linear search by function
// public class Linear_search {

//     public static void linerSearch(int arr[],int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,10,2,3,45,23};
//         int key=10;
//         linerSearch(arr, key);
        
//     }
// }


public class Linear_search {

    public static void linerSearch(String arr[],String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        String arr[]={"RR","YASHU","RRY"};
        String key="RRY";
        linerSearch(arr, key);
        
    }
}