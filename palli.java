public class palli {
    public static void main(String[] args) {
        String s1="aba";
        if(palllindrome(s1)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
    public static String reverse(String s1) {
        String s2="";
        if((s1==null)||(s1.length()<=1)){
            return s1;
        }
        s2=reverse(s1.substring(1))+s1.charAt(0); 
        return s2;
        
    }
    public static boolean palllindrome(String s1) {
        String s2=reverse(s1);
        if(s2.equals(s1)){
            return true;
        }
        return false;
        
    }
}
