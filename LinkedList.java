import java.util.*;
public class LinkedList{

    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        // ll.head=new node(1);
        // ll.head.next=new node(2);

    // ll.addfirst(1);
    
    // ll.addfirst(2);

    // ll.addlast(3);
    // ll.addlast(4);
    // ll.addlast(5);
    // ll.addlast(4);
    // ll.addlast(3);
    
    // ll.add(2,9);
    // ll.print();

    // ll.removefirst();
    // ll.print();

    // ll.removelast();
    // ll.print();

    // System.out.println("key found at index :" +ll.linearsearch(3));
    // System.out.println("key found at index :" +ll.linearsearch(11));

    // System.out.println("key found at index :" +ll.recursivesearch(3));
    // System.out.println("key found at index :" +ll.recursivesearch(11));

    // ll.reverse();

    // ll.deletenthfromend(3);
    // ll.print();

    // System.out.println(ll.checkPalindrome());
 }
    //add
    //remove
    //print
    //search

//methods 
    public void addfirst(int data){
        //step 1:create new node
        node newnode=new node(data);
        size++;
        //for empty LL
        if(head==null){
            head=tail=newnode;
            return;
        }
        
        //step 2: newnode.next=head
        newnode.next=head;

        //step 3 -head=newnode
        head=newnode;
    }

public void addlast(int data){
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
}
   
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
public void add(int idx,int data){
    if(idx==0){
        addfirst(data);
        return;
    }
    node newnode=new node(data);
    size++;
    node temp=head;
    int i=0;

    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    //when i=idx-1; temp->prev
    newnode.next=temp.next;
    temp.next=newnode;
}
public int removefirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int value=head.data;
        head=tail=null;
        return value;
        // size=0;
    }
    
    int value=head.data;
    head=head.next;
    size--;
    return value;
}

public int removelast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int value=head.data;
        head=tail=null;
        return value;
        
    }
    //prev node=size-2
    node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }

    int value=prev.next.data; //tail data
    prev.next=null;
    tail=prev;
    size--;
    return value;
}

public int linearsearch(int key){
    node temp=head;
    int i=0;

    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    //key not found
    return -1;
}
public int recursivesearch(int key){
    return helper(head,key);

}
public int helper(node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}

//reverse a linked list

public void reverse(){
    node prev=null;
    node curr=tail=head;
    node next;

    while(curr!=null){
        //step 1
        next=curr.next;

        //step 2
        curr.next=prev;

        //step 3
        prev=curr;

        //step 4
        curr=next;
    }
    //update head node
    head=prev;

}

public static void deletenthfromend(int n){
    //calculate size of LL
    int sz=0;
    node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    //if asked to delete  head
    if(n==sz){
        head=head.next;//same as remove first    
        return;
    }
    int i=1;
    int idxtofind=sz-n;
    node prev=head;

    while(i<idxtofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}

public node findmid(node head){  //helper function
    //slow-fast approach

    node slow=head;
    node fast=head;

    while(fast!=null && fast.next!=null){
    slow=slow.next;//+1
    fast=fast.next.next;//+2
    }
    return slow; //slow is my middle node
}

public boolean checkPalindrome(){
    //base case
    if(head==null||head.next==null){
        return true;

    }
    //step-1 :find the mid
    node midnode=findmid(head);

    //step-2:reverse the 2nd half-3var 4step
    node prev=null; //mistake by me
    node curr=midnode; //only 1 change
    node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    node right=prev;//right half head
    node left=head;


    //step 3:check left half and right half

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;

    }
    return true;
}

public Node mergesort(node head){
    //base case
    if(head==null || head.next==null){
        return head;
    }
    //find mid
    node mid=getmid(head);

    //left and right mergesort
    node righthead=mid.next;
    mid.next=null;
    node newleft=mergesort(head);
    node newright= mergesort(righthead);
    //merge
    merge(newleft,newright);
}

public node getmid(node head){
    node slow=head;
    node fast=head.next;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //mid node
}


private node merge(node head1,node head2){
    node mergeLL=new node(-1);
    node temp=mergeLL;

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
