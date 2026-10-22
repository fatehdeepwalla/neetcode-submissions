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
        node dummy=new node(Integer.MAX_VALUE,null);
        tail=dummy;
        head=dummy;
    }

    public int get(int index) {
        if(index<0) return -1;

        node temp=head;
        int i=-1;
        while(i!=index){
            temp=temp.next;
            // if next node is not there 
            if(temp==null) return -1;
            i++;
        }
        return temp.value;
    }

    public void insertHead(int val) {
        node temp=new node(val, head.next);
        head.next=temp;
        if(temp.next==null) tail=temp;

    }

    public void insertTail(int val) {
        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        node temp= new node(val, null);
        curr.next=temp;
        tail=temp;
    }

    public boolean remove(int index) {

        if(head.next==null){
            return false;
        }

        node prev=null;
        node curr=head;
        int i=-1;
        while(i!=index){
            prev=curr;
            curr=curr.next;
            // if curr is tail
            if(curr==null) return false;
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
            arr.add(temp.value);
        }
        return arr;

    }
}
