public class PermutationString 
{ 
    public static void main(String[] args) 
    { 
        String str = "123"; 
        int n = str.length(); 
        PermutationString permutation = new PermutationString(); 
        permutation.permute(str, 0, n-1); 
    } 
  

    private void permute(String str, int l, int r) 
    { 
       if(l==r){
           System.out.print(str+" ");
       }
       else{
           for(int i=1;i<=r;i++){
               str=swap(str,l,i);
               permute(str, l+1, r);
               str=swap(str,l,i); 
           }
       }
    }
    public static String swap(String str,int i,int j) {
        char[] arr=new char[str.length()];
        arr=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        str=String.valueOf(arr);
        return str;
    }
}