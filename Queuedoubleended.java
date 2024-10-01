import java.util.*;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;
public class Queuedoubleended {
    public static void main(String[] args) {
        Deque <Integer>dq=new LinkedList<>();

        dq.addFirst(1);//1
        dq.addFirst(2);//2 1
        dq.addFirst(3);//3 2 1

        dq.addLast(4);
        dq.addLast(5);

        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        System.out.println("first element is "+dq.getFirst());
        System.out.println("last element is "+dq.getLast());
    }
    }
    

