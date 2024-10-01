import java.util.*;
public class LOOP {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        //  WHILE LOOP

        // int i=1;
        // while(i<10){
        //     System.out.println("hello brooo");
        //     i++;
        // }

        // print numbers 1-10 using while loop
        // int i=1;
        // while(i<=10){
        //     System.out.print(i + " ");
        //     i++;
        // }
 // print numbers 1-n using while loop


//  System.out.println("enter value of n");
//  int n=ab.nextInt();
//  int i=1;
//  while(i<=n){
//     System.out.print(i + " ");
//     i++;
//  }

//sum of first n natural number

// FOR LOOP
//PRINT 1-N 
// System.out.println("enter value of n");
// int n=ab.nextInt();
// for(int i=0;i<n;i++){
//     System.out.println("hello broooo");
// }

// print square pattern
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=4;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=1;i<=4;i++){
//     System.out.println("****");
// }
// int i=1;
// while(i<=4){
//     System.out.println("****");
//     i++;
// }

//REVERSE OF A NUMBER
// System.out.println("enter the number");
// int n=ab.nextInt();

// int lastdigit=0,reverse=0;
// while(n>0){
//     lastdigit=n%10;
//     System.out.print(lastdigit);
//     n=n/10;
// }

// while(n>0){
//     lastdigit=n%10;
//     reverse=reverse*10+lastdigit;
//     n=n/10;
// }
// System.out.println("reverse no. is " +reverse);

//using do-while  loop
// int i=1;
// do{
//     System.out.println("hello tanmay");
//     i++;
// }while(i<=10);

//keep printing till user enters a multiple of 10

// do{
//     System.out.println("enter any number");
//     int n=ab.nextInt();
//     if(n%10==0){
//         break;
//     }
// }while(true);
//     System.out.println("coming out of loop");

//CONTINUE 

// for(int i=1;i<=10;i++){
//     if(i==3){
//         continue;
//     }
//     System.out.println(i);
// }

//display all numbers except multiple of 10
// do{
//         System.out.print("enter the number :");
//         int n=ab.nextInt();
//         if(n%10==0){
//             continue;
//         }
//         System.out.println(n);
//     }while(true);

//check if number is prime or not

// System.out.println("enter any number");
// int n=ab.nextInt();
// boolean isprime= true;
// if(n==2){
//     System.out.println("given no. is prime");
// }
// else{


// for(int i=2;i<n;i++){
//     if (n%i==0){
//         isprime=false;
//     }
// }

// if(isprime==true){
//     System.out.println("given no. is prime");
// }
// else{
//     System.out.println("not a prime no.");
// }
        
// }
// optimization

System.out.println("enter any number");
int n=ab.nextInt();
boolean isprime= true;
if(n==2){
    System.out.println("given no. is prime");
}
else{

//math.sqrt from util package
for(int i=2;i<=Math.sqrt(n);i++){
    if (n%i==0){
        isprime=false;
    }
}

if(isprime==true){
    System.out.println("given no. is prime");
}
else{
    System.out.println("not a prime no.");
}
        
}
}
}
