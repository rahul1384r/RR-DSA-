public class check_3 {
    public static void firstOccerence(int[] arr,int idx,int target){
        if(idx==arr.length-1){
            if(arr[idx]==target){
                System.out.println(idx);
            }
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
            
        }
        firstOccerence(arr, idx+1, target); 
    }
    public static void lastOccurence(int[] arr,int idx,int target){
        if(idx==0){
            if(arr[idx]==target){
                System.out.println(idx);
            }
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
            return;
        }
        lastOccurence(arr, idx-1, target);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        int target=4;
        firstOccerence(arr, 0, target);
        // lastOccurence(arr, arr.length-1, target);
    }
}
