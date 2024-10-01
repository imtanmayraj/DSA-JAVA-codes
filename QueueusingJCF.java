import java.util.*;
public class QueueusingJCF {
    public static void main(String[] args) {
        //Queue is an interface so objects of Q can't be made --
        // only implemented by classes ArrayDequeue or LinkedList
       
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
