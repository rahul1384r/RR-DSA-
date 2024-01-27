import java.util.Scanner;

public class smallest_in_2d_array {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int smallest=10000;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(smallest>arr[i][j]){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println(smallest);
    }
}
