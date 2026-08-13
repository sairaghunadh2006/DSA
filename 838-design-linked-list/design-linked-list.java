class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index>=size) return -1;
        Node cur = head;
        for(int i = 0;i<index;i++){
            cur = cur.next;
        }
        return cur.data;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        nn.next = head;
        head = nn;
        size++;
    }
    
    public void addAtTail(int val) {
       Node nn = new Node(val);
       if(head == null){
        head = nn;
        size++;
        return;
       }
       Node cur = head;
       while(cur.next != null){
        cur = cur.next;
       }
       cur.next = nn;
       size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node nn = new Node(val);
        if(index < 0 || index > size) return;
        if(index == 0){
            nn.next = head;
            head = nn;
            size++;
            return;
        }
        Node cur = head;
        for(int i = 0;i<index - 1;i++){
            cur = cur.next;
        }
        nn.next = cur.next;
        cur.next = nn;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        for(int i = 0;i<index - 1;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */