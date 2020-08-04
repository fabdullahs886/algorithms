package com.linkeddlist;

//Reverse a singly linked list.
//
//        Example:
//
//        Input: 1->2->3->4->5->NULL
//        Output: 5->4->3->2->1->NULL
//        Follow up:
//
//        A linked list can be reversed either iteratively or recursively. Could you implement both?

public class ReverseLinkedList {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
