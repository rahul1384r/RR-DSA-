// multiple functions with same name but different parameters.
// return type doesn't matter at all
public class function_overloading {

    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }

    public static void sum(float a,float b){
        float sum=a+b;
        System.out.println(sum);
    }

    public static void sum(double a,double b){
        double sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(2,7);
        sum(2,7,1);
        sum(2.1,7.1);
        sum(2.1,7.1);
    }
}
