import java.util.Scanner;

// public class string_lec {
//     public static void main(String[] args) {
//         // String str=new String("RRY");
//         Scanner sc=new Scanner(System.in);
//         String str1=sc.next();
//         String str2=sc.nextLine();
//         System.out.println(str1);
//         System.out.println(str2);

//     }
    
// }



public class string_lec {
    public static void main(String[] args) {
        // String str=new String("RRY");
        
        String str1="RRY is forever";
        String str2="RRY";
        String str3="";
        // str1.equals(str2)
        if(str1.equals(str2)){
            System.out.println("true");
        }
        // str.substring(0,i)
        // System.out.println(str1.substring(0,1));
        for(int i=0;i<3;i++){
            str3+=str1.charAt(i);
        }
        System.out.println(str3);

    }
    
}