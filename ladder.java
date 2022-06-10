class ladder{
    public static void main(String[] args) {
        int target=4;
        int k=2;
        System.out.println(findladder(k,target));
    }
    private static int findladder(int k,int target) {
        int[] dp=new int[target+1];
        dp[0]=0;
        for(int j=1;j<dp.length;j++){
            for(int i=1;i<=dp.length;i++){
                if(j>=dp[i-1]){
                    dp[i-1]=j+dp[i-1];
                }
            }
        }
        
    
    return dp[target];
}
}