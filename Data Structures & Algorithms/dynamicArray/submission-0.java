class DynamicArray {
    int [] arr;
    int size=0;
    public DynamicArray(int capacity) {
        arr=new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;
    }

    public void pushback(int n) {
        if(size==arr.length) resize();
        arr[++size-1]=n;
    }

    public int popback() {
        return arr[size-- -1];
    }

    private void resize() {
        int[] temp=Arrays.copyOf(arr, 2*arr.length);
        arr=temp;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
