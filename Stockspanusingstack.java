import java.util.*;
public class Stockspanusingstack {
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];

        stockspan(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }

    }

public static void stockspan(int stocks[],int span[]){
    Stack<Integer> s=new Stack<>();
    span[0]=1;
    s.push(0);

    for(int i=1;i<stocks.length;i++){
        int currprice=stocks[i];

        while(!s.isEmpty()&&currprice>stocks[s.peek()]){
            s.pop();//to remove all leasser than curr
        }
        if(s.isEmpty()){
            span[i]=i+1; //for highest item
        }else{
            int prevhigh=s.peek();
            span[i]=i-prevhigh;
        }
        s.push(i);
    }



}
    
}//for class
