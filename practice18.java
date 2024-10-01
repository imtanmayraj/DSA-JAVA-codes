import java.util.*;
public class practice18 {
    public static void main(String[] args) {
        int matrix[][]={{2,3,7},{5,6,7}};
        // System.out.println("no. of times 7 appear in matrix = "+ocurrence(matrix));
        // int matrix[][]=  { {1,4,9},{11,4,3},{2,2,3} };
        // System.out.println(" sum of the numbers in the second row = "+sum(matrix));

        transpose(matrix);


    }
//Q.1 no. of times 7 appear in matrix
    public static int ocurrence(int matrix[][]){
        int times=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    times++;
                }
            }
        }

        return times;
    }

    // Print out the sum of the numbers in the second row of the “nums” array

    public static int sum(int matrix[][]){
        int total=0;
        int i=1;

       
            for(int j=0;j<matrix[0].length;j++){
                total+=matrix[i][j];
                
            }
        

        return total;
    }

    // Question 3 : Write a program to Find Transpose of a Matrix.

    public static void transpose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int matrix2[][]=new int[m][n] ;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[j][i]=matrix[i][j];
            }
        }

        System.out.println("transpose matrix is :");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
