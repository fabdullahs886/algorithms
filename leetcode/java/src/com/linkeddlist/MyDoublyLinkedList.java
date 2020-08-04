package com.linkeddlist;

public class MyDoublyLinkedList {

    DoublyNode head;
    int size;

    /** Initialize your data structure here. */
    public MyDoublyLinkedList() {
        head = null;
        size = 0;
    }

    

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > size - 1 || index < 0) return -1;

        DoublyNode node = head;
        for(int i = 0; i < index ; i++){
            node = node.getNext();
        }
        return node.getVal();
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){
            head = new DoublyNode();
            head.setVal(val);
        }else{
            DoublyNode tmp = head;
            head = new DoublyNode();
            head.setVal(val);
            head.setNext(tmp);
            tmp.setPrev(head);
        }
        size++;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        DoublyNode newNode = new DoublyNode();
        newNode.setVal(val);

        DoublyNode node = head;
        while(node != null){
            if( node.getNext() == null)
                break;
            node = node.getNext();
        }
        node.setNext(newNode);

        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if ( index < 0) return;

        if( index > (size)) {
            System.out.println("Invalid index...");
            return;
        }

        if(index == 0){
            addAtHead(val);
            return;
        }

        DoublyNode node = head;
        DoublyNode newNode = new DoublyNode();
        newNode.setVal(val);

        for(int i = 0; i < index - 1; i++){
            node = node.getNext();
        }

        if(node.getNext() == null){
            node.setNext(newNode);
            newNode.setPrev(node);
        }else{
            DoublyNode tmp = node.getNext();
            node.setNext(newNode);
            newNode.setPrev(node);
            newNode.setNext(tmp);
            tmp.setPrev(newNode);
        }
        size++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if ( index < 0 || size <= 0 || index > size - 1) return;

        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }


        DoublyNode node = head;
        for(int i = 0; i < index - 1; i++){
            node = node.getNext();
        }

        DoublyNode tmp = node.getNext();
        if(tmp == null) {
            node.setNext(null);
        }else{
            node.setNext(tmp.getNext());
            tmp.setPrev(node);
        }
        size--;

    }

    public String toString(){
        if(head == null) return null;
        return head.toString();
    }
}

class DoublyTestLinkedList{
    public static void main(String[] args) {
        MyDoublyLinkedList obj = new MyDoublyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(2);
        obj.addAtTail(3);
        System.out.println(obj);
        System.out.println(obj.get(3));
        System.out.println(obj.get(-1));
        obj.addAtIndex(3,4);
        System.out.println(obj);
        obj.deleteAtIndex(0);
        System.out.println(obj);

        // Test case 1
        System.out.println("----------- Test case 1 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        System.out.println(obj);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(2);
        System.out.println(obj);

        // Test case 2
        System.out.println("----------- Test case 2 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        obj.addAtIndex(3,0);
        obj.deleteAtIndex(2);
        obj.addAtHead(6);
        obj.addAtTail(4);
        System.out.println(obj);
        System.out.println(obj.get(4));
        obj.addAtHead(4);
        System.out.println(obj);
        obj.addAtIndex(5,0);
        System.out.println(obj);
        obj.addAtHead(6);
        System.out.println(obj);

        // Test case 3
        System.out.println("----------- Test case 3 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(2);
        System.out.println(obj);
        obj.deleteAtIndex(1);
        System.out.println(obj);
        obj.addAtHead(2);
        System.out.println(obj);
        obj.addAtHead(7);
        System.out.println(obj);

        obj.addAtHead(3);
        System.out.println(obj);
        obj.addAtHead(2);
        System.out.println(obj);
        obj.addAtHead(5);
        System.out.println(obj);
        obj.addAtTail(5);
        System.out.println(obj);

        obj.get(5);
        obj.deleteAtIndex(6);
        System.out.println(obj);
        obj.deleteAtIndex(4);
        System.out.println(obj);

        // Test case 4
        System.out.println("----------- Test case 4 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(1);
        System.out.println(obj);
        obj.addAtTail(3);
        System.out.println(obj);
        obj.addAtIndex(1,2);
        System.out.println(obj);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println(obj);
        System.out.println(obj.get(1));

        // Test case 5
        System.out.println("----------- Test case 5 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(1);
        System.out.println(obj);
        obj.addAtTail(3);
        System.out.println(obj);
        obj.addAtIndex(1,2);
        System.out.println(obj);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);;
        System.out.println(obj);
        System.out.println(obj.get(1));

        // Test case 6
        System.out.println("----------- Test case 6 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(4);
        obj.get(1);
        obj.addAtHead(1);
        obj.addAtHead(5);
        obj.deleteAtIndex(3);
        obj.addAtHead(7);
        obj.get(3);
        obj.get(3);
        obj.get(3);
        obj.addAtHead(1);
        obj.deleteAtIndex(4);

        // Test case 7
        System.out.println("----------- Test case 7 --------------------");
        obj = new MyDoublyLinkedList();
        obj.addAtHead(4);
        System.out.println(obj);
        System.out.println(obj.get(1));
        obj.addAtHead(1);
        System.out.println(obj);
        obj.addAtHead(5);
        System.out.println(obj);
        obj.deleteAtIndex(3);
        System.out.println(obj);
        obj.addAtHead(7);
        System.out.println(obj);
        System.out.println(obj.get(3));
        System.out.println(obj.get(3));
        System.out.println(obj.get(3));
        obj.addAtHead(1);
        System.out.println(obj);
        obj.deleteAtIndex(4);
        System.out.println(obj);



//["addAtHead","get","addAtHead","addAtHead",
//                "deleteAtIndex","addAtHead","get","get",
//                "get","addAtHead","deleteAtIndex"]
//[[4],[1],[1],[5],
//        [3],[7],[3],[3],
//        [3],[1],[4]]
//        [null,null,-1,null,null,null,null,4,4,4,null,null][null,null,-1,null,null,null,null,4,4,4,null,null]
    }
}

class DoublyNode{
    DoublyNode next = null;
    DoublyNode prev = null;
    Integer val = 0;

    public void setNext(DoublyNode next){
        this.next = next;
    }

    public DoublyNode getNext(){
        return next;
    }

    public void setVal(Integer val){
        this.val = val;
    }

    public Integer getVal(){
        return val;
    }

    public DoublyNode getPrev(){ return prev;}

    public void setPrev(DoublyNode prev) { this.prev = prev; }

//    public String toString(){
//        return "Node[val=" + val + ", prev=" + prev +  ", next=" + next + "]";
//    }
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