import java.util.*;
import java.util.Scanner;

public class spiralmatrix {

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        // printspiral(matrix);
        System.out.println("sum of both diagonals is " +diagonalsum(matrix));
        
    }

    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;


        // printing in iteration using while loop
        while(startrow<=endrow && startcol<=endcol){
        //print top part -- row fixed - col variable -- from startcol to andcol
        for(int j=startcol;j<=endcol;j++){
            System.out.print(matrix[startrow][j] +" ");
        }

        //print right part -- col fixed-endcol - row variable -- from startrow+1 to endrow
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol] +" ");
        }

        //print bottom part -- row fixed - col variable -- from startcol to andcol
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][j] +" ");
        }
         //print left part -- col fixed-startcol - row variable -- from endrow-1 to startrow+1
         for(int i=endrow-1;i>=startrow+1;i--){
            //for common in both in odd matrix+

            if(startcol==endcol){
                break;
            }
            System.out.print(matrix[i][startcol] +" ");
        }
        
    startrow++;
    endrow--;
    startcol++;
    endcol--;
    }
    
}


public static int diagonalsum(int matrix[][]){
    int n=matrix.length;
    int m=matrix[0].length;
    int sum=0;

    //brute force approach = t.c=O(n^2)

    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         if(i==j){
    //             sum+=matrix[i][j];
    //         }
    //     }
    // }
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         if(i+j==n-1){
    //             sum+=matrix[i][j];
    //         }
    //     }
    // }

    //better approach = t.c=O(n)
    for(int i=0;i<n;i++){
        //sum of primary diagonal
        sum+=matrix[i][i];

        //sum of secondary diagonal
        if(i!=n-1-i){
            sum+=matrix[i][n-1-i];
        }
        }
    return sum;


}
}
    
