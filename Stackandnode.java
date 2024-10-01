import java.util.*;
public class Stackandnode {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Stack{
        static Node head=null;

        public static boolean isEmpty(){
            return head==null;
           }

           //push at top
        public static void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
               
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;//take last data
            head=head.next;//to delete
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; 
        }


    }

    public static void main(String[] args) {
        System.out.println("hello");
        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

     }

    
}
