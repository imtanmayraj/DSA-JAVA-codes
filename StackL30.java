import java.util.*;
public class StackL30 {
 static class Stack{
       static ArrayList<Integer>list=new ArrayList<>()  ;
       
       public static boolean isEmpty(){
        return list.size()==0;
       }
         
        //push at top
        public static void push(int data){
            list.add(data);
        }
        //pop -delete from top
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);//take last data
            list.remove(list.size()-1);//to delete
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); 
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

    
}//for class
