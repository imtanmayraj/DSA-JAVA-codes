import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Greedyjobdeadline {
    static class Job{
        int deadline;
        int profit;
        int id; //0(A),1(B)

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }

    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}}; //{deadline,profit}
        int n=jobinfo.length;
        
        ArrayList<Job>jobs=new ArrayList<>();

        for(int i=0;i<n;i++){
            jobs.add(new Job(i,jobinfo[i][0],jobinfo[i][1]));
        }
        //for ascending order
        //Collections.sort(jobs,(obj1,obj2)->obj1.profit-obj2.profit);
        
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //descending order of profit

        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;

        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
    
        System.out.println("max jobs ="+seq.size());

        for(int i=0;i<seq.size();i++){
            System.out.print("job"+seq.get(i)+ "  ");
        }
        System.out.println();
    }
    
}
