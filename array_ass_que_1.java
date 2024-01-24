public class array_ass_que_1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=2;
                }
            }
        }
        if(count>=2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
