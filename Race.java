import java.util.*;
public class Race {
    


public static void main(String[] args){
  //input n1speed,n2, distance x
  Scanner sc=new Scanner(System.in);
  System.out.println("enter speed1");
  int n1=sc.nextInt();
//   System.out.println();
System.out.println("enter speed2");
   int n2=sc.nextInt();
//   System.out.println();
System.out.println("enter dist diff");
   int x=sc.nextInt();
  int time=0;
  
  if(n1>n2){
    time=-1;
    System.out.println(time);
  }
  
    
    int diff=n2-n1;
    time=diff/x;
    time+=1;
     System.out.println(time);
    
  
}
}

    

