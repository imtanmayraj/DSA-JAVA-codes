import java.util.*;
public class Backtracking {
    static int count=0;
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changearr(arr,0,1);
        // printarr(arr);

        // String str="abc";
        // String ans="";

        // findsubset(str, ans,0);

        // permutation(str, ans);

        //for nqueens function
        // int n=4;
        // char board[][]=new char[n][n];
        // //inititalsize
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='x';
        //     }
        // }
        // nQueens(board,0);
        // System.out.println("total no. of ways psbl= :"+count);

        int n=3,m=3;
        System.out.println("total no. of ways :"+gridways(0,0,n,m));
    }

    public static int gridways(int i,int j,int n,int m){
        //base case
        //1. last cell condition
        if(i==n-1 && j==m-1){
            return 1;
        }
        //boundary crossing condition
        else if(i==n || j==n){
            return 0;
        }
         //way 1 -if move down
        int w1=gridways(i+1, j, n, m);
        //way 2 -if move right
        int w2=gridways(i, j+1, n, m);

        //total ways=w1+w2
        return w1+w2;
    }

    public static void nQueens(char board[][],int row){

        //base case
        if(row==board.length){
            count++;
            printboard(board);
            return;
        }
        //recursion function
        //for same row,difft column
        for(int j=0;j<board.length;j++){
            //check safety before placing queen --vertical up,left/right diagonal up
            if(issafe(board,row,j)){
                board[row][j]='Q';  //place Queen
              nQueens(board, row+1);//function call
              //to remove queen after backtracking
              board[row][j]='x';
            }
        }
    }


    public static boolean issafe(char board[][],int row,int col){

        //check afety in vertical up --col same ,row changes i to 0

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
            {
                return false;
            }
            
        }
        //check afety in diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')
            {
                return false;
            }
            
        }


        //check afety in diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
             if(board[i][j]=='Q')
            {
                return false;
            }
        
        }
        return true;
    }



    public static void printboard(char board[][]){
        System.out.println("-------CHESS BOARD---NEW WAY TO PLACE QUEEN-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void permutation(String str,String ans){

        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=>"ab"+"cd"="abcd"
            String newstr=str.substring(0, i)+str.substring(i+1); //removing ith char

            permutation(newstr, ans+curr);
        }

    }
    
    public static void findsubset(String str,String ans,int i){
        //base case
        if(i==str.length()){
            //for no choice by all
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }


        //recursion
        //yes choice
        findsubset(str, ans+str.charAt(i), i+1);

        //no choice
        findsubset(str, ans, i+1);
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return;
        }

        //recursion
        arr[i]=val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }

}
