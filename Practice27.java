import java.util.*;
public class Practice27 {
    public static void main(String[] args) {
        
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        findLonely(nums);

        // if(monotonic(nums)){
        //     System.out.println("list is monotonic ");
        // }else {
        //     System.out.println("not monotonic arraylist");
        // }
    }

    
//     Question 1 :Monotonic ArrayList (EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
// Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
// Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
    
//my code
// public static boolean monotonic(ArrayList<Integer>list){
//     int n=list.size();
    
//     if(list.get(0)<list.get(1)){ //increasing order
//         int i=0,j=1;
//         while(j<n){
//             if(list.get(i)>list.get(j)){
//                 return false;
//             }
//             i++;j++;
//         }
//     }
//     if(list.get(0)>list.get(1)){ //decreasing order
//         int i=0,j=1;
//         while(j<n){
//             if(list.get(i)<list.get(j)){
//                 return false;
//             }
//             i++;j++;
//         }
//     }
//     return true;
// }
// 
//mam code==optimized
public static boolean monotonic(ArrayList<Integer> A) {
    boolean inc = true;
    boolean dec = true;
    for (int i=0; i<A.size()-1; i++) {
    if (A.get(i) > A.get(i+1))
    inc = false;
    if (A.get(i) < A.get(i+1))
    dec = false;
    }
    return inc || dec;
    }


    // Question 2 :
// Lonely Numbers in ArrayList (MEDIUM)
// You are given an integer arraylist nums. A number x is lonely when it appears only once, and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
// Return all lonely numbers in nums. You may return the answer in any order.
// Sample Input 1 : nums = [10,6,5,8]
// Sample Output 1 : [10,8]
//my code-wrong
    // public static void Lonelynumber(ArrayList<Integer> A){
    //     int n=A.size();
    //     Collections.sort(A);
       
    //     ArrayList<Integer>B=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         boolean isLonely=true;
    //          int numati=A.get(i);

    //          if ( i>0 && ((numati==A.get(i-1) || numati==A.get(i-1)+1 ) )){
    //             isLonely = false;
    //         }
    //         if (i<n && ((numati==A.get(i+1) || numati==A.get(i+1)-1))){
    //             isLonely = false;
    //         }
    //         if(isLonely){
    //          B.add(numati);
    //          }

    //     }

    //     System.out.println(B);

    // }

    //mam code
    
public static void findLonely(ArrayList<Integer> nums) {
Collections.sort(nums);
ArrayList<Integer> list = new ArrayList<>();
for (int i=1; i < nums.size()-1; i++) {
if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
{
list.add(nums.get(i));
}
}
if (nums.size() == 1) {
list.add(nums.get(0));
}
if (nums.size() > 1) {
if (nums.get(0) + 1 < nums.get(1)) {
list.add(nums.get(0));
}
if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
     
    list.add(nums.get(nums.size()-1));
}
}
System.out.println(list); 
}


// Question 3 :
// Most Frequent Number following Key (EASY)
// You are given an integer Arraylist nums. You are also given an integer key, which is present in
// nums.
// For every unique integer target in nums, count the number of times target immediately follows
// an occurrence of key in nums. In other words, count the number of indices i such that:
// 0 <= i <= nums.size() - 2,
// nums.get(i) == key and,
// nums.get(i+1) == target.
// Return the target with the maximum count.
// (Assumption - that the target with maximum count is unique.)
// Sample Input 1 :nums = [1,100,200,1,100], key = 1
// Sample Output 1 : 100


public int mostFrequent(ArrayList<Integer> nums, int key) {
    int[]result = new int[1000];
    for(int i=0; i<nums.size()-1; i++){
    if(nums.get(i) == key){
    result[nums.get(i+1)-1]++;
    }
    }
    int max = Integer.MIN_VALUE;
    int ans = 0;
    for(int i=0; i<1000; i++){
    if(result[i] > max){
    max = result[i];
    ans = i+1;
    }
    }
    return ans;
    }


//     Question 4 :
// Beautiful ArrayList (MEDIUM)
// An Arraylist nums of size n is beautiful if:
// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +
// nums.get(j).
// Given the integer n, return any beautiful arraylist nums of size n. There will be at least one valid
// answer for the given n.
// Sample Input 1 : n = 4
// Sample Output 1 : [2,1,4,3]

public ArrayList<Integer> beautifulArray(int n) {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);
    for(int i=2;i<=n;i++){
    ArrayList<Integer>temp=new ArrayList<>();
    for(Integer e:ans){
    if(2*e<=n)temp.add(e*2);
    }
    for(Integer e:ans){
    if(2*e-1<=n)temp.add(e*2-1);
    }
    ans=temp;
    }
    return ans;
    }
    // Approach 2 (Divide & Conquer)
    // Let's start from a simple 3 numbers case: (1, 2, 3) -> the only thing we need to do is move 2
    // out of 1 and 3 -> (1, 3, 2).
    // Then what if the case is (1, 5, 9 ) which has increment = 4? It's the same thing -> move 3 out
    // of 1 and 5 -> (1, 9, 5).
    // Now, what if the case is (1, 3, 5, 7, 9) ? With the odd + even or divide + conquer idea in mind,
    // we can simply divide it to (1, 5, 9) and (3, 7). Since no change is needed for the 2 numbers
    // case, after following the above steps, we can conquer them to (1, 9, 5, 3, 7).


    public ArrayList<Integer> beautifulArray(int n) {
    ArrayList<Integer> res = new ArrayList<>();
    divideConque(1, 1, res, n);
    return res;
    }
    private void divideConque(int start, int increment, ArrayList<Integer> res, int
n) {
if (start + increment > n) {
res.add(start);
return;
}
divideConque(start, 2 * increment, res, n);
divideConque(start + increment, 2 * increment, res, n);
}


}//for class
