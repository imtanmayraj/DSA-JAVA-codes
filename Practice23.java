import java.util.*;
import java.util.Scanner;
public class Practice23 {
    public static void main(String[] args) {
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // int key=2;
        // printindex(arr, key,0);

        // printDigits(1947);

        // String str = "tanmay raj";
        // System.out.println(length(str));

        // String str = "abcab";
        // int n = str.length();
        // System.out.print(countSubstrs(str, 0, n-1, n));

        int n=3;
        towerofhanoi(n,"S", "H", "D");


        
    }

//     //Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.

    public static void printindex(int arr[],int key,int i){
        
        //base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printindex(arr,key,i+1);

    }

//     Question 2 :
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0


public static void printDigits(int number) {
    String digits[] = {"zero", "one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
    //base case
if(number == 0) {
return;
}
int lastDigit = number%10;

printDigits(number/10);

System.out.print(digits[lastDigit]+" ");
}

// Question 3 : Write a program to find Length of a String using Recursion

public static int length(String str) {
    if(str.length() == 0) {
    return 0;
    }
    return length(str.substring(1)) + 1;
    }


//     Question 4 : We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character

public static int countSubstrs(String str, int i, int j, int n) {
    if (n == 1) {
    return 1;
    }
    if (n <= 0) {
    return 0;
    }
    int res = countSubstrs(str, i + 1, j, n - 1) +countSubstrs(str, i, j - 1, n - 1) -countSubstrs(str, i + 1, j - 1, n - 2);

    if (str.charAt(i) == str.charAt(j)) {
        
    res++;
    }
    return res;
}

// Question 5 : TOWER OF HANOI (Important!)
// tanmaymth@gmail.comYou have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle
// starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on
// top of an even larger one)

public static void towerofhanoi(int n,String source,String helper,String destination){
    if(n==1){
        System.out.println("transfer disk "+n +"from "+source+" to "+destination);
        return ;
        
    }
    towerofhanoi(n-1,source,destination,helper);

        System.out.println("transfer disk "+n +"from "+source+" to "+destination);
        towerofhanoi(n-1,helper,source,destination);
}

}
