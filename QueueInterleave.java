import java.util.*;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterleave {

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // interleave(q);
        //reverse queue
        reversequeue(q);
        // print q
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }
        System.out.println(q);



    }//main fun


   public static void interleave(Queue<Integer>q){
    Queue<Integer>firsthalf=new LinkedList<>();
    int size=q.size()/2;

    for(int i=0;i<size/2;i++){
        firsthalf.add(q.remove());
    }

    while(!firsthalf.isEmpty()){
        q.add(firsthalf.remove());
        q.add(q.remove());
    }
    

   }//fun
//to reverse  a queueu using stack
   public static void reversequeue(Queue<Integer>q){

    Stack <Integer>s=new Stack<>();
    int size=q.size();

    while(!q.isEmpty()){
        s.push(q.remove());
    }
    while(!s.isEmpty()){
        q.add(s.pop());
       
    }
    

   }

    
}//for class
