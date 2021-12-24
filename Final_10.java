public class Final_10 {

    public static void func(int arr[],int left,int right){
        while(left<=right){

            if(arr[left]<0 && arr[right]<0){
                left++;
            }else if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }else if(arr[left] >0 && arr[right]>0){
                right--;
            }else{
                left++;
                right--;
            }
        }

    }
    public static void dis(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={-1,6,3,-3,-5,3,4,-4};
        int n = arr.length;
        func(arr,0,n-1);
        dis(arr,n);
    }
}
