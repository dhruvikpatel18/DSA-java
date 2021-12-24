public class Final_7 {

 ///////Maximum and minimum of an array using minimum number of comparisons

    static class pair{
        int min;
        int max;
    }

    static pair getMinMax(int arr[],int n){
        pair minMax = new pair();
        int i;

        if(n==1){
            minMax.min = arr[0];
            minMax.max = arr[0];
            return minMax;
        }

       if(arr[0]>arr[1]){
           minMax.max = arr[0];
           minMax.min = arr[1];
       }else if (arr[1]>arr[0]){
           minMax.max = arr[1];
           minMax.min = arr[0];
       }

       for(i=2; i<n; i++){

           if(arr[i] > minMax.max){
               minMax.max = arr[i];
           }else if(arr[i]< minMax.min){
               minMax.min = arr[i];
           }
       }
       return minMax;

    }

    public static void main(String[] args) {
        int arr[] = {2,678,9000,1,43,7};
        int size = 6;
        pair minMax = getMinMax(arr,size);
        System.out.println("Maximum element is: "+ minMax.max);
        System.out.println("minimum element is: "+ minMax.min);

    }

}
