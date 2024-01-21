// // with return type int
// import java.util.Scanner;

// public class factorial {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int result=1;
//         result=fact(n,result);
//         System.out.println(result);
//     }
//     public static int fact(int n,int result){
//         if(n<0){
//             return 0;
//         }
//         for(int i=1;i<=n;i++){
//             result=result*i;
//         }
//         return result;
//     }

// }


// with return type void
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        fact(n,result);
    }
    public static void fact(int n,int result){
        if(n<0){
            System.out.println("factorial doesnt't exist");
        }
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println(result);
    }

}