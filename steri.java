public class steri {
    // public static void main(String[] args) {
    //     String s1="abcdxyz";
    //     String s2="xyzabcd";
    //     int count=0;
    //     for(int i=0;i<s1.length();i++){
    //         for(int j=0;j<s2.length();j++){
    //             if(s1.charAt(i)==s2.charAt(j)){
    //                 count++;
    //                 break;
                    
                    
    //             }
               
                
    //         }
    //     }
    //     System.out.println(count/2);
    // }
    static String s1,s2;
    public static void main(String[] args) {
        s1="GeeksforGeeks";
        s2="GeeksQuiz";
        System.out.println( miniumSubstring(s1,s2,s1.length(),s2.length()));
    }
    // public static int miniumSubstring(int i,int j,int count) {
    //     if(i==0 || j==0){
    //         return count;
    //     }
    //     if(s1.charAt(i-1)==s2.charAt(j-1)){
    //         count=miniumSubstring(i-1,j-1,count+1);
    //     }
    //     count=Math.max(count,Math.max(miniumSubstring(i-1,j,0),miniumSubstring(i,j-1,0)));
    //     return count;
    // }
    public static int miniumSubstring(String s1,String s2,int m,int n) {
        int[][] dp=new int[m+1][n+1];
        int count=0;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    count=Math.max(count,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return count;
    }
}
