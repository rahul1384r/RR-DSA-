public class bit_manipulation_even_odd {
    public static void main(String[] args) {
        int n=100;
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
