public class array_ass_que_2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,5,6,7};
        int key=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}
