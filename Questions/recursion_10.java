import java.util.Scanner;

public class recursion_10 {

    public static int optimizedPower(int num,int pow){
        if(pow==0){
            return 1;
        }
        int halfPower=optimizedPower(num, pow/2) * optimizedPower(num, pow/2);
        // for pow is odd
        if(pow%2!=0){
            halfPower=num*halfPower;
            return halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(optimizedPower(num,pow));
    }
}
