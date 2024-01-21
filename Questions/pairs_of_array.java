//formula to calculate total pairs=n(n-1)/2
// n--->total elements in an array 

public class pairs_of_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
}
