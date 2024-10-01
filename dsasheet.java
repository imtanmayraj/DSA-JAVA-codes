import java.util.Scanner;
import java.util.*;
public class dsasheet {
    
    public static void main(String[] args) {
        // int height[]={4,2,0,6,3,2,5};
        // int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int height[]={4,2,0,3,2,5};
        int volume=trappedwater(height);
        System.out.println("total volume of water trapped ="+volume);
    }
// mam code Q.22
    public static int trappedwater(int height[]){
        int n=height.length;

        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            
        }System.out.println("leftmax array is ");
        for(int i=0;i<n;i++){
            System.out.print(leftmax[i]+" ");
        }
        System.out.println();
        

        //calculate rightmax array
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){

          rightmax[i]=Math.max(height[i],rightmax[i+1]); 
            
        }
        System.out.println("rightmax array is ");
        for(int i=0;i<n;i++){
            System.out.print(rightmax[i] +" ");
        }
        System.out.println();

        int tw=0,waterlevel=0;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            tw=tw+(waterlevel-height[i]);
        
        }
return tw;
    }
}
