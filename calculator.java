import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        //calculator using switch
        System.out.println("enter a:");
        
        int a=ab.nextInt();
        System.out.println("enter b :");
        int b=ab.nextInt();
        int result=0;
        System.out.println("enter operator sign :");
        char operator=ab.next().charAt(0);

        switch(operator){
            case '+':result=a+b;
            break;

            case '-':result=a-b;
            break;

            case '*':result=a*b;
            break;

            case '/':result=a/b;
            break;

            case '%':result=a%b;
            break;

            default:System.out.println("wrong sign entered");
        }
        System.out.println("result is " +result);
    }
    
}
