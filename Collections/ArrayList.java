class ArrayList{
    int size=0;
    int capacity;
    int [] arr;
    ArrayList(){
        capacity=2;
        arr = new int[capacity];
    }
    void add(int item){
        if(size==capacity){
            capacity=(2*capacity);
            regrow();
        }
        arr[size] = item;
        size++;
    }
    
    void regrow(){
        int [] newarr = new int[capacity];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
         arr = newarr;
    }
    
    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void delete(int index){
        for(int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
    int findSize(){
        return size;
    }

}
class  Test{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.print();
        al.delete(2);
        al.print();
        System.out.println(al.findSize());

    }
}
