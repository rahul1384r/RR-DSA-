public class check_2 {

    public static void print(String str,char[] ch,int idx,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.length()>=2){
            int var1=(int)(str.charAt(0));         
            print(str.substring(idx+1), ch,idx, ans+ch[var1]);
            print(str.substring(idx+2), ch, idx, ans);
        }
        if(str.length()==1){
            int var1=(int)(str.charAt(idx));
            print(str.substring(idx+1), ch,idx+1, ans+ch[var1]);
        }
    }
    public static void main(String[] args) {
        String str="1125";
        char ch[]={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        print(str, ch,0,"");
    }
}
