public class kthsum {
    public static void main(String[] args) {
        int k=3;
        int[] arr={1,2,3,4,5};
        System.out.println(sumK(arr,0,0,k));

    }
    public static int  sumK(int[] arr,int index,int sum,int k) {
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        return sumK(arr,index+1,sum+arr[index],k)+sumK(arr,index+1,sum-arr[index],k);
    }
}
