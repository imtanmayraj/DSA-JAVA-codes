import java.util.*;


public class Watertanker{
    public static int maxwater=0;
    public static void main(String[] args) {
        
      

        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        
        // System.out.println("max water can be contained = "+Storewater(height));

        System.out.println("max water can be contained = "+Storewater2(height));

}//main fun

//brute force approach
public static int Storewater(ArrayList<Integer>height){

    int n=height.size();
        int width,ht,water;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ht=Math.min(height.get(i), height.get(j));

                width=(j-i);

                water=ht*width;//current water

                maxwater=Math.max(water, maxwater);
            }
        }
return maxwater;

}

public static int Storewater2(ArrayList<Integer>height){
    int n=height.size();
    int width,ht,water;
    int lp=0,rp=n-1;

    while(lp<rp){
        ht=Math.min(height.get(lp), height.get(rp));

        width=(rp-lp);

        water=ht*width;

        maxwater=Math.max(water, maxwater);

        if(height.get(lp)<height.get(rp)){
            lp++; //lp ht is less
        }else{
            rp--;
        }
    }

    return maxwater;

}

}//class






  // int height[]={1,8,6,2,5,4,8,3,7};
        // int n=height.length;
        // int width,ht,water;

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         ht=Math.min(height[i], height[j]);

        //         width=(j-i);

        //         water=ht*width;

//         //         maxwater=Math.max(water, maxwater);
            //     }
        // }