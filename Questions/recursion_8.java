public class recursion_8 {

    public static void lastOcc(int[] arr,int target,int i){
        if(i==0){
            return;
        }
        if(arr[i]==target){
            System.out.println(i);
            return;
        }
        lastOcc(arr, target, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3};
        int target=3;
        lastOcc(arr, target, arr.length-1);
    }
}
