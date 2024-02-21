public class Check_1 {
    public static int tilingProblem(int n,String ans){
        if(n==0 || n==1){
            System.out.print(ans+" ");
            return 1;
        }
        int fnm1=tilingProblem(n-1,ans+"V");
        int fnm2=tilingProblem(n-2,ans+"H");
        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=4;
        tilingProblem(n, "");
    }
}
