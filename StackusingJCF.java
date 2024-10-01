import java.util.*;
public class StackusingJCF {

    public static void main(String[] args) {

        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //to push an integer at bottom of stack
        // pushAtBottom(s,4);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
//reverse string using stack
        // String str="hello world";
        // String result =reversestring(str);
        // System.out.println(result);

        //reverse stack
        
        reversestack(s);
        printstack(s);
    }

    public static void reversestack(Stack<Integer>s){
        //base case
        if(s.isEmpty()){
            return;
        }
        
        int top=s.pop();
        reversestack(s);
        pushAtBottom(s, top);
    }

    public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

        public static void pushAtBottom(Stack<Integer>s,int data){
           
           //base case
           if(s.isEmpty()){
            s.push(data);
            return;
           }
            int top=s.pop();
            pushAtBottom(s,data);
            s.push(top);
        }
//reverse string using stack
  public static String reversestring(String str){
    Stack<Character>s=new Stack<>();
    int idx=0;

    while(idx<str.length()){
        s.push(str.charAt(idx));
        idx++;
    }
    StringBuilder result=new StringBuilder("");
    while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);
    }
    return result.toString();
  }  
    
}//for class
