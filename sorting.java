import java.util.Scanner;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
    // int nums[]={5,4,1,3,2};
    //forcollections fumction
    // Integer nums[]={5,4,1,3,2};
    // int nums[]={1,2,3,4,5};
    //  bubblesort(nums);
    //  selectionsort(nums);
    // insertionsort(nums);
    // Arrays.sort(nums);
    // Arrays.sort(nums,0,3);
    //for descending order
    // Arrays.sort(nums,Collections.reverseOrder());
    int arr[]={1,4,1,3,2,4,3,7};
    countingsort(arr);
    printarray(arr);
}

//bubblesort - my code
public static void bubblesort(Integer nums[]){
    int n=nums.length,temp=0,swap=0;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
              //swap
              temp=nums[j];
              nums[j]=nums[j+1];
              nums[j+1]=temp;
              swap++;
            }
        }
    }
    System.out.println("numbers of swaps = "+swap);

    }

    //selection sort
    public static void selectionsort(Integer nums[]){
        int n=nums.length,temp=0,swap=0;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                //for increasing order

                if(nums[minpos]>nums[j]){
                //for decreasing order
                // if(nums[minpos]<nums[j]){
                    minpos=j;
                }
            }
                  //swap
                  temp=nums[minpos];
                  nums[minpos]=nums[i];
                  nums[i]=temp;
                  swap++;
            
        }
        System.out.println("numbers of swaps = "+swap);
    
        }

    public static void printarray(Integer arr[]){
        System.out.println("array after sorting ");
    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
    }
    }


    public static void insertionsort(Integer arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;

            //finding out correct [position]
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;

                // insertion
                arr[prev+1]=curr; 
           
            } 
        }
        }

    public static void printarray(int arr[]){
        System.out.println("array after sorting ");
    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
    }
    }

    public static void countingsort(int arr[]){
        //to find largest in range 
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
            
        }
        System.out.println("largest no. in range ="+largest);
        //creating new count array

        int count[]=new int[largest+1];

        //counting freq of numbers and updating in countarray

    for(int i=0;i<n;i++){
        count[arr[i]]++;
    }

    //sorting
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            //updating original array
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
    
    }
    
}
