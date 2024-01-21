import java.util.Scanner;

public class dec_to_bin {

    public static void decToBinary(int n){
        int binary=0;
        int rem=0;
        int pow=0;
        while(n>0){
            rem=n%2;
            binary=binary + (rem*(int) Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int n=sc.nextInt();
        decToBinary(n);
        
    }
}
