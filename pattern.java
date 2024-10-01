import java.util.Scanner;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
       // hollow_rectangle(4,5);
    //    rotated_pyramid(4,4);
    // number_pyramid (7);
    //  floyd_triangle(5); 
    // zeroone_triangle(5); 
    // butterfly(4);
    // rhombus(5);
    // hollow_rhombus(5);
    diamond(4);
}

//     public static void  hollow_rectangle(int rows,int cols){
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=cols;j++){
//                 if(i==1 || i==rows || j==1 || j==cols){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                

//             }
//             System.out.println();
//         }
//     }
//     public static void rotated_pyramid (int rows,int cols){
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=cols;j++){
//                 if(j>(cols-i)){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void number_pyramid (int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j +" ");
                
//             }
//             // for(int j=1;j<=i-1;j++){
//             //     System.out.print(" ");
//             // }
//             System.out.println();
//         }
//     }
// public static void floyd_triangle(int n){
//     int num=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print( num+" ");
//             num++;
            
//        }
//        System.out.println();
//     }

//     public static void zeroone_triangle(int n){
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
                
                
//            }
//            System.out.println();
//         }

    



//  public static void  butterfly(int n){
    
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++)
//               { //to print i times *
//                     System.out.print("*");
//                 }
//                 //my code
//                 for(int j=1;j<=2*(n-i);j++)
//                     {
//                         System.out.print(" ");
//                     }
//                     for(int j=1;j<=i;j++)
//               { //to print i times *
//                     System.out.print("*");
//                 }
                    
               
//                 System.out.println();

//             }

//             // for 2nd half
//             for(int i=n;i>=1;i--){
//                 for(int j=1;j<=i;j++)
//                   { //to print i times *
//                         System.out.print("*");
//                     }
//                     //my code
//                     for(int j=1;j<=2*(n-i);j++)
//                         {
//                             System.out.print(" ");
//                         }
//                         for(int j=1;j<=i;j++)
//                   { //to print i times *
//                         System.out.print("*");
//                     }
                        
                   
//                     System.out.println();
    
//                 }
    
//             }




//solid rhombus

public static void rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
System.out.println();
    }
}


//hollow rhombus
public static void hollow_rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
        if(i==1 || i==n || j==1 || j==n){
        
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }

    
System.out.println();
    }
}


//diamond
public static void diamond(int n)
{
    //for 1st half
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //for 2nd half
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}


        }
    
