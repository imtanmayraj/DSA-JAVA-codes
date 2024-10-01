import java.util.*;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        
        //question 1

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a,b,c,avg=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        avg=(a+b+c)/3;
        System.out.println("average is =");
        System.out.println(avg);



    }
    
    
}
