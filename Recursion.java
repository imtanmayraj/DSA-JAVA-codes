import java.util.*;
public class Recursion{
    public static void main(String args[]) {
        // int n=11;
        // printdec(n);
        // printinc(n);
        // System.out.println("factorial of n is =" +factorial(n));
        // System.out.println("sum of first n natural no. is = "+sumtilln(n) );
        // System.out.println("number n in fibonacci series is  "+fibonacci(n));
        
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // int n=arr.length;
        // System.out.println(issorted(arr,0));
        // System.out.println("key fount at index : "+firstoccurence(arr,5,0));
        // System.out.println("key fount at index : "+lastoccurence(arr,5,0));

        // System.out.println(power(2,10));
        // System.out.println(optimizedpower(2,10));

        // System.out.println(tilingproblem(5));
        System.out.println("check");

    }

    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" , ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ,");
            return;
        }
        printinc(n-1);
        System.out.print(n +" , ");
        
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        return(n*factorial(n-1));
    }

    public static int sumtilln(int n){
        if(n==1){
            return 1;
        }

        return(n+sumtilln(n-1));
    }

    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return(fibonacci(n-1)+fibonacci(n-2));
    }

    public static boolean issorted(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return(issorted(arr,i+1));
    }

    public static int firstoccurence(int arr[],int key,int i){
       int n=arr.length;
        if(key==arr[i]){
            return i;
        }
        if(i==n-1){
            return -1;
        }
        return(firstoccurence(arr,key,i+1));
    }

    //my code starting with n and then going to 0
    // public static int lastoccurence(int arr[],int key,int i){
        
    //     if(key==arr[i]){
    //         return i;
    //     }
    //     if(i==0){
    //         return -1;
    //     }
    //     return(firstoccurence(arr,key,i-1));
    // }

    //mam code
    public static int lastoccurence(int arr[],int key,int i){
        int n=arr.length;
        if(i==n){
            return -1;
        }
        int isfound=lastoccurence(arr, key, i+1);

        if(isfound==-1 && arr[i]==key){
            return i;
        }
         return isfound;
         
        
        }

        public static int power(int x,int n){
            if(n==0){
                return 1;
            }
            return(x*power(x,n-1));
        }
// optimized code of O(logn) to calculate power of x 
        public static int optimizedpower(iny a,int n){
            if(n==0){
                return 1;
            }
            //if n is even
            int halfpower=optimizedpower(a,n/2);
            int halfpowersq= halfpower*halfpower;

            // if n is odd
            if((n%2)!=0){
                halfpowersq=a*halfpowersq;
            }
            return halfpowersq;


        }


        public static int tilingproblem(int n){
            if(n==0||n==1){
                return 1;
            }

            // /vertical choice

            int fnm1=tilingproblem(n-1);

            //horizontal line

            int fnm2=tilingproblem(n-2);
            int totalways=fnm1+fnm2;

            return totalways;
        }
}
