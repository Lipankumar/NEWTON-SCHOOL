import java.util.Arrays;
import java.util.Scanner;

/**
 * today
 */
public class equalsumsubset {
    public static int compareMax(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    // public static int compareMax(int[] arr,int i,int max) {
    //     return compareMax(arr,i+1,max);
    // }
    public static int findSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            //if(sum<arr[i]){
                sum+=arr[i];
            //}
        }
        return sum;
    }
    // public static int findSum(int[] arr,int sum,int i) {
    //     return findSum(arr,sum+arr[i],i--);
    // }
    public static boolean checkMax(int[] arr) {
        int max=compareMax(arr);
        int sum=findSum(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]!=max){
        //             j++;
        //             return true;
        //         }
        //         else{
        //             ++;
        //         }
        //         i++;
        //     }
            
        // }
        // return false;
        if(sum!=max){
            return false;
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 5,11,5};
        Arrays.sort(arr);
        // int sum=findSum(arr,0,arr.length-1);
        // int max=compareMax(arr,0,arr[0]);
        // if(sum==max){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        System.out.println(checkMax(arr));
    }    
    
}