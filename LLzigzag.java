public class LLzigzag {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        System.out.println("hello");

        LLzigzag ll=new  LLzigzag ();

       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();

        ll.zigzag();
        ll.print();

    }



    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // public Node mergesort(Node head){
    //     //base case
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     //find mid
    //     Node mid=getmid(head);
    
    //     //left and right mergesort
    //     Node righthead=mid.next;
    //     mid.next=null;
    //     Node newleft=mergesort(head);
    //     Node newright= mergesort(righthead);
    //     //merge
    //     merge(newleft,newright)
    // }
    
    // private Node getmid(Node head){
    //     Node slow=head;
    //     Node fast=head.next;
    
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow; //mid node
    // }
    
    
    // private Node merge(Node head1,Node head2){
    //     Node mergeLL=new Node(-1);
    //     Node temp=mergeLL;
    
    //     while(head1!=null && head2!=null){
    //         if(head1.data<=head2.data){
    //             temp.next=head1;
    //             head1=head1.next;
    //             temp=temp.next;
    //         }else{
    //             temp.next=head2;
    //             head2=head2.next;
    //             temp=temp.next;
    //         }
    //     }
    
    //     while(head1!=null){
    //         temp.next=head1;
    //         head1=head1.next;
    //         temp=temp.next;
    
    //     }
    //     while(head2!=null){
    //         temp.next=head2;
    //         head2=head2.next;
    //         temp=temp.next;
    
    //     }
    //     return mergeLL.next; //to delete dummy node containing -1
    // }

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alt merge -zig-zag merge

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    
    public void addFirst(int data){
        //step 1:create new node
        Node newnode=new Node(data);
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

public void addLast(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
}
   
}//for class
