import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
     
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=1;i<=6;i++)
        list.add(i);

    //    int target=12;
    //    if(pairsum(list,target)){
    //     System.out.println("pair exist");
    //    }else{
    //     System.out.println("pair doesn't exist");
    //    }

    //for rotated array

    list1.add(11);
    list1.add(15);
    list1.add(6);
    list1.add(8);
    list1.add(9);
    list1.add(10);

    int target=16;
    if(rotatedsum(list1,target)){
        System.out.println("pair exist");
       }else{
        System.out.println("pair doesn't exist");
       }


    }//for main fun

    public static boolean pairsum(ArrayList<Integer>list,int target){
        int lp=0,rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target)
            return true;

            else if (list.get(lp)+list.get(rp)>target)
               rp--;

               else if (list.get(lp)+list.get(rp)<target)
               lp++;
            
        }
        return false;
    }

    public static boolean rotatedsum(ArrayList<Integer>list,int target){
        int n=list.size();
        int bp=-1;//breaking point
        //to find breaking point
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }


        int lp=bp+1,rp=bp;
        
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target)
            return true;

            else if (list.get(lp)+list.get(rp)>target)
               rp=(rp-1+n)%n;

               else if (list.get(lp)+list.get(rp)<target)
               lp=(lp+1)%n;
            
        }
        return false;
    }

    
}//for class
