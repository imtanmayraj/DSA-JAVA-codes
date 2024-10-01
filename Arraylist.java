import java.util.*;
public class Arraylist {
    public static void main(String[] args) {

        // ArrayList<Integer>list=new ArrayList<>();
        // ArrayList<String>list2=new ArrayList<>();
        // ArrayList<Boolean>list3=new ArrayList<>();

        // list.add(1);//T.C=O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // System.out.println(list);

        //get operation=O(1)

        // int a=list.get(2);
        // System.out.println(a);
        

        // //delete

        // // list.remove(2);
        // // System.out.println(list);

        // //set
        // list.set(2,10);
        // System.out.println(list);

        // //contains
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(8));

        //add no.  a index

        // list.add(1,9);
        // System.out.println(list);

        //size of list
        // System.out.println(list.size());

        //reverse of a list-print

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }

        // list.add(2);//T.C=O(1)
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // System.out.println(list);

        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(max<list.get(i)){
        //     //     max=list.get(i);
        //     // }
        //     max=Math.max(max, list.get(i));
           
        // }
        // System.out.println("maximum elemnt is :"+max);

        // int idx1=1,idx2=3;
        // swap(list,idx1,idx2);

        // System.out.println("after swapping"+list);

        // Collections.sort(list);
        // System.out.println("after soring inc order:"+list);

        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println("sorting in dec order :"+list);

    //     ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

    //     ArrayList<Integer>list=new ArrayList<>();
    //     list.add(4);list.add(5);

    //     ArrayList<Integer>list2=new ArrayList<>();
    //     list2.add(3);list2.add(8);

    //     mainlist.add(list);
    //     mainlist.add(list2);

    //     System.out.println(mainlist);

        // for(int i=0;i<mainlist.size();i++){
        //     ArrayList<Integer>currlist=mainlist.get(i);

        //     for(int j=0;j<currlist.size();j++){
        //         System.out.print(currlist.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        

        
    // }
    // public static void swap(ArrayList<Integer>list,int idx1,int idx2){
    //     int temp;
    //     temp=list.get(idx1);
    //     list.set(idx1,list.get(idx2));
    //     list.set(idx2,temp);



    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    ArrayList<Integer>list3=new ArrayList<>();

    for(int i=1;i<=5;i++){
        list1.add(i*1); //1,2,3,4,5
        list2.add(i*2); //2,4,6,8,10
        list3.add(i*3); //3/6/9/12/15
    }

    ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

    mainlist.add(list1);
    mainlist.add(list2);
    mainlist.add(list3);

    System.out.println(mainlist);

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer>currlist=mainlist.get(i);

        for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }


  

}//main fun
}//for class
