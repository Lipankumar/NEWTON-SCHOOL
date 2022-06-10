

// /**
//  * subsequence
//  */
// public class subsequence {

//     public static void main(String[] args) {
//         subsequence sub=new subsequence();
//         String s1="aggtab";
//         String s2="gxtayb";
//         sub.findSubsequence(s1,s2);
//         //System.out.println(findSubsequence(s1,s2));
       
//     }
//     public void findSubsequence(String s1,String s2) {
//         int count=0;
      
//         for(int i=0;i<s1.length();i++){
//             for(int j=0;j<s2.length();j++){
//                 if(s1.charAt(i)==s2.charAt(j)){
//                     count++;
                   
                        
                        
                    
//                 }
                
//                 if(count>2){
//                     System.out.print(s1.charAt(i));
                    
//                     break;
//                 }
               
             
//             }
            
//         }
       
//     }
// }
public class subsequence {
    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        int m=s1.length();
        int n=s2.length();
        System.out.println(findSubsequence(s1,s2,m,n));
    }
    public static int findSubsequence(String s1,String s2,int m,int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
