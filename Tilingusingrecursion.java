public class Tilingusingrecursion {
    public static void main(String[] args) {
        System.out.println("total no. of ways :"+tilingproblem(5));
    }
    
    public static int tilingproblem(int n){
        if(n==0||n==1){
            return 1;
        }

        // /vertical choice

        int fnm1=tilingproblem(n-1);

        //horizontal line

        int fnm2=tilingproblem(n-2);
        int totalways=fnm1+fnm2;

        return totalways;
    }
}
