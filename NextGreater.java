import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ng[]=new int[arr.length];

        // nextgreater(arr,ng);

       
       
        //mam code--using idx instead of value
        Stack<Integer>s=new Stack<>();
        //for right gretaer . for left i=0 to n-1
    for(int i=arr.length-1;i>=0;i--){
        //while loop
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ng[i]=-1;
        }else{
            ng[i]=arr[s.peek()];
        }

        s.push(i);
    }

        for(int i=0;i<ng.length;i++){
            System.out.print(ng[i]+" ");
        }


    }
//my code--correct output
    public static void nextgreater(int arr[],int ng[]){
        Stack<Integer>s=new Stack<>();
        
    for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && s.peek()<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ng[i]=-1;
        }else{
            ng[i]=s.peek();
        }

        s.push(arr[i]);
    }
    }
}//for class
