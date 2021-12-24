public class dynamicArray {

    private int data[];
    private int nextIndex;

    public dynamicArray(){
        data = new int[5];
        nextIndex =0;
    }
    public int size(){
        return nextIndex;
    }
    public void add(int ele){
        if(nextIndex == data.length){
            restructure();
        }
        data[nextIndex] = ele;
        nextIndex++;
        //data[nextInt] = ele;
        nextIndex ++;

    }
    private void restructure(){
        int temp[] = data;
        data = new int[data.length *2];
        for(int i=0; i<temp.length; i++){
            data[i] = temp[i];
        }
    }
    public void set(int index, int ele){
        if(index > nextIndex){
            return;
        }
        if(index<nextIndex){
            data[index] = ele;
        }
        add(ele);
    }
    public int get(int index){
        if(index >= nextIndex){
            return -1;
        }
        return data[index];
    }
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }else{
            return false;
        }
    }
    public int removeLast(){
        if(size()==0){
            return -1;
        }
        int value = data[nextIndex-1];
        data[nextIndex-1] = 0;
        nextIndex--;
        return value;

    }
}
