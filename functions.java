import java.util.Scanner;
import java.util.*;

public class functions {
    public static void main(String[] args) {

        // System.out.println( "enter both no.");
         
// System.out.println(isprime(56));
//prime no. in a given range

// primesinrange(45,100);
        Scanner sc=new Scanner(System.in);
        // dectobin(15);
        // bintodec(10101);
      //function overloading using parameter
    //   System.out.println(sum(3,4,5));
    //   System.out.println(sum(4,5));

      //function overloading using dattatype
    //   System.out.println(sum(4,5));
    //   System.out.println(sum(6.8f,7.4f));

// binomial coefficient
        // System.out.println("enter value of n and r");
        // int n=sc.nextInt();
        // int r=sc.nextInt();

        // int num=factorial(n);
        // int den=factorial(r)*factorial(n-r);
        // int bc=num/den;
        // System.out.println("binomial coeff off  n and r is "+bc);

        // int fact=factorial(n);
        // System.out.println("factorial of given no. is "+fact);


        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int product=multiply(a,b);
        // System.out.println("a * b ="+product);

        // sum(a,b);
        // System.out.println("sum is " +sum(a,b) );
        // average(6f,7f,9f);
      // System.out.println("whether even or not : " +isEven(13)); 
      System.out.println("enter value of n");
      int n=sc.nextInt();
    //   isPalindrome(n);
    sumdigit(n);

    }

    //homework lecture -13 
    //Q.1
    public static float average(float a,float b,float c){
        float avg= (a+b+c)/3;
        System.out.println("average of given no. is " +avg);
        return avg;
     }
//q.2 to find even or not

public static boolean isEven(int n){
    if(n%2==0){
        return true;
    }
    return false;
}

// q.3 to find whether palindrome or not

public static boolean isPalindrome(int n){
    int rev=0,lastdigit=0;
    int num=n;
    while(n>0){
    lastdigit=n%10;
    rev=rev*10+lastdigit;
    n=n/10;
    }
    if(num==rev){
        System.out.println("given no. is a palindrome");
        return true;
    }
    else{
        System.out.println("given no. is not a palindrome");
        return false;
    }
}

//Q 5 -SUM OF DIGITS OF A NO.

public static int sumdigit(int n){
    int num=n,sum=0,lastdigit=0;
    while(n>0){
        lastdigit=n%10;
        sum=sum+lastdigit;
        n=n/10;

    }
    System.out.println("sum of all digit of " +num +" is = "+sum);
return sum;
}
    //decimal to binary
    public static void dectobin(int decNum){
        int n=decNum,pow=0,rem,bin=0;
        while(n>0){
            rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("binary of " +decNum + " is = " +bin);

    }
//binary  to decimal
    public static void bintodec(int binNum){
        int n=binNum;
        int decNum=0,pow=0,lastdigit=0;
        while(n>0){
            lastdigit=n%10;
            decNum=decNum+lastdigit*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        System.out.println("decimal of " +binNum +" is = " +decNum);
    }

//prime no. in a range

public static void primesinrange(int p,int n){
    for(int i=p;i<=n;i++){
        if(isprime(i)){
            System.out.print(i + " ");
        }
    }
}
//     //prime number
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }else {
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        return false;
        }
      }
    }
      return true;
    }

// function overloading using parameter

public static int sum(int a, int b){
    return a+b;
}

public static int sum(int a, int b,int c){
    return a+b+c;
}
//function overloading using dattatype

 public static int sum(int a, int b){
     return a+b;
 }

 public static float sum(float a, float b){
    return a+b;
}

//factorial
    public static int factorial(int n){
        int prod=1,i;
        for(i=1;i<=n;i++){
            prod=prod*i;
        }
        return prod;
    }

    public static int sum(int a, int b)
    {
        int SUM=a+b;
        return SUM;

    } 

    public static int multiply(int c,int d) {
        int prod=c*d;
        return prod;
        
    }
    
}


