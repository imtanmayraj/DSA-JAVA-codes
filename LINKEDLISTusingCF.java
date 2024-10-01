import java.util.*;
public class LINKEDLISTusingCF {
    public static void main(String[] args) {
        //create--syntax just like arraylist -only use objects-Float/Integer/String class

        LinkedList<Integer> ll=new LinkedList<>();

        //add syntax 
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        

        //6-5-4-3-2-1-0
        System.out.println(ll);
        //remove syntax
        // ll.removeLast();
        // System.out.println(ll);

        // ll.removeFirst();
        // System.out.println(ll);
        // ll.head=ll.mergesort(ll.head);
        // System.out.println(ll);



    }//for main

//for mergesort on LL

public Node mergesort(Node head){
    //base case
    if(head==null || head.next==null){
        return head;
    }
    //find mid
    Node mid=getmid(head);

    //left and right mergesort
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright= mergesort(righthead);
    //merge
    merge(newleft,newright);
}

private node getmid(Node head){
    Node slow=head;
    Node fast=head.next;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //mid node
}


private Node merge(Node head1,Node head2){
    Node mergeLL=new Node(-1);
    Node temp=mergeLL;

    while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }

    while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;

    }
    while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;

    }
    return mergeLL.next; //to delte dummy node containing -1
}

}//for class
