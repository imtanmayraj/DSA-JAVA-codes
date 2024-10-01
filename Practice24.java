import java.util.*;

public class Practice24 {
    public static void main(String[] args) {

    //     String[] arr = { "sun", "earth", "mars", "mercury","jupiter","uranus","neptune" };
    //     String[] a = mergeSort(arr, 0, arr.length - 1);

    // for (int i = 0; i < a.length; i++) {
    //     System.out.println(a[i]);
    // }

//    int nums[] = {2,2,5,5,5,2,2,5,5,3,5,8,5,5};
//    System.out.println(maximumtimes(nums));
//    System.out.println(majorityElement(nums));

    int arr[] = {1, 20, 6, 4, 5};
    // System.out.println("Inversion Count = "+ getInvCount(arr));

    System.out.println("Inversion Count = " + getInversions(arr));

    }
//     Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in
// all the Strings are in lowercase). (EASY)
// Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
// Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}
   
    //function to mergeSort 2 arrays
public static String[] mergeSort(String[] arr, int lo, int hi) {

    if (lo == hi) {

    String[] A = { arr[lo] };
    return A;
    }

    int mid = lo + (hi - lo) / 2;
    String[] arr1 = mergeSort(arr, lo, mid);
    String[] arr2 = mergeSort(arr, mid + 1, hi);
    String[] arr3 = merge(arr1, arr2);
    return arr3;
    }


    public static String[] merge(String[] arr1, String[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    String[] arr3 = new String[m + n];
    int idx = 0;
    int i = 0;
    int j = 0;

    while (i < m && j < n) {
    if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    else {
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }

    }
    while (i < m) {
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    while (j < n) {
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }
    return arr3;
    }
    // Return true if str1 appears before str2 in alphabetical order
    public static boolean isAlphabeticallySmaller(String str1, String str2) {

    if (str1.compareTo(str2) < 0) {
    return true;
    }

    return false;
    }



//     Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
// that the majority element always exists in the array.
// Sample Input 2 : nums = [2,2,1,1,1,2,2]
// Sample Output 2 : 2

public static int maximumtimes(int arr[]){

    //my code

    int count=0;
    int temp=0;
    int n=arr.length;

    for(int i=0;i<n;i++){
        temp=arr[i];
        count=0;
        for(int j=0;j<n;j++){
            if(temp==arr[j]){
            count++;
            }
            if(count>n/2){
                return temp;
                }

        }
       
    }
    return -1;
}

//time complexity =O(nlogn)===using recursive function

private static int majorityElementRec(int[] nums, int lo, int hi) {
    // base case; the only element in an array of size 1 is the majority
    // element.
    if (lo == hi) {
    return nums[lo];
    }
    // recurse on left and right halves of this slice.
    int mid = (hi-lo)/2 + lo;
    int left = majorityElementRec(nums, lo, mid);
    int right = majorityElementRec(nums, mid+1, hi);
    // if the two halves agree on the majority element, return it.
    if (left == right) {
    return left;
    }
    // otherwise, count each element and return the "winner".
    int leftCount = countInRange(nums, left, lo, hi);
    int rightCount = countInRange(nums, right, lo, hi);
    return leftCount > rightCount ? left : right;
    }


    public static int majorityElement(int[] nums) {
    return majorityElementRec(nums, 0, nums.length-1);
    }
    
    private static int countInRange(int[] nums, int num, int lo, int hi) {
int count = 0;
for (int i = lo; i <= hi; i++) {
if (nums[i] == num) {
    count++;
}
}
return count;
}

// Question 3 : Given an array of integers. Find the Inversion Count in the array. (HARD)
// Inversion Count: For an array, inversion count indicates how far (or close) the array is from
// being sorted. If the array is already sorted then the inversion count is 0. If an array is
// sorted in the reverse order then the inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1 : N = 5, arr[ ] = {2, 4, 1, 3, 5}
// Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).
//Approach 1 - Brute Force Approach

public static int getInvCount(int arr[]) {
    int n = arr.length;
    int invCount = 0;
    for (int i = 0; i < n - 1; i++) {
     for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
        invCount++;
        }
     }
    }
    return invCount;
    }
    
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];
        while ((i < mid) && (j <= right)) {
        if (arr[i] <= arr[j]) {
        temp[k] = arr[i];
        k++;
        i++;
        }
        else {
        temp[k] = arr[j];
        invCount += (mid - i);
        k++;
        j++;
        }
        }
        while (i < mid) {
        temp[k] = arr[i];
        k++;
        i++;
        }
        while (j <= right) {
        temp[k] = arr[j];
        k++;
        j++;
        }
        for (i = left, k = 0; i <= right; i++, k++) {
        arr[i] = temp[k];
        }

        return invCount;
}



private static int mergeSort(int arr[], int left, int right) {
int invCount = 0;
if (right > left) {
int mid = (right + left) / 2;
invCount = mergeSort(arr, left, mid);
invCount += mergeSort(arr, mid + 1, right);
invCount += merge(arr, left, mid + 1, right);
}
return invCount;
}




public static int getInversions(int arr[]) {
int n = arr.length;
return mergeSort(arr, 0, n - 1);
}

}//for class closure


