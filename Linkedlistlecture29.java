public class Linkedlistlecture29 {
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

        Linkedlistlecture29 ll=new Linkedlistlecture29();

        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        // head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=temp; //1->2->3->2
        System.out.println(isCycle());

        removecycle();
        System.out.println(isCycle());
 }

    public static boolean isCycle(){    //floyd cycle finding algorithm
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
           slow= slow.next;
           fast=fast.next.next;

           if(slow==fast){
            return true;//cycle exists
           }
        }
        return false;//cycle doesn't exist
        
    }

    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false; 

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true; //cycle exists
                break;
            }
        }
        if(cycle==false){
            return ;
        }

        //find 2nd meeting point
        Node prev=null;
        slow=head;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle->last.next=null
        prev.next=null;

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

   
}//for class
