import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<i+2;j++){
                    if(i%2!=0){
                        break;
                    }
                    if(arr[i]>arr[j] && arr[i]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                    else if(arr[j+1]>arr[j] && arr[j+1]>arr[i]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    
                    
                }
            }
        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
