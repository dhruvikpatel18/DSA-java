
import java.util.*;
import java.lang.*;
import java.io.*;

public class Final_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter kth : ");
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //                                                 ⬇️*for maxHeap function*⬇️
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // if we want largest kth then we dont reqiure 'Collections.reverseOrder()' bcz in a heap in java default function is 'minheap'
        for(int i=0; i<n; i++){
            queue.add(arr[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        System.out.println("Answer is: "+ queue.peek());
    }

}
