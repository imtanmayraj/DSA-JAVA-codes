import java.util.*;
import java.util.Scanner;
public class Recursiontwo {
   

    public static void removeduplicates(String str,int index,StringBuilder newstr,boolean map[]){
        
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        //work to do
        char currchar=str.charAt(index);

        if(map[currchar-'a']==true){
            //duplicate
            removeduplicates(str,index+1,newstr,map);

        }
        else{
            map[currchar-'a']=true;
            removeduplicates(str,index+1,newstr.append(currchar),map);
        }

    }
    
    public static void main(String args[]) {
        
        String str="tanmayraj";
        System.out.println(str);

        StringBuilder sb=new StringBuilder("");
        boolean b[]=new boolean[26];

        removeduplicates(str,0,sb,b);
        
    }

        
}

