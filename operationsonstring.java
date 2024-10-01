import java.util.Scanner;

public class operationsonstring {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // String name="tanmay raj";
        // take string as input
        // System.out.println("enter the string");
        //will take only first word of sentence
        // String name=sc.next();

        // String name=sc.nextLine();
        // System.out.println("entered string is :"+name);

        //concatenation on string

        // String firstname="tanmay";
        // String lastname="raj";
        // String fullname=firstname+" "+lastname;

        // System.out.println("fullname after adding up is : "+fullname);
        // System.out.println("char at index 3 ="+fullname.charAt(3));

        // printletters(fullname);
        // String str="tanmay raj";
        // ispalindrome(str);
        
        // String path="WNEENESENNN";
        // System.out.println("shortest path is : "+getshortestpath(path));

        // String s1="tanmay raj";
        // String s2="tanmay raj";
        // String s3=new String("tanmay raj");

        // if(s1==s2){
        //     System.out.println("s1 and s2 are equal");
        // }
        
        // //wrong way to compare strings

        // if(s1==s3){
        //     System.out.println("s1 and s3 are equal");
        // }else{
        //     System.out.println("s1 and s3 are not equal");
        // }

        //correct method

        // if(s1.equals(s3)){
        //     System.out.println("s1 and s3 are equal");
        // }
        // else{
        //     System.out.println("s1 and s3 are not equal");
        // }

        // to find substring

        // String s1[]={"tanmay","mayur","bharat","tushar"};
        // System.out.println("substring from index 1 to 4 is :"+substring(s1,1,4));
        // System.out.println("substring from index 1 to 4 is :"+s1.substring(1,4));

        // System.out.println("largest string is :"+largest(s1));

        String str="aaabbcccdd";
        System.out.println(compress(str));

    }

    public static String largest(String str[]){
        String max=str[0];
        for(int i=0;i<str.length;i++){
            if(str[i].compareTo(max)>0){
                max=str[i];
            }
            
        }
        return max;
    }

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }

    }

    public static boolean ispalindrome(String str){
        int n=str.length();

        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("given string is not a palindrome");
                return false;
                
            }
        }
        System.out.println("given string is a palindrome");
        return true;

    }

    public static float getshortestpath(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            //for north
            if(path.charAt(i)=='N'){
                y++;
            }

            //for south
            if(path.charAt(i)=='S'){
                y--;
            }

            //for east
            if(path.charAt(i)=='E'){
                x++;
            }

            //for west
            if(path.charAt(i)=='W'){
                x--;
            }
        }

        int x2=x*x;
        int y2=y*y;

       float shortest=(float)Math.sqrt(x2+y2);
        return shortest;


    }

    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<=ei;i++){
            substr+=str.charAt(i);

        }
        return substr;
    }


    public static String compress(String str){
        String newstr="";

        for(int i=0;i<str.length();i++){
            Integer count=1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)  ){
                count++;
                i++;
            }
            newstr+=str.charAt(i);

            if(count>1){
                newstr+=count.toString();
            }

        }
        return newstr;
    }
    
}
