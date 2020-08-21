package com.problems.easy;

// Category : Easy
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//        Example 1:
//
//        Input: 1->1->2
//        Output: 1->2
//        Example 2:
//
//        Input: 1->1->2->3->3
//        Output: 1->2->3

import java.util.Arrays;

public class RemoveDuplicatesFromSortedList {

    private ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            if(tmp.val == tmp.next.val){
                tmp.next = tmp.next.next;
            }else{
                tmp = tmp.next;
            }

        }

        return head;
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public String toString(){
            return new String("val=" + val + ", Next=" + next);
        }
    }

    public static void main(String[] args) {
        ListNode node =  null;
        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

        node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        System.out.println(obj.deleteDuplicates(node));

        node =  new ListNode(1);
        node.next = new ListNode(1);
        node.next.next =  new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next  = new ListNode(3);
        System.out.println(obj.deleteDuplicates(node));

        node = new ListNode();
        System.out.println(obj.deleteDuplicates(node));


    }
}
