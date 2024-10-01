public class practicelecture16 {
    public static void main(String[] args) {
        // int nums[]={1,2,6,7,3,4,8};
        // boolean a=checkduplicate(nums);
        // System.out.println(a);
        // int target=4;
        // int index=mysearch(nums,target);
        // System.out.println("found at index : "+index);

        // int nums[]={-1,0,1,2,-1,-4};
        // System.out.println("sum found with values " +zerosum(nums));

        //Q.2 
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
       
        int index=search(nums,target);
        System.out.println("found at index : "+index);

    }
    

    //Q1 checkduplicate IN AN ARRAY
    public static boolean checkduplicate(int nums[]){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    // Q2.  PRINT TARGET INDEX
public static int mysearch(int nums[],int target){
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(nums[i]==target){
        return i;
        }
    }
    return -1;
}



// Q2.  PRINT TARGET INDEX code by mam

public static int search(int[] nums, int target) {
    //min will have index of minimum element of nums
    int min = minSearch(nums);
    //find in sorted left
    if(nums[min] <= target && target <= nums[nums.length-1]){
    return search(nums,min,nums.length-1,target);
    }
    //find in sorted right
    else{
    return search(nums,0,min,target);
    }
    }
    //binary search to find target in left to right boundary
    public static int search(int[] nums,int left,int right,int target){
    int l = left;
    int r = right;
    // System.out.println(left+" "+right);
    while(l <= r){
    int mid = l + (r - l)/2;
    if(nums[mid] == target){
    return mid;
    }
    else if(nums[mid] > target){
    r = mid-1;
    }
    else{
    l = mid+1;
    }
    }
    return -1;
    }
    //smallest element index
    public static int minSearch(int[] nums){
    int left = 0;
    int right = nums.length-1;
    while(left < right){
        int mid = left + (right - left)/2;
        if(mid > 0 && nums[mid-1] > nums[mid]){
        return mid;
        }
        else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
        left = mid+1;
        }
        else{
        right = mid-1;
        }
        }
        return left;
        }
    
        // Q3 . STOCKBUYING SELLING
//done already

//Q 4 TRAPPED WATER VOLUME
//DONE ALREADY - datasheet.java


//Q.5 FINDING NUMBERS OF FIXED  SUM 

// public static int[] zerosum(int nums[]){
//     int n=nums.length;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;j<n;j++){
//                 if (nums[i]+nums[j]+nums[k]==0) {
//                     return new int[]{nums[i],nums[j],nums[k]};
                    
//                 }
//             }
//         }
//         System.out.println();
//     }
// }

}
