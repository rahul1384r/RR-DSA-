import java.util.*;

public class string_pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int n=name.length();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==name.charAt(n-1-i)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        
    }
}
