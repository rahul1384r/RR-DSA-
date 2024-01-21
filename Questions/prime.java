// import java.util.Scanner;

// public class prime {
//     public static void prime(int n){
//         int count=0;
//         int flag=0;
//         if(n==2){
//             System.out.println("Prime");
//         }
//         for(int i=2;i<Math.sqrt(n);i++){
//             if(n%i==0){
//                 count++;
//             }   
//             else if((n%i)!=0){
//                 flag++;
//             }
//         }
//         if(count>0){
//             System.out.println("Not prime");
//         }
//         else if(flag>0){
//             System.out.println("Prime");
//         }
        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the value of n:");
//         int n=sc.nextInt();
//         prime(n);


//     }
// }



// prime numbers in range.
import java.util.Scanner;

public class prime {
    public static void prime(int n){
        int count=0;
        int flag=0;
        if(n==2){
            System.out.println("Prime");
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }   
            else if((n%i)!=0){
                flag++;
            }
        }
        if(count>0){
            System.out.println("Not prime");
        }
        else if(flag>0){
            System.out.println("Prime");
        }
        
    }

    public static void inRange(int n){
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        prime(n);


    }
}
