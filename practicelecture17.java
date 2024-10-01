import java.util.*;
public class practicelecture17 {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        countingsort(arr);
        printarray(arr);
    }
    
    public static void bubblesort(int arr[]){
        int n=arr.length;
        int swap=0,temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //for ascending order
                // if(arr[i]>arr[j]){
                //for descending order
                if(arr[i]<arr[j]){
                    //swap
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    swap++;


                }
            }
        }
        System.out.println("total no. of swap ="+swap);
    }

    public static void selectionsort(int nums[]){
        int n=nums.length,temp=0,swap=0;
        for(int i=0;i<n-1;i++){
            int maxpos=i;
            for(int j=i+1;j<n;j++){
                //for increasing order

                // if(nums[minpos]>nums[j]){
                //for decreasing order
                if(nums[maxpos]<nums[j]){
                    maxpos=j;
                }
            }
                  //swap
                  temp=nums[maxpos];
                  nums[maxpos]=nums[i];
                  nums[i]=temp;
                  swap++;
            
        }
        System.out.println("numbers of swaps = "+swap);
    

    }

    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;

            //finding out correct [position]
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;

                // insertion
                arr[prev+1]=curr; 
           
            } 
        }
        }

    public static void printarray(int arr[]){
        System.out.println("sorted array is :");
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
    for(int i=count.length-1;i>=0;i--){
        while(count[i]>0){
            //updating original array
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
    
    }

}
