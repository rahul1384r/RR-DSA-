public class recursion_7 {

    public static void firstOcc(int[] arr,int target,int i){
        if(i==arr.length-1){
            if(arr[i]==target){
                System.out.println(i);
            }
            return;
        }
        if(arr[i]==target){
            System.out.println(i);
            return;
        }
        firstOcc(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3};
        int target=3;
        firstOcc(arr, target, 0);
    }
}
