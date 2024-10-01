import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]={100,60,120};
        int weight[]={20,10,30};
        int totalw=50;

        double ratio[][]=new double[val.length][2];
        //0th col=>idx ;1st col =>ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];

        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1])); //will sort values in ascending order
        
        System.out.println("ratio matrix after sorting is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(ratio[i][j]+" ");
            }
            System.out.println();
        }

        int capacity=totalw;
        int finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalval+=val[idx];
                capacity-=weight[idx];
            }else{
                //include fractional item
                finalval+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("final value ="+finalval);
    }
}
