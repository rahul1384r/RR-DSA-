// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the arrays value:");
//         arr[0]=sc.nextInt();
//         arr[1]=sc.nextInt();
//         arr[2]=sc.nextInt();
//         arr[3]=sc.nextInt();
//         arr[4]=sc.nextInt();
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// // accessing the elements of an array and updating
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         int arr[]={97,98,99};
//         arr[0]=2;
//         arr[1]=arr[1]+2;
//         System.out.println(arr[0]);
//         System.out.println(arr[1]);
//     }
// }


// we passes the array to the function by reference
// means we don't pass the copy of array instead of we pass the original value.
import java.util.Scanner;
public class arrays{

    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={97,98,99};
        update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);     //call by reference
        }
    }
}
