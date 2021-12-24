//Practical-1 Demonstrate HelloWorld Application with Single and Multiple Main in a java program.


import java.util.Scanner;

public class Lab_9_12 {

//    public static void main(String[] args) {
//        main(1);
//        main(1,2);
//        main(1,2,3);
//    }
//
//    public static void main(int n){
//        System.out.println("This is main function" + n);
//    }
//
//    public static void main(int n,int m){
//        System.out.println("This is main function" + n + m);
//    }
//    public static void main(int n,int m,int k){
//        System.out.println("This is main function" + n + m + k);
//    }

    // write a java a program to find a reverse of number

//    public static void main(String[] args) {
//
//        int n = 123456;
//        int reverse = 0;
//
//        while(n != 0){
//            int rem = n%10;
//            reverse = reverse*10 + rem;
//            n = n/10;
//        }
//        System.out.println("Given number of reverse is : " + reverse);
//    }



    //write a program to check the given number is even or odd

//    public static void main(String[] args) {
//        System.out.println("Enter the number ");
//        Scanner  sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(n%2 == 0){
//            System.out.println("Given number is even ");
//        }else{
//            System.out.println("Given number is odd");
//        }
//    }

    // write a console program to define and initialize a variable of type byte to 1 then successfully multiply it by 2
    //display its value 8 times and explain the reason for the last result

    public static void main(String[] args) {
        byte n = 1;

    for(int i=1; i<8; i++){
        n *= 2;
    }
        System.out.println(n);

    }

}
