public class sorting {

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //Bubble Sort
//
//    //function for print
//    static void printArray(int arr[]){
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    //function for sort
//    static void sort(int arr[],int n){
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        //call the function for print array
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {8,5,1,3,0};
//        int n=5;
//        sort(arr,n);
//
//    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    //Selection Sort
//
//    //for print array
//    static void printArray(int arr[]){
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    //for sort
//    static void sort(int arr[],int n){
//        for(int i=0; i<n-1; i++){
//            int smallest = i;
//            for(int j=i+1; j<n; j++){
//                if(arr[smallest]>arr[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//        printArray(arr);
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {8,0,3,9,1};
//        int n = 5;
//        sort(arr,n);
//    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Insertion sort

    //for print

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //insertion sort func
    static void sort(int arr[]){
        for(int i=1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement of current ele
            arr[j+1] = current;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {9,5,8,1,0,3};
        sort(arr);
    }
}
