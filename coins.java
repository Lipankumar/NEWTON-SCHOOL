public class coins {
    public static int coin(int[] coins,int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        // for(int j=1;j<=target;j++){
        //     for(int coin:coins){
        //         if(j>=coin){
        //             int rem=j-coin;
        //             //int remval=rem+coins[i-1];
        //             dp[j]+=dp[rem];
        //         }
        //     }
        // }
        // return dp[target];
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<dp.length;j++){
                if(coins[i]<=j){
                    int rem=j-coins[i];
                    dp[j]+=dp[rem];
                }
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int[] coins={1,2,3};
        int target=3;
        System.out.println(coin(coins,target));
    }
}
