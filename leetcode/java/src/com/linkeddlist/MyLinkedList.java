package com.linkeddlist;

import java.io.OutputStream;

public class MyLinkedList {

    Node head;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > size - 1 || index < 0) return -1;

        Node node = head;
        for(int i = 0; i < index ; i++){
            node = node.getNode();
        }
        return node.getVal();
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){
            head = new Node();
            head.setVal(val);
        }else{
            Node tmp = head;
            head = new Node();
            head.setVal(val);
            head.setNode(tmp);
        }
        size++;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        Node newNode = new Node();
        newNode.setVal(val);

        Node node = head;
        while(node != null){
            if( node.getNode() == null)
                break;
            node = node.getNode();
        }
        node.setNode(newNode);

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

        Node node = head;
        Node newNode = new Node();
        newNode.setVal(val);

        for(int i = 0; i < index - 1; i++){
            node = node.getNode();
        }

        if(node.getNode() == null){
            node.setNode(newNode);
        }else{
            Node tmp = node.getNode();
            node.setNode(newNode);
            newNode.setNode(tmp);
        }
        size++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if ( index < 0 || size <= 0 || index > size - 1) return;

        if(index == 0){
            head = head.getNode();
            size--;
            return;
        }


        Node node = head;
        for(int i = 0; i < index - 1; i++){
            node = node.getNode();
        }

        Node tmp = node.getNode();
        if(tmp == null) {
            node.setNode(null);
        }else{
            node.setNode(tmp.getNode());
        }
        size--;

    }

    public String toString(){
        if(head == null) return null;
        return head.toString();
    }
}

class TestLinkedList{
    public static void main(String[] args) {
//        MyLinkedList obj = new MyLinkedList();
//        obj.addAtHead(1);
//        obj.addAtTail(2);
//        obj.addAtTail(3);
//        System.out.println(obj);
//        System.out.println(obj.get(3));
//        System.out.println(obj.get(-1));
//        obj.addAtIndex(3,4);
//        System.out.println(obj);
//        obj.deleteAtIndex(0);
//        System.out.println(obj);

        // Test case 1
        System.out.println("----------- Test case 1 --------------------");
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        System.out.println(obj);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(2);
        System.out.println(obj);

        // Test case 2
        System.out.println("----------- Test case 2 --------------------");
        obj = new MyLinkedList();
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
        obj = new MyLinkedList();
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
        obj = new MyLinkedList();
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
        obj = new MyLinkedList();
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
        obj = new MyLinkedList();
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
        obj = new MyLinkedList();
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

class Node{
    Node node = null;
    Integer val = 0;

    public void setNode(Node node){
        this.node = node;
    }

    public Node getNode(){
        return node;
    }

    public void setVal(Integer val){
        this.val = val;
    }

    public Integer getVal(){
        return val;
    }

    public String toString(){
        return "Node[val=" + val + ", node=" + node + "]";
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