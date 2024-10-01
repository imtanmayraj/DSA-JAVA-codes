import java.util.*;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        //total 3*3 cellls
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
       //row no.
       int n=matrix.length;
       //col no.
       int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        printmatrix(matrix);
        // System.out.println("enter key value");
        // int key=sc.nextInt();

        // search(matrix,key);
        
    //    System.out.println("largest element in matrix is :" +largest(matrix)); 

       System.out.println("smallest element in matrix is :" +smallest(matrix));
    }
 

    public static void printmatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("the matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][],int key){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell (" +i + "," +j +")");
                    return true;
                }
               
            }
            
        }
        System.out.println("not found");
        return false;

    }
    

    public static int largest(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int big=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                big=Math.max(matrix[i][j],big);
               
            }
            
        }
        return big;
    }


    public static int smallest(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                small=Math.min(matrix[i][j],small);
               
            }
            
        }
        return small;
    }


}
