package com.linkeddlist;

//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//
//        Return a deep copy of the list.
//
//        The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
//
//        val: an integer representing Node.val
//        random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
//
//        Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//        Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
//
//        Input: head = [[1,1],[2,1]]
//        Output: [[1,1],[2,1]]
//
//        Input: head = [[3,null],[3,0],[3,null]]
//        Output: [[3,null],[3,0],[3,null]]
//        Input: head = []
//        Output: []
//        Explanation: Given linked list is empty (null pointer), so return null.


import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    private Node copyRandomList(Node head) {
        if (head == null) return  null;

        // Solution 1
//        https://www.youtube.com/watch?v=toS-xwtsFfs
//        Map<Node,Node> map = new HashMap<Node,Node>();
//        Node dummy = new Node(Integer.MIN_VALUE);
//        dummy.next = head;
//
//        while(head != null){
//            map.put(head, new Node(head.val));
//            head = head.next;
//        }
//
//        head = dummy.next;
//        while(head != null){
//            Node node = map.get(head);
//            node.next = map.get(head.next);
//            node.random = map.get(head.random);
//            head = head.next;
//        }
//
//        return map.get(dummy.next);


        // Solution 2 (not working)
//        https://www.youtube.com/watch?v=Z69oVArL2_A
//        Map<Node,Node> map = new HashMap<Node,Node>();
//        Node dummy =  new Node(-1);
//        Node newNode = dummy;
//        while(head != null){
//            if ( map.containsKey(head)){
//                newNode.next = map.get(head);
//            }else{
//                Node node = new Node(head.val);
//                map.put(head,node);
//                newNode.next = node;
//            }
//
//            if(map.containsKey(head.random)){
//                newNode.next.random = map.get(head.random);
//            }else if (head.random != null){
//                Node node = new Node(head.random.val);
//                map.put(head.random, node);
//                newNode.next.random = node;
//            }
//            newNode = newNode.next;
//            head = head.next;
//        }
//        return dummy.next;


        // Solution 3
//        https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/

        Node dummy = head;
        // insert new node like 1 => 2 => 3 to 1 => 1 => 2 => 2 => 3 => 3
        while(dummy != null){
            Node tmp = dummy.next;
            Node node = new Node(dummy.val);
            dummy.next = node;
            node.next = tmp;
            dummy = tmp;
        }

        // insert random
        dummy = head;
        while(dummy != null){
            dummy.next.random = dummy.random.next;
            dummy = dummy.next.next;
        }

        // Separate new and old linked list now
        Node copy = new Node(-1);
        dummy = head.next;
        while(dummy != null){
            dummy.next = dummy.next.next;
            copy.next = copy.next.next;
        }



        return copy.next;
    }

    static void print(Node start)
    {
        Node ptr = start;
        while (ptr != null)
        {
            if ( ptr.random != null) {
                System.out.println("Data = " + ptr.val +
                        ", Random = " + ptr.random.val);
            }else{
                System.out.println("Data = " + ptr.val +
                        ", Random = Null");
            }
            ptr = ptr.next;
        }
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {
        CopyListWithRandomPointer obj = new CopyListWithRandomPointer();

        Node start = new Node(7);
        start.next = new Node(13);
        start.next.next = new Node(11);
        start.next.next.next = new Node(10);
        start.next.next.next.next = new Node(1);

        start.random = null;
        start.next.random = start;
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random = start.next.next;
        start.next.next.next.next.random = start;


        System.out.println("Original List:");
        print(start);
        System.out.println("");
        System.out.println("Cloned List:");
        Node clonedNode = obj.copyRandomList(start);
        print(clonedNode);
        System.out.println("----------------------------------");

        start = new Node(1);
        start.next = new Node(2);
        start.random = start.next;
        start.next.random = start.next;

        System.out.println("Original List:");
        print(start);
        System.out.println("");
        System.out.println("Cloned List:");
        clonedNode = obj.copyRandomList(start);
        print(clonedNode);
        System.out.println("----------------------------------");

        start = new Node(3);
        start.next = new Node(3);
        start.next.next = new Node(3);
        start.random = null;
        start.next.random = start;
        start.next.next.random = null;

        System.out.println("Original List:");
        print(start);
        System.out.println("");
        System.out.println("Cloned List:");
        clonedNode = obj.copyRandomList(start);
        print(clonedNode);
        System.out.println("----------------------------------");

        start = null;
        System.out.println("Original List:");
        print(start);
        System.out.println("");
        System.out.println("Cloned List:");
        clonedNode = obj.copyRandomList(start);
        print(clonedNode);
        System.out.println("----------------------------------");

 }
}