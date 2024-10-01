import java.util.*;
public class TCS2024 {
    public static void main(String[] args) {
        int matrix[]={3,4,-7,1,3,3,1,-4};
        int target=7;

        subarraysum(matrix,target);
    }

    public static void subarraysum(int matrix[],int target){

        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                if(matrix[i]+matrix[j]==target){
                    System.out.println("("+matrix[i]+","+matrix[j]+")");
                }
            }
        }
    }
    
}
