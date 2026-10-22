class node{
    int value;
    node next;

    public node(int value, node next){
        this.value=value;
        this.next=next;
    }

}

class LinkedList {
    node head;
    node tail;

    public LinkedList() {
        tail=new node (Integer.MAX_VALUE, null);
        head=new node (Integer.MIN_VALUE, tail);
    }

    public int get(int index) {
        node temp=head;
        int i=-1;
        while(i!=index){
            temp=temp.next;
            // if next node is tail 
            if(temp.next==null) return -1;
            i++;
        }
        return temp.value;
    }

    public void insertHead(int val) {
        node temp=new node(val, head.next);
        head.next=temp;

    }

    public void insertTail(int val) {
        node prev=null;
        node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        node temp= new node(val, tail);
        prev.next=temp;
    }

    public boolean remove(int index) {
        node prev=null;
        node curr=head;
        int i=-1;
        while(i!=index){
            prev=curr;
            curr=curr.next;
            // if curr is tail
            if(curr.next==null) return false;
            i++;
        }
        prev.next=curr.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr=new ArrayList<>();
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            // if curr is tail
            if(temp.next==null) return arr;
            arr.add(temp.value);
        }
        return arr;

    }
}
