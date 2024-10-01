import java.util.*;
import java.util.Scanner;
public class Recursion2 {
    public static void main(String[] args) {
        
        // String str="aappnaacollegeee";

        // removeduplicates(str,0,new StringBuilder(""),new boolean[26]);

        // System.out.println("no. of ways in which n friends can be paired is = "+friendspairing(5));

        printbinstrings(4, 0, new String(""));
    }

    public static void removeduplicates(String str,int index,String newstr,boolean map[]){
        
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

    public static int friendspairing(int n){

        //base case
        if(n==1||n==2){
            return n;
        }

        //choice
        //single
        //fnm1=function(n-1)
        int fnm1 = friendspairing(n-1);

        //pair =function(n-2)
        int fnm2=friendspairing(n-2);

        //no. of pairs
        int pairways=(n-1)*fnm2;

        //total ways
        int totalways=fnm1+pairways;
        return totalways;
    }

    public static void printbinstrings(int n,int lastplace,String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastplace==0){
        //     // str.append("0");
        //     //sit 0 on chair n
        //     printbinstrings(n-1,0, str.append("0"));
        //     printbinstrings(n-1,1, str.append("1"));
        // }
        // else{
        //     printbinstrings(n-1,0, str.append("0"));
        // }
        //above can be replaced with 

        printbinstrings(n-1,0, str+"0");
        
        if(lastplace==0){
            printbinstrings(n-1,1, str+"1");
        }
    }
        
}

