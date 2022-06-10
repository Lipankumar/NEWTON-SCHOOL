class today{
   public static void main(String[] args) {
       int n=7;
       //System.out.print(fibonaci(n));
       fibonaci( n);
   }
   public static void fibonaci(int n) {
    //    if(n==0 || n==1){
    //        return n;
    //    }
//        if(n<0){
//            return -1;
//        }
//        System.out.println(n--);
//        return fibonaci(n-1) +fibonaci(n-2);
//    }
// int j=1;
//     for(int i=0;i<n;i++){
//         for(j=j+i;j<i;j++){

//             System.out.println(j--);
//         }
//         //System.out.println(i);
//         //for(int i=1)
//     return j;
// }
// return j;
if(n<1){
    return;
}   
int a=0; 
int b=1+a;

    // for(i=1;i<n;i++){
    //     System.out.println(i);
    // }
    System.out.println(a);
      for(int i=1;i<n;i++){
         System.out.println(b);
         int c=a+b;
         a=b;
         b=c;
     }
}
}

//0 1 1 2  3 5 