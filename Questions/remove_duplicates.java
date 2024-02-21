public class remove_duplicates {
    public static void main(String[] args) {
        String str="rahulrajput";
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)!=str1.charAt(j)){
                    str1.append(str.charAt(i));
                }
            }
        }
        System.out.println(str1);
    }
}
