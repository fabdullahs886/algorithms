package com.linkeddlist;

//Given a linked list, rotate the list to the right by k places, where k is non-negative.
//
//        Example 1:
//
//        Input: 1->2->3->4->5->NULL, k = 2
//        Output: 4->5->1->2->3->NULL
//        Explanation:
//        rotate 1 steps to the right: 5->1->2->3->4->NULL
//        rotate 2 steps to the right: 4->5->1->2->3->NULL
//        Example 2:
//
//        Input: 0->1->2->NULL, k = 4
//        Output: 2->0->1->NULL
//        Explanation:
//        rotate 1 steps to the right: 2->0->1->NULL
//        rotate 2 steps to the right: 1->2->0->NULL
//        rotate 3 steps to the right: 0->1->2->NULL
//        rotate 4 steps to the right: 2->0->1->NULL

import java.awt.*;
import java.awt.desktop.PreferencesEvent;

public class RotateList {
    private ListNode rotateRight(ListNode head, int k) {
        //Solution 1(https://www.youtube.com/watch?v=DuzaS_rbLbM)
//        if(head == null || k == 0 || head.next == null) return head;
//
//        ListNode dummy = head;
//        ListNode new_head = null;
//        int len = 0;
//        while(dummy != null){
//            len++;
//            if(dummy.next == null)
//                break;
//            dummy = dummy.next;
//        }
//        dummy = head;
//
//        k = k%len;
//        if( k == 0 || k == len)
//            return head;
//        int a = len - k - 1;
//
//        while(a > 0){
//            dummy = dummy.next;
//            a--;
//        }
//        new_head = dummy.next;
//        dummy.next = null;
//        dummy = new_head;
//        while(dummy != null && dummy.next != null){
//            dummy = dummy.next;
//        }
//        dummy.next = head;
//
//        return new_head;


        // Solution 2 (https://www.youtube.com/watch?v=VX5Fz9z4-CE)
        if(head == null)
            return head;

        ListNode dummy = head;
        int len = 1;

        while(dummy.next != null){
            dummy = dummy.next;
            len++;
        }
        k = k%len;
        if( k == 0)
            return head;

        int a = len - k;
        dummy.next = head;
        ListNode new_dummy = dummy;
        while(a > 0){
            new_dummy = new_dummy.next;
            a--;
        }
        ListNode new_head = new_dummy.next;
        new_dummy.next = null;

        return new_head;

        //Solution 3 (fails for few test case)
//        if(head == null || k == 0)
//            return head;
//        ListNode dummy = head;
//
//        while(dummy.next != null){
//            dummy = dummy.next;
//        }
//        dummy.next = head;
//
//        for(int i = 0; i < k; i++){
//            dummy = dummy.next;
//        }
//        ListNode new_head = dummy.next;
//        dummy.next = null;
//
//        return new_head;

    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public String toString(){
            return "[val = " + val + ", next = " + next + "]";
        }
    }



    public static void main(String[] args) {
        ListNode head = null, node = null;
        RotateList obj = new RotateList();

        head = new ListNode(1);
        head.next  = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(head);
        node = obj.rotateRight(head,2);
        System.out.println(node);

        head = new ListNode(0);
        head.next  = new ListNode(1);
        head.next.next = new ListNode(2);
        System.out.println(head);
        node = obj.rotateRight(head,4);
        System.out.println(node);

        head = null;
        System.out.println(head);
        node = obj.rotateRight(head,0);
        System.out.println(node);

        head = new ListNode(1);
        System.out.println(head);
        node = obj.rotateRight(head,0);
        System.out.println(node);

        head = new ListNode(1);
        System.out.println(head);
        node = obj.rotateRight(head,1);
        System.out.println(node);

        head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(head);
        node = obj.rotateRight(head,1);
        System.out.println(node);

        head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(head);
        node = obj.rotateRight(head,2);
        System.out.println(node);

        head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(head);
        node = obj.rotateRight(head,0);
        System.out.println(node);


    }
}

