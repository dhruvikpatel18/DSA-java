public class recursion_1 {

//    //factorial number
//
//    public static int fact(int n){
//        if(n==0){
//            return 1;
//        }
//        int smallestAns = fact(n-1);
//        return n*smallestAns;
//    }
//
//    public static void main(String[] args) {
//        int n = 3;
//        int ans = fact(n);
//        System.out.println(ans);
//    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    //sum of the n natural numbers

//    public static int sum(int n){
//        if(n == 1){
//            return 1;
//        }
//        return sum(n-1)+n;
//    }
//
//    public static void main(String[] args) {
//        int n = 4;
//        int ans = sum(n);
//        System.out.println(ans);
//    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //Fibonacci series

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }
}
