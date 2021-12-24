public class swapAlternate {

    public static void main(String[] args) {
        int arr[]={4,2,4,6,7,9,1};
        int n = 7;

        for(int i=0; i<n-1;i+=2){
            if(i+1<=n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
       for(int i=0; i<n; i++){
           System.out.print(arr[i]);
       }
    }
}
