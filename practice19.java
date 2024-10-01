import java.util.Arrays;
import java.util.Scanner;

public class practice19 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the string ");
        // String str=sc.nextLine();

        // System.out.println("no. of vowels in string ="+countvowel(str));

//Question 2 : What will be the output of the following code?
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

//         String str = "ApnaCollege".replace("l", "");
// System.out.println(str);

String str1 = "tanmay";
String str2 = "atnamy";
//Convert Strings to lowercase. Why? so that we don't have to check
// separately for lower & uppercase.
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();
// First check - if the lengths are the same
if(str1.length() == str2.length()) {
// convert strings into char array
char[] str1charArray = str1.toCharArray();
char[] str2charArray = str2.toCharArray();
// sort the char array
Arrays.sort(str1charArray);
Arrays.sort(str2charArray);
// if the sorted char arrays are same or identical then the strings are
// anagram
boolean result = Arrays.equals(str1charArray, str2charArray);
if(result) {
System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
} else {
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
}
} else {
// case when lengths are not equal
System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
}
}


    

//     Question 1 : Count how many times lowercase vowels occurred in a String entered by the user

public static int countvowel(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
    return count;
}

// Question 4 : Determine if 2 Strings are anagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be
// anagrams. Consider race and care. In this case, race's characters can be formed into a study,
// or care's characters can be formed into race. Below is a java program to check if two strings
// are anagrams or not
    


}
