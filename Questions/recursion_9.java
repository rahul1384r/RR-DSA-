import java.util.*;
public class recursion_9 {

    public static int power(int num,int pow){
        if(pow==1){
            return num;
        }
        if(pow==0){
            return 1;
        }
        power(num,pow-1);
        int res=num*power(num, pow-1);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(power(num,pow));
    }
}
