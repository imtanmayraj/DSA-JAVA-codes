import java.util.Scanner;
import java.util.*;

public class array {
    public static void main(String args[]) {

        // int marks[]=new int[50];

        // int numbers[]={1,2,3};
        // int morenumbers[]={4,5,6};
        // String fruits[]={"apple","banana","orange"};

        Scanner sc=new Scanner(System.in);
        //input
        // System.out.println("enter marks of all subjects");
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // //print
        // System.out.println("physics "+marks[0]);
        // System.out.println("chemistry "+marks[1]);
        // System.out.println("math "+marks[2]);

        //update value
        // marks[2]=100;
        // marks[2]+=5;
        // System.out.println("math updated marks "+marks[2]);

        // int percentage=(marks[0]+marks[1]+marks[2])/3;
        // System.out.println("percentage scored = "+percentage);

        // System.out.println("length of array ="+marks.length);
        
    //   int marks[]={97,98,99};
    //   update(marks);
    //   System.out.println("updated marks are");
    //   for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]+" ");
    //   }
// int numbers[]={2,4,6,8,10,12,14,16};
// int key=20;
// // int index=linearsearch(numbers,key);
// String menu[]={"burger","pizza","samosa","dosa","biryani"};
// String item="dosa";
// // int index=menusearch(menu,item);
// if(index==-1){
//     System.out.println("not found ");
// }else{
//     System.out.println("found at index :"+index);
// }

//binarysearch
// int numbers[]={2,4,6,8,10,12,14,16};
// int key=10;
//  int index=binarysearch(numbers,key);
 
//  if(index==-1){
//       System.out.println("not found ");
//  }else{
//      System.out.println("found at index :"+index);
//  }
// int numbers[]={1,2,6,3,5};
// largest(numbers);

// int numbers[]={2,4,6,8,10,12,14,16};
// reverse(numbers);

// int numbers[]={2,4,6,8,10};
// printpairs(numbers);
// subarray(numbers);
// int numbers[]={1,-2,6,-1,3};
int numbers[]={-2,-3,-4,-2,-5,-3};
//  maxsubarray2(numbers); 
// prefixsubarray(numbers); 
kadanes(numbers);

}

public static void kadanes(int numbers[]){
    int cs=0,ms=0;
    for(int i=0;i<numbers.length;i++){
        cs=cs+numbers[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
        //for all -ve numbers
        if(ms==0){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(max<numbers[i]){
                    max=numbers[i];
                }
            }
           ms=max;
        }
    
    System.out.println("maximum sum of subarray is "+ms);
} 


public static void prefixsubarray(int numbers[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[numbers.length];
    prefix[0]=numbers[0];

    for(int i=1;i<prefix.length;i++)
    {
      prefix[i]=prefix[i-1]+numbers[i];
    }
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            
            if(start==0){
                currsum=prefix[end];
            }else{
                currsum=prefix[end]-prefix[start-1];
            }
            // System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        // System.out.println();
    }
   System.out.println("maximum sum is ="+maxsum);
}
//printing subarray
public static void subarray(int numbers[]){
    int tp=0;
    int sum[]=new int[5];
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
                tp++;
                sum[i]+=numbers[k];
            }
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total no. of pairs =" +tp);
    System.out.println();
    for(int i=0;i<sum.length;i++){
    System.out.println("sum of "+i +" subarray is " +sum[i]);
    System.out.println();
    }
    largest(sum);
}
//my code
public static void maxsubarray(int numbers[]){
    int tp=0;
    int sum[]=new int[5];
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                // System.out.print(numbers[k]+" ");
                tp++;
                sum[i]+=numbers[k];
            }
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total no. of pairs =" +tp);
    for(int i=0;i<sum.length;i++){
    System.out.println("sum of "+i +" subarray is " +sum[i]);
    }
    largest(sum);
}

//mam code
public static void maxsubarray2(int numbers[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            currsum=0;
            for(int k=start;k<=end;k++){
                // System.out.print(numbers[k]+" ");
               
                currsum+=numbers[k];
            }
            System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        System.out.println();
    }
   System.out.println("maximum sum is ="+maxsum);
}

// pairing of array
public static void printpairs(int numbers[]){
    int tp=0;
    for(int i=0;i<numbers.length;i++){
    int curr=numbers[i];
    for(int j=i+1;j<numbers.length;j++){
        System.out.print("("+curr+","+numbers[j]+")");
    tp++;
    }
    System.out.println();
    }
    System.out.println("total no. of pairs ="+tp);

}

// reversing the array

public static void reverse(int numbers[]){
    int first=0,last=numbers.length-1;
    while(first<last){
        //swap
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;

        first++;
        last--;
    }
    System.out.println("reverse array is :");
    for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
}
// public static void update(int marks[]){
//     for(int i=0;i<marks.length;i++){
//         marks[i]+=1;
//       }
// }

//binary search
public static int binarysearch(int numbers[],int key){
    int start=0,end=numbers.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }else if(key>numbers[mid]){
            //rightshift
            start=mid+1;
        }else{
            //leftshift
            end=mid-1;
        }
    }
    return -1;
} 
//linear search
public static int linearsearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
        return i;
        }
    }
    return -1;
}

//menusearch -linear
public static int menusearch(String menu[],String item){
    for(int i=0;i<menu.length;i++){
        if(menu[i]==item){
        return i;
        }
    }
    return -1;
}

//largest number
public static void largest(int numbers[]){
    int indexl=0,indexs=0;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>max){
        max=numbers[i];
        indexl=i;
        }
    }
    System.out.println("largest number is :"+max);
    System.out.println();
    //  System.out.println("largest subarray is :"+indexl);
    //  System.out.println();

    for(int i=0;i<numbers.length;i++){
        if(numbers[i]<min){
        min=numbers[i];
        indexs=i;
        }
    }
    System.out.println("smallest number is :"+min);
    // System.out.println();
    // System.out.println("smallest subarray is :"+indexs);
}

}
