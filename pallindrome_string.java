public class pallindrome_string {
    public static void main(String[] args) {
        String str="racecdar";
        int n=str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("not a pallindrome");
                break;
            }
            
        }
    }
}
