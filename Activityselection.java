import java.util.*;
public class Activityselection {
    public static void main(String[] args) {

        int starttime[]={1,3,0,5,8,5};
        int endtime[]={2,4,6,7,9,9};

        //if ending time is not sorted

        //to sort endtime if not sorted
        int activities[][]=new int[starttime.length][3]; //2d array of 3 col 
        for(int i=0;i<starttime.length;i++){
            activities[i][0]=i; //to store index value in 1st col
            activities[i][1]=starttime[i];//to store starttime
            activities[i][2]=endtime[i];//to store endtime

        }
        //lambda function --Comparator.comparingDouble(o->o[2])
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2])); //to sort endtime

          //end time basis sorted
          int maxAct=0;
          ArrayList<Integer>ans=new ArrayList<>();
  
          //always choose 1st activity
          maxAct=1;
          ans.add(activities[0][0]);
          int lastEnd=activities[0][2];
  
          for(int i=1;i<endtime.length;i++){
              if(activities[i][1]>=lastEnd){
                  //select activity
                  maxAct++;
                  ans.add(activities[i][0]);
                  lastEnd=activities[i][2];
              }
          }
  
          System.out.println("maximum no. of activity = "+maxAct);
  
          for(int i=0;i<ans.size();i++){
              System.out.print("A"+ans.get(i)+" ");
          }
    }
    
}
