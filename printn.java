public class printn {
    public static void main(String[] args) {
        //int n=10;
        printno(10);
    }
    private static int printno(int n) {
        if(n<1)return -1;
            System.out.print(n--);
            System.out.println("\n"+" ");
            
            return printno(n);
    }   
        

}
