import java.util.ArrayList;

public class Leetcode {
    public static void main(String[] args) {
    //     int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};


    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = i; j < matrix[0].length; j++) {
    //             int temp = 0;
    //             temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    //     }

    //     System.out.println("transpose matrix is :");
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    System.out.println(myPow(2,-10));
    


    }
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = -1 * nn;
        while (nn > 0) {
          if (nn % 2 == 1) {
            ans = ans * x;
            nn = nn - 1;
          } else {
            x = x * x;
            nn = nn / 2;
          }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
      }
    
}
