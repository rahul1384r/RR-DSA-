// public class practice_recursion {

//     public static void print(String str,String ans){
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             print(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         print(str,"");
//     }
// }

// subsequence
public class practice_recursion {

    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        print(str.substring(1), ans);
        print(str.substring(1), ans+str.charAt(0));
    }
    public static void main(String[] args) {
        String str="abc";
        int n=str.length();
        print(str,"");
    }
}