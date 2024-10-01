import java.util.*;
import java.util.Scanner;
public class opeartionsonbits {
    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println((6>>1));

        // oddoreven(7);
        // oddoreven(64);

        // System.out.println(getithbit(15,2));

        // System.out.println(setithbit(10,2));

        // System.out.println(clearithbit(10,1));
        // System.out.println(updatebit(10,1,0));

        // System.out.println(clearibits(15,2));

        // System.out.println(clearbitsinrange(10,2,4));

        // System.out.println(ispoweroftwo(13));

        // System.out.println("no. of bits in given no. is : "+countbits(28));

        System.out.println(fastexponent(3,5));
    }

    public static void printBinary(int n) {
        if (n > 1) {
            printBinary(n / 2);
        }
        System.out.print(n % 2);
    }
//find no. is odd or even
    public static void oddoreven(int n){
        int bitmask=1;

        if ((bitmask & n)==0) {
            System.out.println("even number");    
        }
        else{
            System.out.println("odd number");
        }
    }
//get ith bit
    public static int getithbit(int n,int i){
        int bitmask=1<<i;

        if((bitmask&n)==0){
            return 0;

        }else{
            return 1;
        }
    }
//set ith bit
    public static int setithbit(int n,int i){
        int bitmask=1<<i;

        return(n|bitmask);
    }
//clear ith bit
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);

        return(n&bitmask);
    }

    public static int updatebit(int n,int i,int newbit){
        if(newbit==0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }
    }
    

    //clear last i bit
    public static int clearibits(int n,int i){
        int bitmask=~(0)<<i;

        return(n&bitmask);
    }

    public static int clearbitsinrange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;

        int bitmask=a|b;
        return(bitmask & n);
    }
//to check even if number is power of 2
    public static boolean ispoweroftwo(int n){
        return((n & n-1)==0);
    }
//to count no. of bits in a number

public static int countbits(int n){
     int count=0;

     while(n>0){
        //to check lsb is 1 or not
        if((n&1)!=0){ 
            count ++;

        }
        n=n>>1;
     }
     return count;
}

public static int fastexponent(int a,int n){
    int ans=1;
    while(n>0){
        //check lsb 
        if((n&1)!=0){
            ans=ans*a;

        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}

}
