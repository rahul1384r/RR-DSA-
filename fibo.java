public class fibo {
    public static void main(String[] args) {
        int a=0,b=1,temp;
        int sum=0;
        System.out.print(a+" "+b);
        for(int i=0;i<=6;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;    
            b=sum;
        }
    }
}
