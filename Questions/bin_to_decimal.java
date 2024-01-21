import java.util.Scanner;

public class bin_to_decimal {

    public static void binToDecimal(int n){
        int decimal=0;
        int pow=0;
        while(n>0){
            int ld=n%10;
            decimal = decimal + (ld*(int)Math.pow(2, pow));
            pow++;
            n/=10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int n=sc.nextInt();
        binToDecimal(n);
        
    }
}
