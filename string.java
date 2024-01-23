public class string {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d'};
        String str="RRY";
        // length()
        System.out.println(str.length());
        // charAt()
        char particularCharacter=str.charAt(2);
        System.out.println(particularCharacter);
        // for loop on string
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // compare strings
        String s1="RRY";
        String s2="RRY";
        String s3=new String("RRY");
        if(s1==s2){
            System.out.println("strings are equal");
        }
        else System.out.println("strings are not equal");

        if(s1==s3){ // in this case it will give strings are not equal because == checks reference as well
            System.out.println("strings are equal");
        }
        else System.out.println("strings are not equal");
        if(s1.equals(s3)){  //it will give string are equal bcz it only checks value not reference
            System.out.println("strings are equal");
        }
        else System.out.println("strins are not equal");

        // substring
        String a=str.substring(0, 2);
        System.out.println(a);
    }
    
}
