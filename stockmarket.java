import java.util.Scanner;
import java.util.*;
public class stockmarket {
    public static void main(String[] args) {
        // int prices[]={7,1,5,3,6,4};
        int prices[]={7,6,4,3,1};
        System.out.println("maximum profit can be :" +stocks(prices));
    }
    

    public static int stocks(int prices[]){
        int n=prices.length;
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<n;i++){
            //check today's price with bp
            if (bp<prices[i]){
                //calculate profit
                int todayprofit=prices[i]-bp;
                maxprofit=Math.max(todayprofit,maxprofit);
            }
            else{
                bp=prices[i];
            }
        }
        return maxprofit;

    }
}
