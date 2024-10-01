public class Divideandconquer {
    public static void main(String[] args) {
        // int arr[]={6,3,9,5,2,8};
        // // mergesort(arr,0,arr.length-1);
        // quicksort(arr,0,arr.length-1);

        //rotated sorted array
        int arr[]={4,5,6,7,0,1,2};
        int target=5;
        int taridx=rotatedsearch(arr,target,0,arr.length-1);
        System.out.println(taridx);;


        // printarr(arr);
        
    }

    public static int rotatedsearch(int arr[],int tar,int si,int ei){

        //base case
        if(si>ei){
            return -1;
        }
        //work
        int mid=si+(ei-si)/2; //(si+ei)/2
        //case 1 -found target
        if(arr[mid]==tar){
            return  mid; 
        }
        //mid on line 1
        if(arr[si]<=arr[mid]){
            //case a;search in left
            if(arr[si]<=tar && tar<=arr[mid]){
               return rotatedsearch(arr, tar, si, mid-1);

            }else{
                //case b:right of line 1 and whole of line 2
               return rotatedsearch(arr, tar, mid+1, ei);
            }
        }
        //mid on line 2
        else{
            // case c:right part of line 2
            if(arr[mid]<=tar && tar<=arr[ei]){
                return rotatedsearch(arr, tar, mid+1, ei);
            }else{
                //case d:left of line 2
                return rotatedsearch(arr, tar, si, mid-1);
            }

        }

    }
    
//mergesort array using divide and conquer

    public static void mergesort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //find mid
        int mid=si+(ei-si)/2;

        //sort left part
        mergesort(arr,si,mid);
        
        //merge right part
        mergesort(arr, mid+1, ei);

        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){
        //left(0,3) right(4,6)
        int temp[]=new int[ei-si+1];

        int i=si;//itrator for left part
        int j=mid+1; //iteratorr for right part
        int k=0; //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        //leftover of left part if right part ends early
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //leftover of rightl part if left part ends early
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temporary to original array

        for(k=0,i=si ;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //mergesort using pivot

    public static void quicksort(int arr[],int si,int ei){
        //basecase
        if(si>=ei){
            return;
        }

        //take pivot-partition

        int pividx=partition(arr,si,ei);
        
        quicksort(arr,si,pividx-1); //for left part
        quicksort(arr,pividx+1,ei); //for right part


    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i =si-1; //to make place for elememtns smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;//swap using temp variable
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;


            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i]; //pivot=arr[i]
        arr[i]=temp;
        return i;

    }
}
