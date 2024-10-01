import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
    String str="(])";
    System.out.println(isValid(str));
    
    }



    public static boolean isValid(String str){
        Stack <Character>s=new Stack<>();


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //opening case
            if(ch=='(' || ch=='{'||ch=='['){
                s.push(ch);
            }else{
                //closing case
                //check if stack is null
                if(s.isEmpty()){
                    return false;
                }
                //if pair is being formed
                if( (s.peek()=='(' && ch==')' )//condn.1()
                 || (s.peek()=='{' && ch=='}' )//condn2{}
                  || (s.peek()=='[' && ch==']' )){ //condn3[]

                    s.pop();

                }else{
                    return false;
                }
            }

        }//for loop ends
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

public static boolean isduplicate(String str){

Stack<Character>s=new Stack<>();

for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
//closing case
if(ch==')') {
    int count=0;
    while( s.peek()!=')' ) {
        s.pop();
        count++;
    }
    if(count<1){
        return true;//duplicate exist
    }
    else{
        s.pop();//opening pair
    }
}

//opening/operator/operand
    else{
        s.push(ch);
    }
}//for loop
return false;
}//for function


}//for class
