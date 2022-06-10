import java.util.ArrayList;
import java.util.*;

public class allsubsequence {
    static ArrayList<String>list=new ArrayList<>();
    public static void main(String[] args) {
        
        String s1="abcd";
        int m=s1.length();
        //Collections.sort(list);
        Subseqence(s1,"");
        
        System.out.println(list);
     
    }
    public static String Subseqence(String s1,String s2) {
       if(s1.length()==0){
           list.add(s2);
           return s1;
       }
       //add 1st character
       Subseqence(s1.substring(1),s2+s1.charAt(0));
       //add 2nd character
       return Subseqence(s1.substring(1),s2);
    }
}
