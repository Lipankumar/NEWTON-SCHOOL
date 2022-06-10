public class stringreplace {
    private static int findmin(int x,int y,int z) {
        return Math.min(Math.min(x,y), z);
    }
    private static int doReplace(String s1,String s2,int m,int n) {
        if (m == 0)
          return n;
          if (n == 0)
            return m;
                if(s1.charAt(m-1)==s2.charAt(n-1)){
                    return doReplace(s1,s2,m-1,n-1); 
                }
                
                return 1+findmin(doReplace(s1, s2, m,n-1),doReplace(s1, s2, m-1,n),doReplace(s1, s2, m-1,n-1));
                
            
    }
   public static void main(String[] args) {
    String s1 = "tuesday";
    String s2 = "saturday";
    System.out.println(doReplace(s1,s2,s1.length(),s2.length()));

   }
}