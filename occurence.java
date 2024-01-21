public class occurence {
    public static void main(String[] args) {
        int n=23223;
        int count=0;
        while(n>0){
            int a=n%10;
            if(a==3){
                count+=1;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
