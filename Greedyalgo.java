import java.util.*;
public class Greedyalgo {
    public static void main(String[] args) {
        int starttime[]={1,3,0,5,8,5};
        int endtime[]={2,4,6,7,9,9};

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();

        //always choose 1st activity
        maxAct=1;
        ans.add(0);
        int lastEnd=endtime[0];

        for(int i=1;i<endtime.length;i++){
            if(starttime[i]>=lastEnd){
                //select activity
                maxAct++;
                ans.add(i);
                lastEnd=endtime[i];
            }
        }

        System.out.println("maximum no. of activity = "+maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        // System.out.println();

    }
}
