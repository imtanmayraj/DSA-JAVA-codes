import java.util.*;
import java.util.Scanner;
public class operationsonmatrix {
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=29;
        stairsearch(matrix,key);
    }

    public static boolean stairsearch(int matrix[][],int key){

    //     starting from rightmost 1st row cell
    //     int row=0,col=matrix[0].length-1;
        

    //     while(row<=matrix.length-1 && col>=0){
    //         if (key==matrix[row][col]){
    //             System.out.println("key found at cell (" +row +","+col +")");
    //             return true;
    //         }
    //         else if(key<matrix[row][col]) {
    //             //move left
    //             col--;
    //         }
    //         else if(key>matrix[row][col]){
    //             //move down
    //             row++;
    //         }
    //     }
    //     System.out.println("key not in matrix ");
    //     return false;

    //starting from bottommost left cell-n-1,0

    int row=matrix.length-1,col=0;
    while(row>=0&&col<=matrix[0].length-1){
        if(key==matrix[row][col]){
            System.out.println("key found at cell (" +row +","+col +")");
                 return true;
        }
        else if(key<matrix[row][col]) {
                        //move up
                        row--;;
                    }
                    else if(key>matrix[row][col]){
                        //move right
                        col++;
                    }

    }
    System.out.println("key not in matrix ");
         return false;
    
    }

    
    
} //end of class
