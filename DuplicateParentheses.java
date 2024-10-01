import java.util.*;
public class DuplicateParentheses {
    public static void main(String[] args) {
        String str1="((a+b))";
    String str2="(a-b)";
    System.out.println(isduplicate(str1));
    System.out.println(isduplicate(str2));
    }
    

    public static boolean isduplicate(String str){

        Stack<Character>s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        //closing case
        if(ch==')') {
            int count=0;
            while( s.pop()!='(' ) { //search till opening paren or  s.peek() instead of pop
                // s.pop();
                count++;
            }
            if(count<1){
                return true;//duplicate exist
            }
            // else{
            //     s.pop();//opening pair
            // }
        }
        
        //opening/operator/operand
            else{
                s.push(ch);
            }
        }//for loop
        return false;
        }//for function
}
