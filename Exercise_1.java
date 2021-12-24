import java.util.Scanner;

public class Exercise_1 {

//    public static void avg(int a, int b,int c){
//        float ans = (a+b+c)/3;
//        System.out.println("The average is: " + ans);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter the numbers: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        avg(a,b,c);
//    }

//    public static void greater_number(int a,int b){
//        if(a>b){
//            System.out.println(a + " is greater then " + b);
//        }else{
//            System.out.println(b + " is greater then " + a);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        greater_number(a,b);
//    }

//    public static int gcd(int a, int b){
//        if(a==0){
//            return b;
//        }
//        if(b==0){
//            return a;
//        }
//        //base case
//        if(a==b){
//            return a;
//        }
//        if(a>b){
//            return gcd(a-b,b);
//        }else{
//            return gcd(a,b-a);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(gcd(a,b));
//    }

    public static void main(String[] args) {
        int n = 6;
        int fib = 0;
        for(int i=0; i<=n; i++){
             fib = (i-1) + i;
        }
        System.out.println(fib);
    }
}
