import java.util.*;
public class homework {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        //lecture 10 homework

        // 1. positive or negative
        // int a;
        // System.out.println("enter any number :");
        // a=ab.nextInt();

        // if(a>0){
        //     System.out.println("positive number");
        // }
        // else if(a<0) {
        //     System.out.println("negative number");

        // }
        // else{
        //     System.out.println("zero");
        // }

// 2. fever

// System.out.println("enter body temperature");
// double t=ab.nextDouble();

// if(t>100){
//     System.out.println("you have fever");
// }
// else{
//     System.out.println("you don't have fever");
// }


// 3. week name and number

// System.out.println("enter day number :");
// int a=ab.nextInt();

// switch(a){
//     case 1 : System.out.println("monday");
//     break;
//     case 2 : System.out.println("tuesday");
//     break;
//     case 3 : System.out.println("wednesday");
//     break;
//     case 4 : System.out.println("thursday");
//     break;
//     case 5 : System.out.println("friday");
//     break;
//     case 6 : System.out.println("saturday");
//     break;
//     case 7 : System.out.println("sunday");
//     break;
//     default : System.out.println("wrong input");
    


// }


// 4 .output

// int a=63,b=36;
// boolean x=(a<b)?true:false;
// int y=(a>b)?a:b;

// System.out.println(x);
// System.out.println(y);
//  



// 5. leap year
int year;
System.out.println("enter year");
year=ab.nextInt();

if((year%400==0) || (year%4==0 && year%100!=0) ){
    System.out.println("year is leap year");
}

else{
    System.out.println("not a leap year");
}


}
    
}